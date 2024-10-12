package patrones_estructurales.proxy.proxy_example;

public class Main {
    public static void main(String[] args) {
        FileInterface file = new ProxyFile(("document.pdf"));

        //La descarga no se realiza hasta que se llama al metodo download
        file.download(); //Carga y descarga
        file.download(); //Solo descarga //Sin cargar nuevamente
    }
}
