package Stringtasks;

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine().trim();
        scanner.close();

        String CleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left =0;
        int right =CleanedInput.length()  -1;
        boolean isPalindrom = true;
        while(left < right)
        {
            if(CleanedInput.charAt(left) != CleanedInput.charAt(right))
            {
                isPalindrom = false;
                break;
            }
            left++;
            right--;
        }

        if(isPalindrom)
        {
            System.out.println("'" + input + "' is a palindrome.");
        }
        else
        {
            System.out.println("'" + input + "' is not a palindrome");
        }

    }
}
