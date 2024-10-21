package patrones_comportamiento.mediator.mediator_laboratory;

//Interfaz colleague
public interface Colleague {
    void send(Message message);
    void receive(Message message);
}
