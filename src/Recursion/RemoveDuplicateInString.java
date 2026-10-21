package Recursion;

import java.util.Locale;

public class RemoveDuplicateInString {
    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newSting){
        if (idx == str.length()){
            System.out.println(newSting);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a']){
            removeDuplicates(str, idx + 1, newSting);
        } else{
            newSting += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newSting);
        }
    }
    public static void main(String[] args) {
        String str = "abbccda";
        removeDuplicates(str, 0, "");
    }
}