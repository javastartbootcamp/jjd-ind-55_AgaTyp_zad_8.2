package pl.javastart.task;

import java.util.Arrays;
import java.util.Objects;

public class Orders {
    private Ticket[] tickets = new Ticket[10];
    private int ordersNo = 0;

    private static final String ONLINE_TICKET = "bilet internetowy";
    private static final String STANDARD_TICKET = "bilet standardowy";
    private static final String GIFT_TICKET = "bilet prezentowy";
    private static final double STANDARD_FEE = 5.0;
    private static final double GIFT_FEE = 0.05;

    void addTicket(Ticket ticket) {
        if (ordersNo >= tickets.length) {
            tickets = Arrays.copyOf(tickets, tickets.length * 2);
        }

        if (ordersNo < tickets.length) {
            tickets[ordersNo] = ticket;
            ordersNo++;
        }
    }

    double calcPrice(Ticket ticket) {
        double price;
        String type = ticket.getType();

        if (Objects.equals(type, ONLINE_TICKET)) {
            price = onlinePrice(ticket);
        } else if (Objects.equals(type, STANDARD_TICKET)) {
            price = standardPrice(ticket);
        } else if (Objects.equals(type, GIFT_TICKET)) {
            price = giftPrice(ticket);
        } else {
            System.out.println("Zły typ biletu");
            price = 0.0;
        }
        return price;
    }

    double onlinePrice(Ticket ticket) {
        return ticket.getPrice() - (ticket.getPrice() * ticket.getDiscount());
    }

    double standardPrice(Ticket ticket) {
        return onlinePrice(ticket) + STANDARD_FEE;
    }

    double giftPrice(Ticket ticket) {
        return standardPrice(ticket) + onlinePrice(ticket) * GIFT_FEE;
    }

    String getInfo() {
        String result = "";
        for (int i = 0; i < ordersNo; i++) {
            result = result + tickets[i].getInfo();
            if (Objects.equals(tickets[i].getType(), STANDARD_TICKET)) {
                result = result + standardInfo();
            } else if (Objects.equals(tickets[i].getType(), GIFT_TICKET)) {
                result = result + giftInfo();
            }
            result = result + ", do zapłaty: " + calcPrice(tickets[i]) + "\n";
        }
        return result;
    }

    String standardInfo() {
        return ", opłata manipulacyjna: " + STANDARD_FEE;
    }

    String giftInfo() {
        return standardInfo() + ", opłata za bilet prezentowy: +" + GIFT_FEE * 100 + "%";
    }

}
