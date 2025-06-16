package Stringtasks;

public class StringSwapper {
    public static void main(String[] args) {

        String first = "Hello";
        String second = "world";


        System.out.println("Before swap:");
        System.out.println("First = " + first);
        System.out.println("Second = " + second);


       //swap without a temporary variables
        first = first + second; // combine both strings(HelloWorld)
        second = first.substring(0, first.length() - second.length()); //Extract "Hello"

        first = first.substring(second.length()); //Extract "World"

        System.out.println("\nAfter swap:");
        System.out.println("First = " + first);
        System.out.println("Second = " + second);
    }

}
