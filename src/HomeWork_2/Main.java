package HomeWork_2;

public class Main {
    public static void main(String[] args) {

        String[][] arrStr1 = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String[][] arrStr2 = {{"1","2","3","4"},{"1","2","3","4"},{"1","2","3","4"}};
        String[][] arrStr3 = {{"1","2","3","4"},{"1","2","3","H"},{"1","2","3","4"},{"1","2","3","4"}};

        try {
            System.out.println(sumArr(arrStr1));
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }

//        Повторяю код для наглядности в командной строке
        try {
            System.out.println(sumArr(arrStr2));
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }

//        Повторяю код для наглядности в командной строке
        try {
            System.out.println(sumArr(arrStr3));
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }
    }

    static int sumArr  (String[][] arr) throws MyArraySizeException,MyArrayDataException{
        int sum = 0;

        if (arr.length != 4){
            throw new MyArraySizeException("Массив другого размера: "+arr.length, arr.length);
        }
        for (String[] strings : arr) {
            if (strings.length != 4) {
                throw new MyArraySizeException("Массив другого размера: " + strings.length, strings.length);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Недопустимое значение. Координаты [" + i + "][" + j + "]",arr[i][j]);
                }
            }
        }
        return sum;
    }
}
