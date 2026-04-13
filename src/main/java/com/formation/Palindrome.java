package com.formation;

/* 

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
        System.out.println(estPalindrome("radar"));
        System.out.println(estPalindrome("Radar"));
        System.out.println(estPalindrome("A man a plan"));
        System.out.println(estPalindrome("hello"));
        System.out.println(estPalindrome("Level"));
        System.out.println(estPalindrome(""));
    }
}
*/

public class Palindrome{

    public static boolean estPalindrome(String s){
        s = s.toLowerCase();
        s = s.replace(" ", "");

        for(int i = 0; i < s.length() / 2; i++){

            if(s.charAt(i)!= s.charAt(s.length()-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(estPalindrome("radar"));
        System.out.println(estPalindrome("Radar"));
        System.out.println(estPalindrome("A man a plan"));
        System.out.println(estPalindrome("hello"));
        System.out.println(estPalindrome("Level"));
        System.out.println(estPalindrome("") );
        System.out.println(estPalindrome("Junior") );
    }
}