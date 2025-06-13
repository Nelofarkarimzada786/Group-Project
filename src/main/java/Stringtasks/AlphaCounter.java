package Stringtasks;

public class AlphaCounter {
    public static void main(String[] args) {
    String str  = "HelloAsifJan123@!";
    int count =0;

    for(char c : str.toCharArray())
    {
        if (Character.isLetter(c))
        {
            count++;
        }
    }
        System.out.println("Alpha characters count: " + count);
    }
}
