package part4_pizza;

// 4.1. Pizza class
public class Pizza {
    private int price;
    private String name;

    public Pizza(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String info() {
        return name + " - " + price + " UAH";
    }
}
