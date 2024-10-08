package patrones_creacionales.singleton.singleton_laboratory;

public class Singleton {
    // Variable estática que contiene la única instancia de la clase Singleton
    private static Singleton instance;
    private static int contador = 0;

    // Constructor privado para evitar la creación de instancias desde fuera de la clase
    private Singleton(){
        System.out.println("Creating Singleton instance");
    }

    // Método estático que devuelve la única instancia de la clase Singleton
    public static Singleton getInstance(){
        // Si la instancia no ha sido creada, se crea
        if(instance == null){
            instance = new Singleton();
        }
        contador++;
        System.out.println("Contador: " + contador);
        // Se devuelve la instancia única
        return instance;
    }

    // Método de ejemplo que muestra un mensaje
    public void showMessage(){
        System.out.println("Hello from Singleton instance");
    }
}
