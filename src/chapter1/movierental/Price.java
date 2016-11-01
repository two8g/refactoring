package chapter1.movierental;

/**
 * Created by two8g on 16-11-1.
 */
public abstract class Price {
    abstract int getPriceCode();

    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
