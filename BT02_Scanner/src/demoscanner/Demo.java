package demoscanner;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập tên của bạn: ");
        String a = sc.nextLine();
        System.out.println("Hãy nhập tuổi của bạn: ");
        int b = sc.nextInt();
        System.out.println("Hãy nhập địa chỉ của bạn: ");
        String c = sc.nextLine();
        System.out.println("Hãy nhập Sđt của bạn: ");
        int d = sc.nextInt();
        System.out.println("Hãy nhập chuyên ngành của bạn: ");
        String e = sc.nextLine();
    }
}
