package chapter1.movierental;

/**
 * Created by two8g on 16-11-1.
 */
public class NormalPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NORMAL;
    }

    @Override
    public double getCharge(int dayRented) {
        double result = 0;
        result += 2;
        if (dayRented > 2)
            result += (dayRented - 2) * 1.5;
        return result;
    }
}
