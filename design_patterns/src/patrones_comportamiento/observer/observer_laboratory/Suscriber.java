package patrones_comportamiento.observer.observer_laboratory;

public class Suscriber implements Observer {
    private String name;

    public Suscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println("Notificación para " + name + ": " + news);
    }
}
