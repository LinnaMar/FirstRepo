package Gettsett;

public class Vtoroyclass {

    public static void main(String[] args) {

        GetSet myObj = new GetSet();
        myObj.getName();

        System.out.println(myObj.getName());

        myObj.setName("Джон стал Катей");
        System.out.println(myObj.getName());
    }
}
