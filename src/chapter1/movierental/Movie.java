package chapter1.movierental;

/**
 * Created by two8g on 16-11-1.
 */
public class Movie {

    public final static int NORMAL = 0;
    public final static int CHILDRENS = 1;
    public final static int NEW_RELEASE = 2;

    private String title;
    Price price;

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

    public int getFrequentRenterPoint(int dayRented) {
        return price.getFrequentRenterPoints(dayRented);
    }
}
