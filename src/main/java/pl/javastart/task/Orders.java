package pl.javastart.task;

import java.util.Arrays;
import java.util.Objects;

public class Orders {
    private OnlineTicket[] tickets = new OnlineTicket[10];
    private int ordersNo = 0;

    void addTicket(OnlineTicket ticket) {
        if (ordersNo >= tickets.length) {
            tickets = Arrays.copyOf(tickets, tickets.length * 2);
        }

        if (ordersNo < tickets.length) {
            tickets[ordersNo] = ticket;
            ordersNo++;
        }
    }

    String getInfo() {
        String result = "";
        for (int i = 0; i < ordersNo; i++) {
            result = result + tickets[i].getInfo() + tickets[i].getCalcPrice() + "\n";
        }
        return result;
    }

}
