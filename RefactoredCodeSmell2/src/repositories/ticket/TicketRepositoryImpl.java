package repositories.ticket;

import models.Customer;
import models.Ticket;

public class TicketRepositoryImpl implements TicketRepository {

    @Override
    public void bookTicket(Ticket ticket) {
        System.out.println("Memproses pemesanan tiket...");
        showTicketInfo(ticket);
        System.out.println("Pesanan selesai.");
    }

    @Override
    public void cancelTicket(Ticket ticket) {
        System.out.println("Memproses pembatalan tiket...");
        showTicketInfo(ticket);
        System.out.println("Pesanan dibatalkan.");
    }

    @Override
    public void rescheduleTicket(Ticket ticket, String newMovieDate, String newMovieTime) {
        Customer customer = ticket.getCustomer();
        System.out.println("Memproses penggantian jadwal tiket...");
        System.out.println("Pelanggan: " + customer.getName() + ", " + customer.getPhone() + ", " + customer.getEmail());
        System.out.println("Film: " + ticket.getMovieTitle());
        System.out.println("Jadwal lama: " + ticket.getMovieDate() + " jam " + ticket.getMovieTime());
        System.out.println("Jadwal baru: " + newMovieDate + " jam " + newMovieTime);
        System.out.println("Kursi: " + ticket.getSeatNumber());
        System.out.println("Jadwal berhasil diganti.");
    }

    private void showTicketInfo(Ticket ticket) {
        Customer customer = ticket.getCustomer();
        System.out.println("Pelanggan: " + customer.getName() + ", " + customer.getPhone() + ", " + customer.getEmail());
        System.out.println("Film: " + ticket.getMovieTitle() + " pada " + ticket.getMovieDate() + " jam " + ticket.getMovieTime());
        System.out.println("Kursi: " + ticket.getSeatNumber());
    }
}
