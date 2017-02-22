package design.observer2;

import design.observer2.CurrentConditionsDisplay;
import design.observer2.WeatherData;

/**
 * Created by chensong on 2017/2/21.
 */
public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay display = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
    }
}
