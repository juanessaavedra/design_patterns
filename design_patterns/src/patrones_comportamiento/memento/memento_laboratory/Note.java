package patrones_comportamiento.memento.memento_laboratory;

public class Note {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public NoteMemento createMemento() {
        return new NoteMemento(content);
    }

    public void restoreFromMemento(NoteMemento memento) {
        content = memento.getContent();
    }
}