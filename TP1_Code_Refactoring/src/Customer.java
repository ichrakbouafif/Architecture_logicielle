import java.util.Enumeration;
import java.util.Vector;
public class Customer extends DomainObject {
    private Vector<Rental> _rentals = new Vector<>();
    private String _name;

    public Customer(String name) {
        this._name = name;
    }
    public String getName() {
        return _name;
    }
    public void setName(String name) {
        this._name = name;
    }

    public void addRental(Rental rental) {
        _rentals.add(rental);
    }
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = rentals.nextElement();

            double thisAmount = each.calculateAmount();
            totalAmount += thisAmount;
            frequentRenterPoints += each.calculateFrequentRenterPoints();

            result += "\t" + each.getTape().getMovie().getName() + "\t" + String.valueOf(thisAmount) + "\n";
        }
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) + " frequent renter points\n";
        return result;
    }
}