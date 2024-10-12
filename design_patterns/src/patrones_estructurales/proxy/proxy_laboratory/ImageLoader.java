package patrones_estructurales.proxy.proxy_laboratory;

public class ImageLoader {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("image1.png");
        Image image2 = new ProxyImage("image2.png");

        //La imagen solo carga cuando se llama a display
        System.out.println("Primera visualizacion de imagen1");
        image1.display();

        System.out.println("---------------");

        System.out.println("Llamando por segunda vez a display()"); //Ya no aparece cargando
        image1.display();

        System.out.println("---------------");

        System.out.println("Primera visualizacion de imagen2");
        image2.display();


    }
}
