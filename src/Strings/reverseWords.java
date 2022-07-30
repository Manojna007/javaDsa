package Strings;
// input: I am the boss
// output: boss the am I
// inplace reversing
/*
Reverse every char
then reverse the whole string

*/
public class reverseWords {
    static void revChar(char[] s,int i, int j){
        while(i<j){
            char temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            i++;j--;
        }
    }
    static String revWords(String s){
        char[] c=s.toCharArray();
        int start=0,end=0;
        for(;end<s.length();end++){
            if(c[end]==' '){
                revChar(c,start,end-1);
                start=end+1;
            }
        }
        revChar(c,start,end-1);//reverse last word
        revChar(c,0,s.length()-1);//reverse whole String
        return new String(c);
    }
    public static void main(String[] args){
        String s="I am the Boss";
        String ans=revWords(s);
        System.out.println(ans);
    }
}
