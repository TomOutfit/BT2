package thucchienscanner;

import java.util.Scanner;

public class BT01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nguyên ");
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int sum1 = 0, sum2 = 0;

        for (int i = 1; i <= a/2; i++) {
            if (a % i == 0) {
                sum1 = sum1 + i;
            }
        }
        if (a == sum1) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        for (int i = 1; i <= b/2; i++) {
            if (b % i == 0) {
                sum2 = sum2 + i;
            }
        } 
        if (b == sum2) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}