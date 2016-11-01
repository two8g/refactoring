package chapter1.movierental;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by two8g on 16-11-1.
 */
public class StatementTest {

    private List<Customer> testCustomers() {
        List<Movie> movies = new ArrayList<>(10);
        List<Customer> customers = new ArrayList<>(10);
        movies.add(new Movie("movie0", 0));
        movies.add(new Movie("movie1", 2));
        movies.add(new Movie("movie2", 0));
        movies.add(new Movie("movie3", 0));
        movies.add(new Movie("movie4", 0));
        movies.add(new Movie("movie5", 1));
        movies.add(new Movie("movie6", 0));
        movies.add(new Movie("movie7", 0));
        movies.add(new Movie("movie8", 1));
        movies.add(new Movie("movie9", 2));
        Customer customer0 = new Customer("customer0");
        customers.add(customer0);
        Customer customer1 = new Customer("customer1");
        customers.add(customer1);
        Customer customer2 = new Customer("customer2");
        customers.add(customer2);
        Customer customer3 = new Customer("customer3");
        customers.add(customer3);
        Customer customer4 = new Customer("customer4");
        customers.add(customer4);
        Customer customer5 = new Customer("customer5");
        customers.add(customer5);
        Customer customer6 = new Customer("customer6");
        customers.add(customer6);
        Customer customer7 = new Customer("customer7");
        customers.add(customer7);
        Customer customer8 = new Customer("customer8");
        customers.add(customer8);
        Customer customer9 = new Customer("customer9");
        customers.add(customer9);
        customer7.addRental(new Rental(movies.get(0), 2));
        customer7.addRental(new Rental(movies.get(5), 0));
        customer2.addRental(new Rental(movies.get(6), 3));
        customer6.addRental(new Rental(movies.get(9), 4));
        customer1.addRental(new Rental(movies.get(5), 3));
        customer7.addRental(new Rental(movies.get(9), 4));
        customer4.addRental(new Rental(movies.get(5), 1));
        customer5.addRental(new Rental(movies.get(8), 3));
        customer0.addRental(new Rental(movies.get(4), 2));
        customer3.addRental(new Rental(movies.get(7), 9));
        customer2.addRental(new Rental(movies.get(5), 3));
        customer1.addRental(new Rental(movies.get(6), 2));
        customer4.addRental(new Rental(movies.get(4), 6));
        customer9.addRental(new Rental(movies.get(9), 7));
        customer8.addRental(new Rental(movies.get(0), 6));
        customer7.addRental(new Rental(movies.get(4), 2));
        customer1.addRental(new Rental(movies.get(2), 3));
        customer8.addRental(new Rental(movies.get(6), 7));
        customer3.addRental(new Rental(movies.get(2), 1));
        customer5.addRental(new Rental(movies.get(9), 2));
        customer4.addRental(new Rental(movies.get(9), 5));
        customer7.addRental(new Rental(movies.get(3), 3));
        customer7.addRental(new Rental(movies.get(3), 3));
        customer1.addRental(new Rental(movies.get(8), 1));
        customer1.addRental(new Rental(movies.get(4), 8));
        customer6.addRental(new Rental(movies.get(0), 9));
        customer6.addRental(new Rental(movies.get(8), 0));
        customer3.addRental(new Rental(movies.get(2), 3));
        customer1.addRental(new Rental(movies.get(7), 3));
        customer9.addRental(new Rental(movies.get(9), 5));
        customer5.addRental(new Rental(movies.get(0), 1));
        customer3.addRental(new Rental(movies.get(7), 2));
        customer8.addRental(new Rental(movies.get(0), 6));
        customer5.addRental(new Rental(movies.get(9), 3));
        customer2.addRental(new Rental(movies.get(5), 9));
        customer8.addRental(new Rental(movies.get(8), 0));
        customer3.addRental(new Rental(movies.get(0), 9));
        customer4.addRental(new Rental(movies.get(5), 5));
        customer0.addRental(new Rental(movies.get(4), 1));
        customer0.addRental(new Rental(movies.get(3), 6));
        customer3.addRental(new Rental(movies.get(1), 1));
        customer2.addRental(new Rental(movies.get(7), 4));
        customer6.addRental(new Rental(movies.get(0), 9));
        customer7.addRental(new Rental(movies.get(1), 0));
        customer8.addRental(new Rental(movies.get(9), 3));
        customer0.addRental(new Rental(movies.get(8), 1));
        customer3.addRental(new Rental(movies.get(0), 1));
        customer5.addRental(new Rental(movies.get(5), 4));
        customer0.addRental(new Rental(movies.get(0), 0));
        customer4.addRental(new Rental(movies.get(0), 5));
        return customers;
    }

    @Test
    public void testStatements() {
        String[] results = result.split("\n\n");
        for (int i = 0; i < testCustomers().size(); i++) {
            String new_result = testCustomers().get(i).statement();
            assert results[i].equals(new_result) :
                    "don't match:\n" + results[i] + "\n\n" + new_result;
        }
    }

