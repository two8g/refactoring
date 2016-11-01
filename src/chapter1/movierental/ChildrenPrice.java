package chapter1.movierental;

/**
 * Created by two8g on 16-11-1.
 */
public class ChildrenPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    public double getCharge(int dayRented) {
        double result=0;
        result += 1.5;
        if (dayRented > 3) {
            result += (dayRented - 3) * 1.5;
        }
        return result;
    }
}
