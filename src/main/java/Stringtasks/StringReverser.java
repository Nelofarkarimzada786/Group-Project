package Stringtasks;

public class StringReverser {

    public  static String reveseString(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
        System.out.println(reveseString(("Asif Jan")));

    }
}
