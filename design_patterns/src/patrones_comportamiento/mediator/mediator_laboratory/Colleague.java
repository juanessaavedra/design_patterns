package patrones_comportamiento.mediator.mediator_laboratory;

//Interfaz colleague
public interface Colleague {
    void send(String message);
    void receive(String message);
}
