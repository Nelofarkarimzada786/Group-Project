package Stringtasks;


public class VowelCounter {
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String word = "Education";
        System.out.println("Vowel count: " + countVowels(word));
    }
}