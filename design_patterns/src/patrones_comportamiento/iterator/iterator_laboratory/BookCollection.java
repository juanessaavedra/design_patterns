package patrones_comportamiento.iterator.iterator_laboratory;

/** Clase que implementa el Aggregate */
public class BookCollection  implements Aggregate{
    private String[] books;
    private int size = 0;

    private String author;

    private int year;

    public BookCollection(int maxSize){
        books = new String[maxSize];
    }

    public void addBook(String book, String author, int year){
        if (size < books.length){
            books[size++] = book;
        }
    }

    public String getBookAt(int index){
        if(size < books.length){
            return books[index];
        }
        return null;
    }

    public int getSize(){
        return size;
    }


    @Override
    public Iterator createIterator() {
        return new BookIterator(this);
    }

    @Override
    public Iterator createReverseIterator() {
        return new ReverseBookIterator(this);
    }


}
