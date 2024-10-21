package patrones_comportamiento.mediator.mediator_laboratory;

//Interfaz mediator
public interface ChatMediator {
    void sendMessage(Message message, Colleague sender);
    void addUser(Colleague user);
    void removeUser(Colleague user);
    void notifyUsers(String notification);
}
