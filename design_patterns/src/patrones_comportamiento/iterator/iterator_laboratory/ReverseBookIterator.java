package patrones_comportamiento.iterator.iterator_laboratory;

public class ReverseBookIterator implements Iterator {
    private BookCollection collection;
    private int currentIndex;

    public ReverseBookIterator(BookCollection collection){
        this.collection = collection;
        this.currentIndex = collection.getSize() - 1;
    }


    @Override
    public boolean hasNext() {
        return currentIndex >= 0;
    }

    @Override
    public Object next() {
        return collection.getBookAt(currentIndex--);
    }

    @Override
    public Object currentBook() {
        if (currentIndex < 0) {
            return "No hay libro";
        }
        return collection.getBookAt(currentIndex);
    }
}
