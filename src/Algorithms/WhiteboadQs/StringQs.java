package Algorithms.WhiteboadQs;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class StringQs {


    public static String reverse(String s) {

        final StringBuilder builder = new StringBuilder(s.length());

        for(int i = s.length() - 1; i >= 0; i--) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }


    public static String reverseInPlace(String s) {

        final StringBuilder builder = new StringBuilder(s);

        for(int i = 0; i < builder.length()/2; i++) {
            final char temp = builder.charAt(i);
            final int otherEnd = builder.length() - i - 1;
            builder.setCharAt(i, builder.charAt(otherEnd));
            builder.setCharAt(otherEnd, temp);
        }

        return builder.toString();
    }

    public static String removeNonUnique(String s) {
        Set<Character> uniqueChars = new LinkedHashSet<>();
        Set<Character> nonUniqueChars = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            if (uniqueChars.contains(c) || nonUniqueChars.contains(c)) {
                nonUniqueChars.add(c);
                uniqueChars.remove(c);
            } else {
                uniqueChars.add(s.charAt(i));
            }
        }

        StringBuilder stringBuffer = new StringBuilder();
        for (Character c : uniqueChars) {
            stringBuffer.append(c);
        }
        return stringBuffer.toString();
    }

    public static boolean isPalindrome(final String s) {
        final String toCheck = s.toLowerCase();

        int left = 0;
        int right = toCheck.length() - 1;

        while (left <= right) {
            while(left < toCheck.length() &&
                    !Character.isLetter(toCheck.charAt(left))) {
                left++;
            }
            while(right > 0 && !Character.isLetter(toCheck.charAt(right))) {
                right--;
            }
            if (left > toCheck.length() || right < 0) {
                return false;
            }
            if (toCheck.charAt(left) != toCheck.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome2(final String word) {

        char[] wordChars = word.toLowerCase().toCharArray();

        int left = 0;
        int right = word.length() - 1;

        while (right > left) {
            if(wordChars[left] != wordChars[right]){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static boolean strictPalindrome(final String s) {
        return s.equals(reverse(s));
    }

    public static boolean isAnagram(String one, String two) {

        boolean isAno;

        String string1 = one.replaceAll("\\s", "").toLowerCase();
        String string2 = two.replaceAll("\\s", "").toLowerCase();

        if(string1.length() != string2.length()) {
            isAno = false;
        } else {
            char[] array1 = string1.toCharArray();
            char[] array2 = string2.toCharArray();

            Arrays.sort(array1);
            Arrays.sort(array2);

            isAno = Arrays.equals(array1, array2);
        }

        return isAno;
    }
}
