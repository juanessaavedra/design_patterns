package patrones_comportamiento.chain_responsability.chain_laboratory;

public class DefaultErrorHandler implements Handler {


    @Override
    public void setNext(Handler handler) {
        //No tiene siguiente handler
    }

    @Override
    public void handleRequest(String request) {
        System.out.println("Error " + request + " no reconocido. Manejado por el Handler por defecto");
    }
}
