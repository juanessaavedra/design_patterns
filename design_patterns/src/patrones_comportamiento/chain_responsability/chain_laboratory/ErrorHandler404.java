package patrones_comportamiento.chain_responsability.chain_laboratory;

public class ErrorHandler404 implements Handler {
    private Handler nextHandler;

    @Override
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    @Override
    public void handleRequest(String request) {
        if(request.equals("404")) {
            System.out.println("Recurso no encontrado. Manejado por el Handler 404 ");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
