package patrones_comportamiento.memento.memento_example;

public class MementoPatternDemo {
    public static void main(String[] args) {
        Document document = new Document();
        DocumentCareTaker careTaker = new DocumentCareTaker();

        // Cambiar contenido del documento y guardar estados
        document.SetContent("Version 1");
        careTaker.addMemento(document.createMemento());

        document.SetContent("Version 2");
        careTaker.addMemento(document.createMemento());

        document.SetContent("Version 3");
        careTaker.addMemento(document.createMemento());

        // Listar todos los estados guardados
        System.out.println("Estados guardados: " + careTaker.getMementoContent());

        // Eliminar un estado
        careTaker.removeMemento(1);

        // Listar todos los estados guardados después de eliminar
        System.out.println("Estados guardados después de eliminar: " + careTaker.getMementoContent());

        // Restaurar estado anterior
        document.restoreFromMemento(careTaker.getMemento(1));
        System.out.println("Contenido restaurado a la version: " + document.getContent());
    }
}