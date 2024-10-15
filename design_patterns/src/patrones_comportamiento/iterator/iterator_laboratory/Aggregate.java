package patrones_comportamiento.iterator.iterator_laboratory;

public interface Aggregate {
    Iterator createIterator();

    Iterator createReverseIterator();
}
