package patrones_comportamiento.observer.observer_laboratory;

public class Main {
    public static void main(String[] args) {
        NewService newService = new NewService();

        Suscriber suscriber1 = new Suscriber("Juan");
        Suscriber suscriber2 = new Suscriber("Pedro");

        newService.registerObserver(suscriber1);
        newService.registerObserver(suscriber2);

        newService.setLastestNews("Noticia 1: Se acerca una nueva actualización de Java");
        newService.setLastestNews("Noticia 2: Se lanza un nuevo curso de Java");
    }
}
