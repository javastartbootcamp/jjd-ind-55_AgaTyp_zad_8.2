package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Orders orders = new Orders();

//        orders.addTicket(new Ticket("Dziadek do orzechów", "Teatr Narodowy", "bilet internetowy",
//                109.0, 0.1));
//        orders.addTicket(new Ticket("Dziadek do orzechów", "Teatr Narodowy", "bilet standardowy",
//                109.0, 0.15));
//        orders.addTicket(new Ticket("Dziadek do orzechów", "Teatr Narodowy", "bilet prezentowy",
//                109.0, 0.1));
//        orders.addTicket(new Ticket("koncert Iron Maiden", "Stadion Narodowy", "bilet internetowy",
//                400.0, 0.15));
//
//        System.out.println(orders.getInfo());

        ReadOrders read = new ReadOrders();

        do {
            read.readOrder();
            Ticket ticket = read.createOrder();
            if (ticket != null) {
                orders.addTicket(ticket);
            }

        } while (!read.stopReading(read.getAnswer()));

//        System.out.println(orders.getInfo());
    }
}
