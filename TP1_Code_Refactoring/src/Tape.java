public class Tape extends DomainObject {
    private String _serialNumber;
    private Movie _movie;

    public Tape(String serialNumber, Movie movie) {
        this._serialNumber = serialNumber;
        this._movie = movie;
    }

    public String getSerialNumber() {
        return _serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this._serialNumber = serialNumber;
    }

    public Movie getMovie() {
        return _movie;
    }

    public void setMovie(Movie movie) {
        this._movie = movie;
    }

    public static boolean isAvailable(Tape tape) {
        return true;
    }
}