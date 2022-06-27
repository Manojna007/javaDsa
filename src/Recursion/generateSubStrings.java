package Recursion;

public class generateSubStrings {
    static void generate(String s){
        utilGenerateSubsetss(s,0,"");

    }
    static void utilGenerateSubsetss(String s,int i,String cur){
        if(i==s.length()){
            System.out.println(cur);
            return;
        }
        utilGenerateSubsetss(s,i+1,cur);
        utilGenerateSubsetss(s,i+1,cur+s.charAt(i));
   }
   public static void main(String[] args){
        generate("abc");
   }
}
