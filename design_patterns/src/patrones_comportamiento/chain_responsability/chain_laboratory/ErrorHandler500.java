package patrones_comportamiento.chain_responsability.chain_laboratory;

public class ErrorHandler500 implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        if(request.equals("500")) {
            System.out.println("Error interno del servidor. Manejado por el Handler 500 ");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
