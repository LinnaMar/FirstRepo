package Inherrrritance;

public class Program {

    public static void main (String[] args) {

        Animal animal = new Animal();
        System.out.println(animal.getTeeth());   //переменную надо обернть в систем аут принт, шоб вывести на экран. Метод и без систем.аут выводит текст на экран
        System.out.println(animal.getName());
    animal.doing();

        Cow burenka = new Cow();

        System.out.println(burenka.getName());
        burenka.setName("Milka");
        System.out.println(burenka.getName());
   burenka.doing();


    }
}

//Я решила изменить имя Люда на Милка. Сделала это внутри главного документа. Сперва вывела геттером на экран имя коровы.
// Потом задала новое имя. Потом вывела новое имя на экран.
// Если внутри файла Кау написать оверрайд метод и попытаться перебить стринговую переменную, так не работает
