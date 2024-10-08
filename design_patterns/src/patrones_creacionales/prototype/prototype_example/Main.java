package patrones_creacionales.prototype.prototype_example;

public class Main {
    public static void main(String[] args)  {

        try {
            //Creamos un libro original
            Book originalBook = new Book("El principito", "Antoine de Saint-Exupéry");
            System.out.println("Original book: " + originalBook);

            //Clonamos el libro original
            Book clonedBook = originalBook.clone();
            System.out.println("Cloned book: " + clonedBook);

            //Comprobamos que los libros son diferentes
            System.out.println("Are the books the same? " + (originalBook == clonedBook));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
