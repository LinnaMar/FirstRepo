package Onlineshop;

public class Main {

    public static void main (String[] args) {

        shopItems noAction = new shopItems();

        System.out.println(noAction.getBlouse() + " по цене " + noAction.getBlousePrice() + ". А " + noAction.getPhone() + " по цене" + noAction.getPhonePrice());

        shopItems newAction = new shopItems();

        newAction.setBlouse("Блузы закончились");
        newAction.setPhonePrice(850);

        System.out.println(newAction.getBlouse() + " а телефон " + newAction.getPhone() + " по акции " + newAction.getPhonePrice());
    }
}
