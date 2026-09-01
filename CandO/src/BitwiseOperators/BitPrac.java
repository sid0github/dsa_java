package BitwiseOperators;

public class BitPrac {
    public static void evenOrOdd(int n){
        if((n&1)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }

    public static void powerOfTwo(int n){
        if(n & ((n - 1)) == 0) {
            System.out.println("it is a power of two");
        }else{
            System.out.println("nope!!");
        }
    }

    static void main(String[] args) {
//        evenOrOdd(6);
        powerOfTwo(16);
    }
}
