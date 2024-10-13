package patrones_comportamiento.chain_responsability.chain_laboratory;

public interface Handler {
    void setNext(Handler handler);
    void handleRequest(String request);
}
