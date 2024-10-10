package patrones_creacionales.singleton.singleton_example;

public class Main {
    public static void main(String[] args) {
        //Obtener la unica instancia
        Database database = Database.getInstance();
        database.query("SELECT * FROM users");
    }
}
