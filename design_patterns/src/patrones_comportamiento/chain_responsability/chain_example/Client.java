package patrones_comportamiento.chain_responsability.chain_example;

public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        //Configuracion de la cadena de responsabilidad
        handlerA.setNext(handlerB);
        handlerB.setNext(handlerC);

        //Enviamos las solicitudes
        handlerA.handleRequest("A");
        handlerA.handleRequest("B");
        handlerA.handleRequest("C");
        handlerA.handleRequest("D"); //Solicitud no manejada
    }
}
