package Inherrrritance;

public class Animal {

    private int teeth = 10;
    private String name = "Luda";

    public void doing () {
        System.out.println("I am animal and i sit");  // в этом методе животное чтото делает
    }


    public int getTeeth() {
        return teeth;
    }

    public void setTeeth(int teeth) {
        this.teeth = teeth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

 // 1. Внутри класса пишу приватніе переменніе (інкапсулция). 2. Задаю геттер сеттер кнопкой alt+insert
// 3. Вызову их в Программе
