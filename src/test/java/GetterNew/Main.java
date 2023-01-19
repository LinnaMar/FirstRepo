package GetterNew;

public class Main {

    public static void main (String[] args) {


        Cars cars = new Cars();

        cars.setPrice(90000);  //так пишется число, внутри скобок

        System.out.println( cars.getName()+" сегодня по скидке "+cars.getPrice());

    }
}
