package patrones_comportamiento.mediator.mediator_laboratory;

//Interfaz mediator
public interface ChatMediator {
    void sendMessage(String message, Colleague colleague);
    void addUser(Colleague colleague);
}
