package HomeWork_3;

import java.util.*;

public class Telephones {
    private Map <String, Set<String>> map = new TreeMap<>();


    public void newNumber(String name, String number) {
        Set<String> tel = map.getOrDefault(name , new HashSet<>());
        tel.add(number);
        map.put(name,tel);
    }

    public void print (){
        System.out.println(map);
    }

    public void getNumber (String name){
        System.out.println(name + " " +map.get(name));
    }

}
