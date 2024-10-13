package patrones_comportamiento.chain_responsability.chain_example;

public class ConcreteHandlerA implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        if(request.equals("A")) {
            System.out.println("Handler A maneja la solicitud A: ");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request); //Recursividad
        }
    }
}
