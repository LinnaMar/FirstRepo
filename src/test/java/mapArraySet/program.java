package mapArraySet;

import java.util.HashMap;
import java.util.Map;

public class program {

    public static void main (String [] args) {

    Map<String, Integer> map = new HashMap<String, Integer>();

    map.put("Basil", 1);
    map.put("Kate", 2);
    map.put("Lena", 3);

        for (Map.Entry <String, Integer> m : map.entrySet())  // указиваем вход в наш массив, и ета конструкция подходит чтоб перебирать мапу
                map.replace("Lena", 500);

        for (Map.Entry <String, Integer> m : map.entrySet())
        System.out.println(m.getKey() + m.getValue());  // вивести кей и значення


        int a = map.size();
        if (a == 3) {
            System.out.println("Масив = 3 і це вірно");
        } else {
            System.out.println("Масив не = 3 і це помилка");
        }




        }
    }

