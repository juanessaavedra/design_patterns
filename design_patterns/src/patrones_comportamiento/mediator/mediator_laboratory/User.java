package patrones_comportamiento.mediator.mediator_laboratory;

//Concrete colleague
public class User implements Colleague {
    private ChatMediator chatMediator;
    private String name;

    public User(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    @Override
    public void send(Message message) {
        System.out.println(this.name + ": Sending Message=" + message.getContent());
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(Message message) {
        System.out.println(this.name + ": Received Message: " + message.getContent());
    }

    public String getName() {
        return name;
    }
}
