import models.Ticket;
import repositories.ticket.TicketRepository;

public class TicketBooking {
    private TicketRepository ticketRepository;

    public TicketBooking(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public void bookTicket(Ticket ticket) {
        ticketRepository.bookTicket(ticket);
    }

    public void cancelTicket(Ticket ticket) {
        ticketRepository.cancelTicket(ticket);
    }

    public void rescheduleTicket(Ticket ticket, String newMovieDate, String newMovieTime) {
        ticketRepository.rescheduleTicket(ticket, newMovieDate, newMovieTime);
    }
}
