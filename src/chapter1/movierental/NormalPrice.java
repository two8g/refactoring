package chapter1.movierental;

/**
 * Created by two8g on 16-11-1.
 */
public class NormalPrice extends Price {
    @Override
    int getPriceCode() {
        return Movie.NORMAL;
    }
}
