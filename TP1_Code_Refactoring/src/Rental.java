public class Rental extends DomainObject {
    private Tape _tape;
    private int _daysRented;

    public Rental(Tape tape, int daysRented) {
        this._tape = tape;
        this._daysRented = daysRented;
    }

    public Tape getTape() {
        return _tape;
    }

    public void setTape(Tape tape) {
        this._tape = tape;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public void setDaysRented(int daysRented) {
        this._daysRented = daysRented;
    }

    public double calculateAmount() {
        return _tape.getMovie().calculateAmount(_daysRented);
    }

    public int calculateFrequentRenterPoints() {
        return _tape.getMovie().calculateFrequentRenterPoints(_daysRented);
    }
}