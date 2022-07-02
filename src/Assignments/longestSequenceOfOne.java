package Assignments;

public class longestSequenceOfOne {
    static int lngstOne(int n){
        int count=0;
        while(n!=0){
            n=n&(n<<1);
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        System.out.println(lngstOne(14));
    }
}
