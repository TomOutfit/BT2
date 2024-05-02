package demoscanner;

import java.util.Scanner;

public class demo2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ho ten:");
        String name = sc.nextLine();
        String tuoi = "19";
        int age = Integer.parseInt(tuoi);
        System.out.println(age);
        System.out.println("Hãy nhập địa chỉ của bạn: ");
        String where = sc.nextLine();
        String c = "0935649095";
        double phone = Double.parseDouble(c);
        System.out.println(c);
        System.out.println("Hãy nhập chuyên ngành của bạn: ");
        String major = sc.nextLine();
    }
}