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
        double totalAmount = 0;
        int frequentRenterPoint = 0;
        Enumeration<Rental> rentalEnumeration = rentals.elements();
        while (rentalEnumeration.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = rentalEnumeration.nextElement();
            thisAmount = each.getCharge();


            //add frequent renter points
            frequentRenterPoint++;
            //add bonus for a teo day new release rental
            if (each.getMovie().getPriceCode() == Movie.NEW_RELEASE
                    && each.getDaysRented() > 1) {
                frequentRenterPoint++;
            }

            //show figure for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoint) + " frequent renter points";
        return result;
    }

}
