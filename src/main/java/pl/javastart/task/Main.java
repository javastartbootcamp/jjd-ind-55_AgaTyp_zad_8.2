package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Orders orders = new Orders();

//        orders.addTicket(new OnlineTicket("Dziadek do orzechów", "Teatr Narodowy", "bilet internetowy",
//                109.0, 0.1));
//        orders.addTicket(new StandardTicket("Dziadek do orzechów", "Teatr Narodowy", "bilet standardowy",
//                109.0, 0.15));
//        orders.addTicket(new GiftTicket("Dziadek do orzechów", "Teatr Narodowy", "bilet prezentowy",
//                109.0, 0.1));
//        orders.addTicket(new OnlineTicket("koncert Iron Maiden", "Stadion Narodowy", "bilet internetowy",
//                400.0, 0.15));
//
//        System.out.println(orders.getInfo());

        ReadOrders read = new ReadOrders();

        do {
            read.readOrder();
            OnlineTicket ticket = read.createOrder();
            if (ticket != null) {
                orders.addTicket(ticket);
            }
            
        } while (!read.stopReading(read.getAnswer()));

//        System.out.println(orders.getInfo());
    }
}
