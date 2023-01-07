package pl.javastart.task;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class StandardTicket extends OnlineTicket {
    private static final double ADDITIONAL_FEE = 5.0;

    public StandardTicket(String name, String place, String type, double price, double discount) {
        super(name, place, type, price, discount);
    }

    public String getCalcPrice() {
//        DecimalFormat df = new DecimalFormat("#.##");
        return ", do zapłaty: " + calcPrice();
    }

    @Override
    public double calcPrice() {
        double price;
        price = super.calcPrice() + ADDITIONAL_FEE;
        return price;
    }

    public String getInfo() {
        return super.getInfo() + ", opłata manipulacyjna: " + ADDITIONAL_FEE;
    }

}
