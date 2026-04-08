package com.formation;

public class Palindrome {
    public static boolean estPalindrome(String s){
        s=s.toLowerCase();
        s=s.replace(" ","");
        int i;
        for ( i = 0; i < s.length()/ 2 ; i++){
            if (s.charAt(i) != s.charAt(s.length()-i -1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(estPalindrome("radar"));        // true
        System.out.println(estPalindrome("Radar"));        // true
        System.out.println(estPalindrome("A man a plan")); // true
        System.out.println(estPalindrome("hello"));        // false
        System.out.println(estPalindrome("Level"));        // true
        System.out.println(estPalindrome(""));
    }
}
