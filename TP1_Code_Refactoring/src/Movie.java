public abstract class Movie extends DomainObject {
    private String _name;

    public Movie(String name) {
        this._name = name;
    }

    public String getName() {
        return _name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public abstract double calculateAmount(int daysRented);

    public int calculateFrequentRenterPoints(int daysRented) {
        return 1; 
    }
}

class RegularMovie extends Movie {
    public RegularMovie(String name) {
        super(name);
    }

    @Override
    public double calculateAmount(int daysRented) {
        double amount = 2;
        if (daysRented > 2) {
            amount += (daysRented - 2) * 1.5;
        }
        return amount;
    }
}

class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String name) {
        super(name);
    }

    @Override
    public double calculateAmount(int daysRented) {
        return daysRented * 3;
    }

    @Override
    public int calculateFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1; 
    }
}

class ChildrensMovie extends Movie {
    public ChildrensMovie(String name) {
        super(name);
    }

    @Override
    public double calculateAmount(int daysRented) {
        double amount = 1.5;
        if (daysRented > 3) {
            amount += (daysRented - 3) * 1.5;
        }
        return amount;
    }
}