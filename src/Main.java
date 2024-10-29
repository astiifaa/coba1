/**
 * main class untuk menguji / running class ConcertTicket dan Seat
 */
public class Main {
    /**
     * main  method untuk menjalankan program
     * @param args
     */
    public static void main(String[] args) {
        ConcertTicket ticket = new ConcertTicket("Jakarta International Stadium", 1250000, 220);
        Seat number = new Seat(ticket, "CAT A");

        number.showSeatNumber();
        ticket.applyStockAdjustment(10);
        number.showSeatNumber();
    }
}
