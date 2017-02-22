package design.decorator;

/**
 * Created by chensong on 2017/2/22.
 */
public class Whip extends CondimentDecorator {

    Beverage beverage = null;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.1 + beverage.cost();
    }
}
