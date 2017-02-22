package design.observer;

/**
 * Created by chensong on 2017/2/21.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperture;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperture = temp;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperture + "F degrees and " + humidity + "% humidity");
    }
}
