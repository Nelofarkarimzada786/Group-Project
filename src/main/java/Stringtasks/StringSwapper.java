package Stringtasks;

public class StringSwapper {
    public static void main(String[] args) {

        String first = "Hello";
        String second = "world";


        System.out.println("Before swap:");
        System.out.println("First = " + first);
        System.out.println("Second = " + second);


        String temp = first;
        first = second;
        second = temp;

        System.out.println("\nAfter swap:");
        System.out.println("First = " + first);
        System.out.println("Second = " + second);
    }


}
