package chapter1.movierental;

/**
 * Created by two8g on 16-11-1.
 */
public class Movie {

    public final static int NORMAL = 0;
    public final static int CHILDRENS = 1;
    public final static int NEW_RELEASE = 2;

    private String title;
    private Price price;

    public Movie(String title, int priceCode) {
        this.title = title;
        setPriceCode(priceCode);
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return price.getPriceCode();
    }

    public void setPriceCode(int priceCode) {
        switch (priceCode) {
            case NORMAL:
                price = new NormalPrice();
                break;
            case CHILDRENS:
                price = new ChildrenPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
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
        return price.getFrequentRenterPoints(dayRented);
    }
}
