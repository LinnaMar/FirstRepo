package exxxceptions;

public class Datas {
    public boolean checkInteger(int[] array1, int index) throws EmptyArrayException, ArrayLengthException, NegValueException, CustomLengthException
    {
        if (array1 == null)
            throw new EmptyArrayException();

        if (index > array1.length)
            throw new ArrayLengthException();

        if (index < 0)
            throw new NegValueException();

        if (array1.length > 6)
        throw new CustomLengthException();



        int indexRandom = array1[index];
        if (indexRandom % 2 == 0) {
            System.out.println("Число поделилось на 2 без остатка, оно четное");
            return true;
        }
        System.out.println("Число поделилось на 2 с остатком, оно нечетное");
        return false;
    }

}
