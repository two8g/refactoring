package chapter1.movierental;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by two8g on 16-11-1.
 */
public class Customer {
    private String name;
    private Vector<Rental> rentals = new Vector<Rental>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    public Vector<Rental> getRentals() {
        return rentals;
    }

    public String statement() {
        String result = "Retal Record for " + getName() + "\n";
        Enumeration<Rental> rentalEnumeration = rentals.elements();
        while (rentalEnumeration.hasMoreElements()) {
            Rental each = rentalEnumeration.nextElement();
            //show figure for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(each.movie.getPrice().getCharge(each.getDaysRented())) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoint()) + " frequent renter points";
        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        Enumeration<Rental> rentalEnumeration = rentals.elements();
        while (rentalEnumeration.hasMoreElements()) {
            Rental each = rentalEnumeration.nextElement();
            result += each.movie.getPrice().getCharge(each.getDaysRented());
        }
        return result;
    }

    private int getTotalFrequentRenterPoint() {
        int result = 0;
        Enumeration<Rental> rentalEnumeration = rentals.elements();
        while (rentalEnumeration.hasMoreElements()) {
            Rental each = rentalEnumeration.nextElement();
            result += each.movie.getFrequentRenterPoint(each.getDaysRented());
        }
        return result;
    }
}
