package Stringtasks;

public class WordCounter {
    public static int countWords(String str)
    {
        if (str == null || str.trim().isEmpty()) return 0;
        return str.split("[\\s.,;!?] +").length;

    }

    public static void main(String[] args) {
        String test = "Hello, Asif, Jan";
        System.out.println("Word count: " + countWords(test));
    }
}
