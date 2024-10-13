package patrones_comportamiento.chain_responsability.chain_example;

public class ConcreteHandlerC implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        if(request.equals("C")) {
            System.out.println("Handler C maneja la solicitud C: ");
        } else {
            System.out.println("Nadie puede manejar la solicitud: " + request);
        }
    }
}
