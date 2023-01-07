package pl.javastart.task;

public class OnlineTicket {
    private static int ticketId = 0;
    private String name;
    private String place;
    private String type;
    private double price;
    private double discount;

    public OnlineTicket(String name, String place, String type, double price, double discount) {
        this.name = name;
        this.place = place;
        this.type = type;
        this.price = price;
        this.discount = discount;

        ticketId++;
    }

    public double calcPrice() {
        double price;
        price = this.price - (this.price * this.discount);

        return price;
    }

    public String getInfo() {
        return "Bilet na: " + name + ", miejsce: " + place + ", typ biletu: " + type + ", cena podstawowa: " + price
                + ", zniżka: " + discount * 100 + "%";
    }

    public String getCalcPrice() {
        return ", do zapłaty: " + calcPrice();
    }

    public static int getTicketId() {
        return ticketId;
    }

    public static void setTicketId(int ticketId) {
        OnlineTicket.ticketId = ticketId;
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
