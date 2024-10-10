package patrones_creacionales.singleton.singleton_example;

public class Database {
    private static Database instance;

    private Database() {
        System.out.println("Creating database connection...");
    }

    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }

    public void query(String sql){
        System.out.println("Executing query: " + sql);
    }
}
