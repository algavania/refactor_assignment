package models;

public class Ticket {
    private Customer customer;
    private String movieTitle;
    private String movieDate;
    private String movieTime;
    private String seatNumber;

    public Ticket(Customer customer, String movieTitle, String movieDate, String movieTime, String seatNumber) {
        this.customer = customer;
        this.movieTitle = movieTitle;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.seatNumber = seatNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getMovieTitle() {
        return movieTitle;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }
}