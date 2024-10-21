package patrones_comportamiento.memento.memento_example;

//Clase interna Memento
public  class Memento {
    private String content;

    Memento(String content) {
        this.content = content;
    }

    String getContent() {
        return content;
    }
}
