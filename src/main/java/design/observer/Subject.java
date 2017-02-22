package design.observer;

/**
 * Created by chensong on 2017/2/20.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
