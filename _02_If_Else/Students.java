package _02_If_Else;

import java.util.Scanner;

public class Students {
    public static void main(String[] args) {
        Scanner sb = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int a = sb.nextInt();
        if(a%5 == 0 && a%3 == 0)
            System.out.println("ARD");
        else if (a%3 == 0)
            System.out.println("Anshika");
        else if(a%5 == 0)
            System.out.println("Anu");
        else
            System.out.println("Ani");
    }
}
