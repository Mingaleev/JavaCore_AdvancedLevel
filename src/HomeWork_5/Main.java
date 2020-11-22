package HomeWork_5;

import java.util.Arrays;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF  = SIZE/2;

    public static void main(String[] args) {
        System.out.println("Первый метод занял " + metod1() + " мсек");
        System.out.println("Второй метод занял " + metod2() + " мсек");
    }

    public static long metod1(){
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
            for (int i = 0; i < arr.length; i++) {
              arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        return System.currentTimeMillis()-a;
    }

    public static long metod2(){
        float[] arr = new float[SIZE];
        Arrays.fill(arr, 1);

        long a = System.currentTimeMillis();

        float[] arrA = new float[HALF];
        float[] arrB = new float[HALF];
        System.arraycopy(arr,0,arrA,0,HALF);
        System.arraycopy(arr,HALF,arrB,0,HALF);

        Thread potok1 = new Thread(() -> {
            for (int i = 0; i < arrA.length; i++) {
                arrA[i] = (float)(arrA[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        Thread potok2 = new Thread(() -> {
            for (int i = 0; i < arrB.length; i++) {
                arrB[i] = (float)(arrB[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            }
        });

        potok1.start();
        potok2.start();

        try {
            potok1.join();
            potok2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(arrA,0,arr,0,HALF);
        System.arraycopy(arrB,0,arr,HALF,HALF);
        return System.currentTimeMillis()-a;
    }
}
