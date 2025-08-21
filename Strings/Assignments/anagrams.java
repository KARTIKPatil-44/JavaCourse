package Assignments;

import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {
        String str1 = "earth";
        String str2 = "heart";

        // 1) convert them to lowercase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        // 2) check both the str lenght are same
        if (str1.length() == str2.length()) {

            // 3) convert the strings to charArray
            char[] str1charArray = str1.toCharArray();
            char[] str2CharArray = str2.toCharArray();

            // 4) sort the charArray
            Arrays.sort(str1charArray);
            Arrays.sort(str2CharArray);

            // 5) if the sorted char arrays are sameor identical then the strings are
            // anagram
            boolean result = Arrays.equals(str1charArray, str2CharArray);
            if (result) {
                System.out.println(str1 + " and " + str2 + " are anagrams of each other");
            } else {
                System.err.println(str1 + " and " + str2 + "are  not anagrams of each other");
            }
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams of each");
        }

    }

}
