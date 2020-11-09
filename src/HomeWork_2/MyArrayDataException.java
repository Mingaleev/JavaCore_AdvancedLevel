package HomeWork_2;

public class MyArrayDataException extends NumberFormatException{
    String string;

    public MyArrayDataException(String string) {
        this.string = string;
    }

    public MyArrayDataException(String s, String string) {
        super(s);
        this.string = string;
    }

    public String getString() {
        return string;
    }
}
