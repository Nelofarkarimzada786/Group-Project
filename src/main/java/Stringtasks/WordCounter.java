package Stringtasks;

public class WordCounter {
    public static int countWords(String str)
    {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.trim().split("[\\s.,;!?]+").length;

    }

    public static void main(String[] args) {
        String test1 = "Hello, world";
        String test2 = "Hello, Asif, Jan";
        String test3 = "  Java...is;;fun  ";
        System.out.println("Word count: " + countWords(test1));
        System.out.println("Word count: " + countWords(test2));
        System.out.println("Word count: " + countWords(test3));
    }
}
