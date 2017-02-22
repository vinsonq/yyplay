package design.decorator;

/**
 * Created by chensong on 2017/2/22.
 */
public class Soy extends CondimentDecorator {

    Beverage beverage = null;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
