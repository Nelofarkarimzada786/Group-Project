package Stringtasks;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemover {
    public static <T> List<T> removeDuplicates(List<T> list)
    {
        Set<T> set = new LinkedHashSet<>(list);
        return new ArrayList<>(set);

    }

    public static void main(String[] args)
    {
        List<Integer> numbers = List.of(1,2,2,3,4,4,5);
        System.out.println("Without duplicates: " + removeDuplicates(numbers));
    }


}
