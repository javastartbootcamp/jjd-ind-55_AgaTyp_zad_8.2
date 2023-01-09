package pl.javastart.task;

public class Ticket {
    private static int ticketNo = 0;
    private int ticketId;
    private String name;
    private String place;
    private String type;
    private double price;
    private double discount;
    
    public Ticket(String name, String place, String type, double price, double discount) {
        this.name = name;
        this.place = place;
        this.type = type;
        this.price = price;
        this.discount = discount;
        this.ticketId = ticketNo;

        ticketNo++;
    }

    public String getInfo() {
        return "id biletu: " + ticketId + ", bilet na: " + name + ", miejsce: " + place + ", typ biletu: " + type + ", cena podstawowa: " + price
                + ", zniżka: " + discount * 100 + "%";
    }

    public static int getTicketNo() {
        return ticketNo;
    }

    public static void setTicketNo(int ticketId) {
        Ticket.ticketNo = ticketId;
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

}
