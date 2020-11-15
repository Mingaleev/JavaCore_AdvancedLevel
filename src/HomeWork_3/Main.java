package HomeWork_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<String>();
        words.add("Lena");
        words.add("Maria");
        words.add("Artur");
        words.add("Ruslan");
        words.add("Ildar");
        words.add("Aliya");
        words.add("Landish");
        words.add("Lena");
        words.add("Artur");
        words.add("Tanya");
        words.add("Lena");
        words.add("Artur");
        words.add("Ruslan");
        words.add("Ilya");
        words.add("Ildar");
        words.add("Lena");

        Map <String,Integer> mapWords = new HashMap<>();

        for (String word : words) {
            Integer value = mapWords.getOrDefault(word, 0);
            mapWords.put(word, value + 1);
        }

        System.out.println(mapWords);


        Telephones tel = new Telephones();

        tel.newNumber("Artur", "+79270001122");
        tel.newNumber("Artur", "+79270001123");
        tel.newNumber("Lena", "+79270001144");
        tel.newNumber("Ruslan", "+79270099144");

        tel.getNumber("Artur");
        tel.getNumber("Ruslan");

    }
}
