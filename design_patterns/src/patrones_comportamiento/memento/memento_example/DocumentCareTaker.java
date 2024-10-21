package patrones_comportamiento.memento.memento_example;

import java.util.ArrayList;
import java.util.List;

public class DocumentCareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void addMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int index) {
        return mementoList.get(index);
    }

    public void removeMemento(int index) {
        mementoList.remove(index);
    }

    public List<String> getMementoContent() {
        List<String> mementoContent = new ArrayList<>();
        for (Memento memento : mementoList) {
            mementoContent.add(memento.getContent());
        }
        return mementoContent;
    }
}
