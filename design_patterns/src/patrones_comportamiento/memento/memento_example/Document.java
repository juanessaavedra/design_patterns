package patrones_comportamiento.memento.memento_example;

//Clase que representa el originitar
public class Document {
    private String content;

    public void SetContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    //Crea un memento que guarda el estado actual del documento
    public Memento createMemento() {
        return new Memento(content);
    }

    //Restaura el estado del documento a partir de un memento
    public void restoreFromMemento(Memento memento) {
        content = memento.getContent();
    }
}
