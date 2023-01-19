package constructSuper.pages;

public class Car {
    private String marka;
    private int speed;
    private String color;


    public Car (String marka, int speed, String color)
    {
        this.marka = marka;
        this.speed = speed;
        this.color = color;

    }
}

//1. Сперва написали приватные переменные и получили к ним доступ геттерами
// 2. Создали здесь же конструктор, написали в скобках все переменные, без которых нельзя. Потом программе указали, откуда берем эти переменные
