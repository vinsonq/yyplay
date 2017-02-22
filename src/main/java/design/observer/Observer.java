package design.observer;

/**
 * Created by chensong on 2017/2/20.
 */
public interface Observer {
    public void update(float temp, float humidity, float pressure);
}
