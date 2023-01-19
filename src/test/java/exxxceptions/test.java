package exxxceptions;

//Задача:создать 3 массива, и тест, которій делит на 2 указанное число в каждом массиве. Если нет остатка (число четное), вернется значение true
//Это всё идет циклом. В консоль віведутся результаті теста. В процессе мы еще создали разные кастомные ошибки и поведение программы при каждой из них

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test {

    Datas datas = new Datas();

    @DataProvider
            public Object [][] integerTestingDataProvider ()
    {
        int [] array1 = {20, 205, 22, 55, 205, 22,};

        int [] array2 = {21, 25, 92, 55, 56, 57};

        int [] array3 = {33, 20, 44, 205, 22, 55};

         return new Object [] []
        {
            {array1, 2, true},
            {array2, 1, false},
            {array3, 1, true},
        };

    }


    @Test (dataProvider = "integerTestingDataProvider")
    public void isIntegerDatas (int[] array, int index, boolean result) throws EmptyArrayException, ArrayLengthException, NegValueException, CustomLengthException
    {
        Assert.assertEquals(datas.checkInteger(array, index), result);

    }

}
