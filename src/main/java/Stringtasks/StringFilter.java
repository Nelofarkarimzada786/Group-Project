package Stringtasks;

import java.util.ArrayList;
import java.util.List;

public class StringFilter {
    public static List<String> filterStrings(List<String> strings)
    {
        List<String> result = new ArrayList<>();
        for(String str : strings)
        {
            if(str.startsWith("A"))
            {
                result.add(str.toLowerCase());
            }
        }
        return result;

    }

    public static void main(String[] args) {

        List<String> input = List.of("Apple", "Orange", "Avocado", "Banana", "Apricot");
        System.out.println("Filtered: " + filterStrings(input));
    }

}
