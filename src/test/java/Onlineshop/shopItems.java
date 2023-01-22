package Onlineshop;

public class shopItems {

    private String blouse = "Розовая блуза1";
    private String phone = "Айфон 11";

    private int blousePrice = 100;
    private int phonePrice = 1000;

    public String getBlouse() {
        return blouse;
    }

    public int getBlousePrice() {
        return blousePrice;
    }

    public void setBlouse(String blouse) {
        this.blouse = blouse;
    }

    public void setBlousePrice(int blousePrice) {
        this.blousePrice = blousePrice;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPhonePrice() {
        return phonePrice;
    }

    public void setPhonePrice(int phonePrice) {
        this.phonePrice = phonePrice;
    }
}
