package packageConstructor;

public class Car {

    String model;
    int engineVolume;
    String buyer;
    int year;
    int maxSpeed;
                         //описіваю все дані про машину

    public Car (String model, String buyer, int year) {
        this.model =model;
        this.buyer =buyer;
        this.year =year;
        }
                            // надо указать, что данні внутри конструктора связани с данними в верхнем щаблоне. Потому используем this A = a


    public Car(String model, String buyer) {
        this.model =model;
        this.buyer =buyer;
    }
                            //описую требуемие дані про авто, без яких не можна
                            //создала 2 конструктора.

    public static void main (String[] args){

        Car tesla = new Car("A", "A"); //интересно, что тут можна писать что угодно, данние возьмут с низу

        tesla.model = "tesla C3";
        tesla.buyer = "Мистер ";
        tesla.maxSpeed = 200;

        Car lada = new Car("ww", "ww", 2);  // внутри скобок пиши только данніе в кавічках а программа сама подставит то что серім

        lada.model = "priora";
        lada.buyer = "rrr";
        lada.year = 3;
        lada.engineVolume = 10;

    System.out.println ("Авто " + tesla.model + " купив " + tesla.buyer);
    System.out.println (tesla.maxSpeed + " i " + lada.engineVolume);
    System.out.println ("Авто " + lada.model + " купив " + lada.buyer + lada.year);


    }
    }
