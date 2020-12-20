package HomeWork_Pro_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /*
        * 1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа)
        * */
        Integer[] arr = new Integer[] {5,8,60,3};
        System.out.println(Arrays.toString(arrayRearrange(arr, 0 , 2)));

        /*
         * 2. Написать метод, который преобразует массив в ArrayList;
         * */
        String[] arr1 = new String[] {"Mingaleev","Artur"};
        System.out.println(toArrayList(arr));
        System.out.println(toArrayList(arr1));

        /*
         * 2. Написать метод, который преобразует массив в ArrayList;
         * */

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();

        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box1 = new Box<>();
        box1.addFruit(apple1);
        box1.addFruit(apple2);
        box1.addFruit(apple3);
        box1.addFruit(apple3); // выдаст сообщение что этот фрукт уже в коробке

        Box<Apple> box3 = new Box<>();

        Box<Orange> box2 = new Box<>();
        box2.addFruit(orange1);
        box2.addFruit(orange2);

        System.out.println(box1.compare(box2));
        System.out.println(box3.compare(box2));

        box1.transfer(box3);

        System.out.println(box3.compare(box2));

    }

    public static Object[] arrayRearrange  (Object[] arrObj, int indexA, int indexB){
        Object obj = arrObj[indexA];
        arrObj[indexA] = arrObj[indexB];
        arrObj[indexB] = obj;
        return arrObj;
    }

    public static ArrayList<Object> toArrayList  (Object[] arr){
        return new ArrayList<>(Arrays.asList(arr));
    }
}
