package Strings;
/*
== : checks reference of variables
equals : checks or compares values
Anagrams: two strings with same type of characters , same number of times
Permutation of a string are Anagrams

Method - tocharArray()

approach- using constant space (256 bits)
* */
public class Anagrams {
    static boolean anagrams(String s1,String s2){
        int a[] = new int[256];
        for(int i=0;i<s1.length();i++){
            a[s1.charAt(i)]++;
        }
        for(int i=0;i<s2.length();i++){
            a[s2.charAt(i)]--;
        }
        for(int e:a){
            if(e!=0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        String s1="hello";
        String s2="elloh";

        System.out.println(anagrams(s1,s2));
    }


}
