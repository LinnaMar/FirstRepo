package StaticNonstatic;

class Util {
    static int counter = 0;

        public Util() {
            counter++;
        }
        public void getCount() {
            System.out.println("Total number of Util instances so far: " + counter);
        }
}

//Чтобы продемонстрировать разницу между статическими и нестатическими переменными-членами,
// удалите ключевое слово static из переменной счетчика и обратите внимание на разницу в выводе: