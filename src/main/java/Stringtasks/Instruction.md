**Part-1: Coding**

1.Write a program to swap 2 String without a temporary variable?
-
2.Find out how many alpha characters are present in a string?
-
3.Reverse a String: Write a function to reverse a given string. For example, given the input "Hello", the output should be "olleH".
-
4.Check if a String is Palindrome: Determine whether a given string is a palindrome, which means it reads the same forwards and backward. For example, "madam" is a palindrome.
-
5.Check if Two Strings are Anagrams: Given two strings, determine if they are anagrams, meaning they contain the same characters in a different order. For example, "listen" and "silent" are anagrams.
-
6.Create a method to count how many vowels are present in a string “documentation”
-
7.Count the Number of Words in a String: Write a function to count the number of words in a given string. Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.
-
8.You have a list of strings, and you want to keep only those that start with “A” and you want to return them in lower case".
-
9.Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating character. For example, in the string "abracadabra", the first non-repeating character is 'c'.
-
10.How can you remove all duplicates from ArrayList?
-



**Solutions**

**Task 1**
1. To swap 2 strings we have to create StringSwapper Class
2. inside main method we have to create 2 variables

            String first = "Hello"; // store Hello into first variable
            String second = "World"; // store World into second variable

3. We have to print the Values before swapping
        
            System.out.println("Before Swap":); // print title
            System.out.println("First = " first); // will print Hello
            System.out.println("Second =" second);  // Will print World

4. we have to swap without a temporary variable as follows: 
            
            first = first + second; // this will combine both string values ("HelloWorld")
            second = first.substring(0,first.lenght() - second.lenght());  //Extract "Hello"
            first = first.substring(second.lenght());  //Extract "World"

5. we have to print the string values after swapping 
    
            System.out.println("\nAfter swap:");
            System.out.println("First = " first); // print "World"
            System.out.println("Second = " second); print "Hello"



**Task 2**

1. To count alpha characters we have to create AlphaCounter class 
2. Inside main method we have to create a variable from string type to store values: 
        
            String str = "HelloASifJan123@!";
3. initialize the counter as follows: 
    
            int count 0; 
4. use an enhance for loop that iterates through each character in the string and use if condition: 
            
            for (char c : str.toCharArray()) //convert string into array of characters
            {
                if(character.isLetter(c))
                    {
                        count++;
                    }
            }
5. print the final count as follows: 
    
            System.out.println("Alpha characters count: " + count);

**Task 3**
1. To reverse string we have to create  StringReverser class
2. we have to create a method and pass parameters as follows: 
        
            public class StringReverser {

                   public  static String reveseString(String str) // method with  string parameter name it str
                         {
                            return new StringBuilder(str).reverse().toString();  
                          }
                   public static void main(String[] args) 
                        {
                          System.out.println(reveseString(("Asif Jan")));

                         } 
            }




**Task 4**

1. To check Palindrome string we have to create PalindromeChecker class 
2. Inside main method which is entry point we have to do the following things: 


        Scanner scanner = new Scanner(System.in); // create scanner to read input from console

        System.out.println("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine().trim();  \\ reading user's input and remove white spaces
        scanner.close(); 

        String CleanedInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); \\ remove all non-alphanumeric characters using regex and convert the string to lowercase
        int left =0;       // start of string from index 0 
        int right =CleanedInput.length()  -1;   // starts at the end of the string (index length -1)
        boolean isPalindrom = true;      // check if the string is a palindrome(initialized true
        while(left < right) //compare values from both ends moving to word center 
        {
            if(CleanedInput.charAt(left) != CleanedInput.charAt(right))
            {
                isPalindrom = false;
                break;
            }
            left++;
            right--;
        }
         // result out put 
        if(isPalindrom)
        {
            System.out.println("'" + input + "' is a palindrome.");
        }
        else
        {
            System.out.println("'" + input + "' is not a palindrome");
        }


**Task 5**

1. To  Anagrams strings we have to create AnagramChecker class: 
2. create a method areAnagrams inside this class as follows:

             public static boolean areAnagrams(String str1, String str2)
                 {
                   if (str1.length() != str2.length()) return false;

                      char[] arr1 = str1.toLowerCase().toCharArray();  //convert string to char arrays for sorting  and lowercase string 
                      char[] arr2 = str2.toLowerCase().toCharArray();

                      //Sort arrays in alphabitical order
                      Arrays.sort(arr1); 
                      Arrays.sort(arr2);
                      return Arrays.equals(arr1, arr2); // compare sorted arrays 

                 }

             public static void main(String[] args)
                 {
                    String s1 = "care";
                    String s2 = "race";
                    System.out.println("Are anagrams: " + areAnagrams(s1, s2));
                 }
  
