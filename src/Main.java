import java.util.*;

class Solution{
    static void pattern1(int n){
        for(int i=0; i<n; i++){
            for (int j=0; j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern4(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    static void pattern5(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern6(int n){
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern8(int n) {
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= i-1; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= 2 * n - 2 * i + 1 ; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    static void pattern9(int n){
        for(int i = 1; i <= n; i++) {

            // spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern10(int n){
        for(int i=1; i<=n; i++){
            for(int j = 1; j<= n-i; j++) {
                System.out.print(" ");
            }
            for(int j=1; j<= 2*i-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<= 2*n-2*i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern11(int n){
        for(int i=1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void pattern12(int n){
        for(int i=1; i<=n; i++){
            int start = (i % 2 == 0) ? 0 : 1;

            for(int j=1; j<=i; j++ ) {
                System.out.print(start);
                start = 1 - start;
            }
            System.out.println();
        }
    }

    static void pattern13(int n){
        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = 1; j <= 2 * n - 2 * i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }

    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pattern13(n);
    }
}