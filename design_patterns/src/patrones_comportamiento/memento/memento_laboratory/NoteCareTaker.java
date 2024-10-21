package patrones_comportamiento.memento.memento_laboratory;

import java.util.ArrayList;
import java.util.List;

public class NoteCareTaker {
    private final List<NoteMemento> mementoList = new ArrayList<>();

    public void addMemento(NoteMemento memento) {
        mementoList.add(memento);
    }

    public NoteMemento getMemento(int index) {
        return mementoList.get(index);
    }

    public void removeMemento(int index) {
        if (index >= 0 && index < mementoList.size()) {
            mementoList.remove(index);
        }
    }

    public List<String> listMementos() {
        List<String> states = new ArrayList<>();
        for (NoteMemento memento : mementoList) {
            states.add(memento.getContent());
        }
        return states;
    }
}
