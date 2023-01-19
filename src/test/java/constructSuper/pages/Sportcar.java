package constructSuper.pages;

import constructSuper.pages.Car;

public class Sportcar extends Car {
    private int razgon;

    public Sportcar (String marka, int speed, String color, int razgon) {
    super (marka, speed, color);
    this.razgon = razgon;

    }
}


// 3. Добавили переменную Разгон.
// 4. Написали конструктор Спорткар с 4 данными. Чуть ниже указали, что трое данные берутся из суперкласса