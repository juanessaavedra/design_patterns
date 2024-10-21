package patrones_comportamiento.mediator.mediator_laboratory;

import java.util.ArrayList;
import java.util.List;

//Implementar la clase ConcreteMediator
public class ChatMediatorImpl implements ChatMediator {
    private List<Colleague> users;

    public ChatMediatorImpl() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(Message message, Colleague sender) {
        for (Colleague user : users) {
            if (user != sender) {
                user.receive(message);
            }
        }
    }

    @Override
    public void addUser(Colleague user) {
        this.users.add(user);
        notifyUsers("User " + ((User) user).getName() + " has joined the chat.");
    }

    @Override
    public void removeUser(Colleague user) {
        this.users.remove(user);
        notifyUsers("User " + ((User) user).getName() + " has left the chat.");
    }

    @Override
    public void notifyUsers(String notification) {
        for (Colleague user : users) {
            user.receive(new TextMessage(notification));
        }
    }
}