**Task 6** 

1. To count Vowels we have tro create Vowel counter class
2. Then create countVowels method inside the class as follows: 

            public static int countVowels(String str) 
              {
                 int count = 0; //initialize counter 
                 String vowels = "aeiouAEIOU";  // creating string contains all vowels 
                 for (char c : str.toCharArray()) // convert str to character array and iterates over each character(c)
                   {
                      if (vowels.indexOf(c) != -1) // check if the current character c exist in the vowels return -1 c is not vowel 
                          {
                             count++;
                           }
                    }
                        return count; // return the total number of vowels foun in the string 
                }

             public static void main(String[] args) 
              {
                 String word = "Education"; // create test srting to count vowel
                 System.out.println("Vowel count: " + countVowels(word));
              }

**Task 7** 

1. To count the word we have to create WordCounter class
2. then create a method name it countWord inside the class as Follows:

            public static int countWords(String str) // return word count as integer and take the input string to analyze
                 {
                    if (str == null || str.trim().isEmpty()) return 0; // null/empty check if true rturn 0 no words to count
                     return str.trim().split("[\\s.,;!?]+").length; // split string into words

                  }

            public static void main(String[] args) //entry point 
                 {
                     String test1 = "Hello, world"; //test basic punctuation handling (",")
                     String test2 = "Hello, Asif, Jan"; //test multiple comma seprated words 
                     String test3 = "  Java...is;;fun  "; // test mixed punctuation and spaces 

                     // print results
                     System.out.println("Word count: " + countWords(test1));
                     System.out.println("Word count: " + countWords(test2));
                     System.out.println("Word count: " + countWords(test3));
                  }


**Task 8** 

1. To filter strings which starts with "A" we have to create StringFilter class
2. Then create method name it filerStrings inside this class as follows:

                public static List<String> filterStrings(List<String> strings) //List<string> return a list of string , List<string>strings: takes a list of strings as input 
                   {
                      List<String> result = new ArrayList<>(); // create an empty ArrayList to sotre filtered strings 
                      for(String str : strings)
                        {
                           if(str.startsWith("A")) // check if the curretn string start with uppercase A
                               {
                                  result.add(str.toLowerCase()); //conver the string to lowercase and added to result list
                                }
                        }
                        return result; // return filtered

                    }

                 public static void main(String[] args)
                    {

                      List<String> input = List.of("Apple", "Orange", "Avocado", "Banana", "Apricot");  // create list of test string 
                      System.out.println("Filtered: " + filterStrings(input));  //print result 
                     }


**Task 9**

1. To Implement non-repeating character in given string we have to create NoRepeatingChar class
2. Then we have to create a method name it findFirstNonRepeating as follows: 

                 public static Character findFirstNonRepeating(String str)
                     {
                         Map<Character, Integer> charCount = new LinkedHashMap<>(); // will create LinkedHasMao to store character counts 

                                //counting character occurances 
                               for(char c : str.toCharArray()) // convert string to char array and loops through eacg character 
                                   {
                                       charCount.put(c, charCount.getOrDefault(c, 0) + 1);  //getofDefualt gets the current count or 0 in case character is not in th map yet and increment by 1 
                                    }

                                for(Map.Entry<Character, Integer> entry : charCount.entrySet()) //loops through the map 
                                    {
                                       if(entry.getValue() ==1) //check if any character has a count of 1 
                                          {
                                             return entry.getKey(); // return the first such a character found
                                           }

                                     }
                                      return null;  //return null 
                      }

                  public static void main(String[] args) 
                     {
                          String test = "aabbccddeff"; 
                          System.out.println("First non-repeating: " + findFirstNonRepeating(test));
                     }

**Task 10** 

1. To remove duplicate we have to create  DuplicateRemover class
2. Then create a generic method for removing Duplicates name it removeDuplicates inside the class as follows: 
    
             public static <T> List<T> removeDuplicates(List<T> list) //<T> is a generic type of parameter work wit any type such int , string etc, List<T> will return the sme types as input, list ins input parameter from which to remove duplicates
                 {
                    Set<T> set = new LinkedHashSet<>(list);  // create a new LinkedHasSet  which contains all the element from the input 
                    return new ArrayList<>(set); // create ArrayList from the set and returns it and convert the set block back to a list for the return value 

                  }

              public static void main(String[] args)
                 {
                    List<Integer> numbers = List.of(1,2,2,3,4,4,5); // create immuutable List of Integers with duplicates 
                    System.out.println("Without duplicates: " + removeDuplicates(numbers));  // calls removeDupilcate() method and print result without duplicates
                  }