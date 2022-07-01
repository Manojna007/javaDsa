package BitMagic;

// a[]= {2,1,4,1,2,3,4}: 3 is not repeating twice
//hint: use xor : a number xor with itself gives zero
// a number xor with zero gives the same number(number itself)

public class findNonRepeatingElement {
    static int oneNonRepeat(int a[]){
        int ans=0;
        for(int e:a){
            ans=ans^e;
        }
        return ans;
    }
    public static void main(String[] args){
        int a[]= {2,1,4,1,2,3,4};
        System.out.println(oneNonRepeat(a));
    }


}
