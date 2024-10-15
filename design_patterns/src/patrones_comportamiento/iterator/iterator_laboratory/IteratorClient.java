package patrones_comportamiento.iterator.iterator_laboratory;

public class IteratorClient {
    public static void main(String[] args) {
        //Cear una coleccion de libros
        BookCollection bookCollection = new BookCollection(5);
        bookCollection.addBook("Libro 1", "Autor1", 1);
        bookCollection.addBook("Libro 2", "Autor2", 2);
        bookCollection.addBook("Libro 3", "Autor3", 3);

        //Crear un iterador
        Iterator iterator = bookCollection.createIterator();

        //Crear iterador inverso
        Iterator reverseIterator = bookCollection.createReverseIterator();


        //Usar el iterador para recorrer los libros

        while (iterator.hasNext()){
            String book = (String) iterator.next();
            System.out.println("Libro: " + book);
            System.out.println("Libro actual: " + iterator.currentBook());
        }

        System.out.println("----------------");
        System.out.println("Iterador inverso");

        //Iterador inverso
        while(reverseIterator.hasNext()){
            String book = (String) reverseIterator.next();
            System.out.println("Libro:" + book);
            System.out.println("Libro actual:" + reverseIterator.currentBook());
        }
    }
}