    @Test
    public void statements() {
        for (Customer customer : testCustomers()) {
            System.out.println(customer.statement() + "\n");
        }
    }

    @Test
    public void random() {
        int NUM_MOVIES = 10;
        int NUM_CUSTOMERS = 10;
        int NUM_RENTALS = 50;
        Random random = new Random();
        System.out.println("List<Movie> movies = new ArrayList<>(" + NUM_MOVIES + ");");
        System.out.println("List<Customer> customers = new ArrayList<>(" + NUM_CUSTOMERS + ");");
        //random movies
        for (int i = 0; i < NUM_MOVIES; i++) {
            System.out.println("movies.add(new Movie(\"movie" + i + "\", " + random.nextInt(3) + "));");
        }
        //random customers
        for (int i = 0; i < NUM_CUSTOMERS; i++) {
            System.out.println("Customer customer" + i + " = new Customer(\"customer" + i + "\");");
            System.out.println("customers.add(customer" + i + ");");
        }
        //random rentals
        for (int i = 0; i < NUM_RENTALS; i++) {
            int r1 = random.nextInt(NUM_CUSTOMERS);
            int r2 = random.nextInt(NUM_MOVIES);
            int r3 = random.nextInt(10);
            System.out.println(String.format("customer%s.addRental(new Rental(movies.get(%s), %s));", r1, r2, r3));
        }
    }

    private static String result = "Retal Record for customer0\n" +
            "\tmovie4\t2.0\n" +
            "\tmovie4\t2.0\n" +
            "\tmovie3\t8.0\n" +
            "\tmovie8\t1.5\n" +
            "\tmovie0\t2.0\n" +
            "Amount owed is 15.5\n" +
            "You earned 5 frequent renter points\n" +
            "\n" +
            "Retal Record for customer1\n" +
            "\tmovie5\t1.5\n" +
            "\tmovie6\t2.0\n" +
            "\tmovie2\t3.5\n" +
            "\tmovie8\t1.5\n" +
            "\tmovie4\t11.0\n" +
            "\tmovie7\t3.5\n" +
            "Amount owed is 23.0\n" +
            "You earned 6 frequent renter points\n" +
            "\n" +
            "Retal Record for customer2\n" +
            "\tmovie6\t3.5\n" +
            "\tmovie5\t1.5\n" +
            "\tmovie5\t10.5\n" +
            "\tmovie7\t5.0\n" +
            "Amount owed is 20.5\n" +
            "You earned 4 frequent renter points\n" +
            "\n" +
            "Retal Record for customer3\n" +
            "\tmovie7\t12.5\n" +
            "\tmovie2\t2.0\n" +
            "\tmovie2\t3.5\n" +
            "\tmovie7\t2.0\n" +
            "\tmovie0\t12.5\n" +
            "\tmovie1\t3.0\n" +
            "\tmovie0\t2.0\n" +
            "Amount owed is 37.5\n" +
            "You earned 7 frequent renter points\n" +
            "\n" +
            "Retal Record for customer4\n" +
            "\tmovie5\t1.5\n" +
            "\tmovie4\t8.0\n" +
            "\tmovie9\t15.0\n" +
            "\tmovie5\t4.5\n" +
            "\tmovie0\t6.5\n" +
            "Amount owed is 35.5\n" +
            "You earned 6 frequent renter points\n" +
            "\n" +
            "Retal Record for customer5\n" +
            "\tmovie8\t1.5\n" +
            "\tmovie9\t6.0\n" +
            "\tmovie0\t2.0\n" +
            "\tmovie9\t9.0\n" +
            "\tmovie5\t3.0\n" +
            "Amount owed is 21.5\n" +
            "You earned 7 frequent renter points\n" +
            "\n" +
            "Retal Record for customer6\n" +
            "\tmovie9\t12.0\n" +
            "\tmovie0\t12.5\n" +
            "\tmovie8\t1.5\n" +
            "\tmovie0\t12.5\n" +
            "Amount owed is 38.5\n" +
            "You earned 5 frequent renter points\n" +
            "\n" +
            "Retal Record for customer7\n" +
            "\tmovie0\t2.0\n" +
            "\tmovie5\t1.5\n" +
            "\tmovie9\t12.0\n" +
            "\tmovie4\t2.0\n" +
            "\tmovie3\t3.5\n" +
            "\tmovie3\t3.5\n" +
            "\tmovie1\t0.0\n" +
            "Amount owed is 24.5\n" +
            "You earned 8 frequent renter points\n" +
            "\n" +
            "Retal Record for customer8\n" +
            "\tmovie0\t8.0\n" +
            "\tmovie6\t9.5\n" +
            "\tmovie0\t8.0\n" +
            "\tmovie8\t1.5\n" +
            "\tmovie9\t9.0\n" +
            "Amount owed is 36.0\n" +
            "You earned 6 frequent renter points\n" +
            "\n" +
            "Retal Record for customer9\n" +
            "\tmovie9\t21.0\n" +
            "\tmovie9\t15.0\n" +
            "Amount owed is 36.0\n" +
            "You earned 4 frequent renter points";
}
