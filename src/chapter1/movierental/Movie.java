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

    public double getCharge(int dayRented) {
        double result = 0;
        //determine amounts for each line
        switch (getPriceCode()) {
            case NORMAL:
                result += 2;
                if (dayRented > 2)
                    result += (dayRented - 2) * 1.5;
                break;
            case CHILDRENS:
                result += 1.5;
                if (dayRented > 3) {
                    result += (dayRented - 3) * 1.5;
                }
                break;
            case NEW_RELEASE:
                result += dayRented * 3;
                break;
        }
        return result;
    }

    public int getFrequentRenterPoint(int dayRented) {
        //add bonus for a teo day new release rental
        if (priceCode == NEW_RELEASE && dayRented > 1) {
            return 2;
        }
        return 1;
    }
}
