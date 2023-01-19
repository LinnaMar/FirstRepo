package GetterNew;

public class Cars {


    private String name = "Tesla";
    private int price = 100000;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
