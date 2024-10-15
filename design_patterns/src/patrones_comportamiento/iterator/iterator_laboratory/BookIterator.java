package patrones_comportamiento.iterator.iterator_laboratory;

/** Clase que implementa el iterator */
public class BookIterator implements Iterator {
    private BookCollection collection;
    private int currentIndex = 0;

    public BookIterator(BookCollection collection){
        this.collection = collection;
    }


    @Override
    public boolean hasNext() {
        return currentIndex < collection.getSize();
    }

    @Override
    public Object next() {
        return collection.getBookAt(currentIndex++);
    }

    @Override
    public Object currentBook() {
        if(currentIndex < collection.getSize()){
            return collection.getBookAt(currentIndex);
        }
        return "No hay libro";
    }


}
