package patrones_comportamiento.mediator.mediator_laboratory;

//Concrete colleague
public class User implements Colleague {

    private ChatMediator chatMediator;
    private String name;

    public User(ChatMediator chatMediator, String name){
        this.chatMediator = chatMediator;
        this.name = name;
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + ": Sending Message=" + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + ": Received Message:" + message);
    }
}
