package patrones_comportamiento.chain_responsability.chain_laboratory;

public class Main {
    public static void main(String[] args) {
        Handler errorHandler404 = new ErrorHandler404();
        Handler errorHandler500 = new ErrorHandler500();
        Handler defaultHandler = new DefaultErrorHandler();

        errorHandler404.setNext(errorHandler500);
        errorHandler500.setNext(defaultHandler);

        errorHandler404.handleRequest("404");
        errorHandler404.handleRequest("500");
        errorHandler404.handleRequest("200");


    }
}
