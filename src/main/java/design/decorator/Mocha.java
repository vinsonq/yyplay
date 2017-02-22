package design.decorator;

/**
 * Created by chensong on 2017/2/22.
 */
public class Mocha extends CondimentDecorator {

    Beverage beverage = null;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + beverage.cost();
    }
}
