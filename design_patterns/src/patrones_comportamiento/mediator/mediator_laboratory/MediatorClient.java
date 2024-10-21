package patrones_comportamiento.mediator.mediator_laboratory;

public class MediatorClient {
    public static void main(String[] args) {
        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new User(mediator, "Juan");
        User user2 = new User(mediator, "Pedro");
        User user3 = new User(mediator, "Maria");
        User user4 = new User(mediator, "Ana");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send(new TextMessage("Hola a todos"));
        user2.send(new TextMessage("Hola Juan"));
        user3.send(new ImageMessage("http://example.com/image.jpg"));

        mediator.removeUser(user4);
    }
}