package _01_Basic_in_Java;
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = 69, r = 5, t = 8;
        double si = p*r*t/100.0; // 27.6
        System.out.println(si);
    }
}
