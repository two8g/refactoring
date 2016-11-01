package chapter1.movierental;

/**
 * Created by two8g on 16-11-1.
 */
public class Movie {

    public final static int NORMAL = 0;
    public final static int CHILDRENS = 1;
    public final static int NEW_RELEASE = 2;

    private String title;
    private int priceCode;

    public Movie(String title, int _priceCode) {
        this.title = title;
        this.priceCode = _priceCode;
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int priceCode) {
        this.priceCode = priceCode;
    }
}
