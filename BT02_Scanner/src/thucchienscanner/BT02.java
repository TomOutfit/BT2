package thucchienscanner;

import java.util.Scanner;

public class BT02 {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số nguyên ");
        int a = Integer.parseInt(sc.nextLine());
        
        if (a % 2 == 0) {
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < a; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            for (int i = 1; i <= a; i++) {
        
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
        
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
        
            System.out.println();
            }
        }
    }
}