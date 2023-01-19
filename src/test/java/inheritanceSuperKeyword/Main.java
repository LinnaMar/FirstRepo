package inheritanceSuperKeyword;

public class Main {
        public static void main(String[] args) {
            Animal myDog = new Dog();
            myDog.animalSound(); // выйдут на экран 2 метода, и суперкласовый, и новый
        }
    }

