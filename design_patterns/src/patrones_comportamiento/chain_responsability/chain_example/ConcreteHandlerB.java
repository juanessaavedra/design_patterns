package patrones_comportamiento.chain_responsability.chain_example;

public class ConcreteHandlerB implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        if(request.equals("B")) {
            System.out.println("Handler B maneja la solicitud B: ");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
