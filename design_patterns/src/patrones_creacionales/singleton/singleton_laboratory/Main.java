package patrones_creacionales.singleton.singleton_laboratory;

public class Main {
    public static void main(String[] args) {
        // Se obtiene la unica instancia de la clase Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        Singleton singleton1 = Singleton.getInstance();
        singleton1.showMessage();
    }
}
