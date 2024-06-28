package LeetCodePrograms;
import java.util.HashMap;
import java.util.Map;
public class CharacterRearrangePalindrome {


        public static boolean canFormPalindrome(String s) {
            // Create a map to count occurrences of each character
            Map<Character, Integer> charCountMap = new HashMap<>();

            // Count the frequency of each character in the string
            for (char c : s.toCharArray()) {
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }

            // Count how many characters have an odd frequency
            int oddCount = 0;
            for (int count : charCountMap.values()) {
                if (count % 2 != 0) {
                    oddCount++;
                }
            }

            // A string can form a palindrome if at most one character has an odd frequency
            return oddCount <= 1;
        }

        public static void main(String[] args) {
            String test1 = "civic";
            String test2 = "ivicc";
            String test3 = "hello";
            String test4 = "racer";

            System.out.println(test1 + ": " + canFormPalindrome(test1)); // true
            System.out.println(test2 + ": " + canFormPalindrome(test2)); // true
            System.out.println(test3 + ": " + canFormPalindrome(test3)); // false
            System.out.println(test4 + ": " + canFormPalindrome(test4)); // true
        }
    }


