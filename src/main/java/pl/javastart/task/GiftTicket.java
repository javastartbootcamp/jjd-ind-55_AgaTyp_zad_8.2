package pl.javastart.task;

import java.text.DecimalFormat;

public class GiftTicket extends StandardTicket{
    private static final double GIFT_FEE = 0.05;

    public GiftTicket(String name, String place, String type, double price, double discount) {
        super(name, place, type, price, discount);
    }

    @Override
    public double calcPrice() {
        double price;
        price = super.calcPrice() + (super.getPrice() - super.getPrice() * super.getDiscount()) * GIFT_FEE;
        return price;
    }

    public String getInfo() {
        return super.getInfo() + ", opłata za bilet prezentowy: +" + GIFT_FEE * 100 + "%";
    }

    public String getCalcPrice() {
//        DecimalFormat df = new DecimalFormat("#.##");
        return ", do zapłaty: " + calcPrice();
    }
}
