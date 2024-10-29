/**
 * merepresentasi concert ticket dengan category,price, dan jumlah stock
 * mengimplementasikan interface TicketDetailsPrinter untuk mencetak detail mengenai tiket
 */
public class ConcertTicket implements TicketDetailsPrinter {
    /**
     * category ticket
     */
    public String location;
    /**
     * harga tiket konser
     */
    public double price;
    /**
     * jumlah stock ticket
     */
    public int stock;

    /**
     * membuat object ConcertTicket dengan category, price, and stock
     * @param location
     * @param price
     * @param stock
     */
    public ConcertTicket(String location, double price, int stock) {
        this.location = location;
        this.price = price;
        this.stock = stock;
    }

    /**
     * mencetak detail tiket termasuk category, price, discounted price, dan jumlah stock.
     */
    public void printTicketDetails() {

        System.out.println("Location: " + location);
        System.out.println("Price: Rp" + price);
        System.out.println("Discounted Price: Rp" + price * 0.8);
        System.out.println("Stock: " + stock);
    }

    /**
     * menyesuaikan jumlah stock berdasarkan nilai penyesuaian yang ditentukan.
     * @param adjustment
     */
    public void applyStockAdjustment(int adjustment) {
        stock += getAdjustment(adjustment);
        System.out.println("Stock adjusted. New stock: " + stock);
    }

    /**
     * mengembalikan nilai penyesuain stock
     *
     * @param adjustment
     * @return
     */
    private static int getAdjustment(int adjustment) {
        return adjustment;
    }
}

/**
 * respresents seat dari tiket konser
 */
class Seat {
    public ConcertTicket ticket;

    /**
     * seat number
     */
    public String seatNumber;

    /**
     * membuat object seat dengan tiket konser dan seat number yang telah ditentukan
     * @param ticket
     * @param seatNumber
     */
    public Seat(ConcertTicket ticket, String seatNumber) {
        this.ticket = ticket;
        this.seatNumber = seatNumber;
    }

    /**
     * menampilkan seat number dan detail dari ticket
     */
    public void showSeatNumber() {
        System.out.println("Category: " + seatNumber);
        ticket.printTicketDetails();
    }
}
