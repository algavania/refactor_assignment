package repositories.ticket;

import models.Ticket;

public interface TicketRepository {
    void bookTicket(Ticket ticket);
    void cancelTicket(Ticket ticket);
    void rescheduleTicket(Ticket ticket, String newMovieDate, String newMovieTime);   
}
