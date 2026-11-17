package _03_Loops;

public class Iteration {
    public static void main(String[] args) {
//        // 154 iterations
//        for (int i = 17; i <= 170 ; i=i+1) {
//            if(i%17 == 0) System.out.print(i+" ");
//        }
//        // 10 iterations
//        for (int i = 17; i <= 170 ; i=i+17) {
//            System.out.print(i+" ");
//        }
//        // 10 iterations
//        for (int i = 1; i <= 10 ; i=i+1) {
//            System.out.print(i*18+" ");
//        }
//        // 50 iterations
//        for (int i = 2; i <= 100 ; i=i+2) {
//            System.out.print(i+" ");
//        }
        // 100 iterations
        for (int i = 1; i <= 100 ; i=i++) {
            if(i%2==0) System.out.print(i+" ");
        }
    }
}
