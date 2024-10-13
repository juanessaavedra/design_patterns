package patrones_comportamiento.chain_responsability.chain_example;

public interface Handler {
    void setNext(Handler handler);
    void handleRequest(String request);
}
