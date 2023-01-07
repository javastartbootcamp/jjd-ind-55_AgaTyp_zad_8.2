package pl.javastart.task;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class ReadOrders {
    String name;
    String place;
    int type;
    double price;
    double discount;
    String answer = "n";

    private static final int ADD_ONLINE = 1;
    private static final int ADD_STANDARD = 2;
    private static final int ADD_GIFT = 3;

    private Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);

    public void close() {
        sc.close();
    }

    public boolean stopReading(String answer) {

        if (Objects.equals(answer, "t")) {
            close();
            System.out.println("Koniec programu");
            return true;
        }
        return false;
    }

    public void readOrder() {
        System.out.println("Podaj nazwę: ");
        name = sc.nextLine();
        System.out.println("Podaj miejsce: ");
        place = sc.nextLine();
        System.out.println("Podaj typ biletu: ");
        System.out.println(ADD_ONLINE + "-bilet internetowy");
        System.out.println(ADD_STANDARD + "-bilet standardowy");
        System.out.println(ADD_GIFT + "-bilet prezentowy");
        type = sc.nextInt();
        sc.nextLine();
        System.out.println("Podaj cenę biletu: ");
        price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Podaj zniżkę (0-1): ");
        discount = sc.nextDouble();
        sc.nextLine();
        System.out.println("Czy zakończyć? (t/n): ");
        answer = sc.nextLine();

    }

    public OnlineTicket createOrder() {
        if (type == ADD_ONLINE){
           return new OnlineTicket(name, place, "bilet internetowy", price, discount);
        } else if (type == ADD_STANDARD) {
           return new StandardTicket(name, place, "bilet standardowy", price, discount);
        } else if (type == ADD_GIFT) {
           return new GiftTicket(name, place, "bilet prezentowy", price, discount);
        } else {
            System.out.println("Nie ma takiego typu biletu.");
        }
        return null;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
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

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
