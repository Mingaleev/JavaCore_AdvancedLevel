package HomeWork_2;

public class MyArraySizeException extends ArrayIndexOutOfBoundsException{
    private int num;

    public MyArraySizeException(int num) {
        this.num = num;
    }

    public MyArraySizeException(String s, int num) {
        super(s);
        this.num = num;
    }

    public int getNum() {
        return num;
    }
}
