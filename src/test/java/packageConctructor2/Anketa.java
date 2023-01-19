package packageConctructor2;

public class Anketa {

    String name;
    String eyecolor;
    int age;
    int height;
    int weight;

        public Anketa(String name, int age) {
        this.name = name;
        this.age = age;
        }

    public static void main (String[] args) {


    Anketa jobApplicaton = new Anketa("Tina", 19);

    jobApplicaton.name = "Tina";
    jobApplicaton.age = 19;

    Anketa driverSchoolAnketa = new Anketa("ddd",  20);
    driverSchoolAnketa.name = "Lola";

    System.out.println (jobApplicaton.name + " йде на роботу бо їй " +jobApplicaton.age);
    System.out.println (driverSchoolAnketa.name + " йде на водіння у " +jobApplicaton.age);

    }
}
