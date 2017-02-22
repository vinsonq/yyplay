package design.decorator;

/**
 * Created by chensong on 2017/2/22.
 */
public abstract class Beverage {
    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
