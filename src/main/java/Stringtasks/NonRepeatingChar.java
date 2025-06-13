package Stringtasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatingChar {

        public static Character findFirstNonRepeating(String str)
        {
            Map<Character, Integer> charCount = new LinkedHashMap<>();

            for(char c : str.toCharArray())
            {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }

            for(Map.Entry<Character, Integer> entry : charCount.entrySet())
            {
                if(entry.getValue() ==1)
                {
                    return entry.getKey();
                }

            }
            return null;
        }

    public static void main(String[] args) {
        String test = "aabbccddeff";
        System.out.println("First non-repeating: " + findFirstNonRepeating(test));
    }
    }
