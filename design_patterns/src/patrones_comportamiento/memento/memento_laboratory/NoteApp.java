package patrones_comportamiento.memento.memento_laboratory;

public class NoteApp {
    public static void main(String[] args) {
        Note note = new Note();
        NoteCareTaker careTaker = new NoteCareTaker();

        // Cambiar contenido de la nota y guardar estados
        note.setContent("Nota 1");
        careTaker.addMemento(note.createMemento());

        note.setContent("Nota 2");
        careTaker.addMemento(note.createMemento());

        note.setContent("Nota 3");
        careTaker.addMemento(note.createMemento());

        // Listar todos los estados guardados
        System.out.println("Estados guardados: " + careTaker.listMementos());

        // Eliminar un estado
        careTaker.removeMemento(1);

        // Listar todos los estados guardados después de eliminar
        System.out.println("Estados guardados después de eliminar: " + careTaker.listMementos());

        // Restaurar estado anterior
        note.restoreFromMemento(careTaker.getMemento(1));
        System.out.println("Contenido restaurado a la version: " + note.getContent());

    }
}
