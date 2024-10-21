package patrones_comportamiento.observer.observer_laboratory;

import java.util.ArrayList;
import java.util.List;

public class NewService implements Subject{
    private List<Observer> observers;
    private String lastestNews;

    public NewService() {
        this.observers = new ArrayList<>();
    }

    public void setLastestNews(String news) {
        this.lastestNews = news;
        notifyObservers();
    }


    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(lastestNews);
        }
    }
}
