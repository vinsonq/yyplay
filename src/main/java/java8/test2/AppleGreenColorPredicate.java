package java8.test2;

/**
 * Created by yangyu on 2017/7/24.
 */
public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return "green".equals(apple.getColor());
    }
}
