package buoi1;

import java.util.Scanner;

public class Baitap4 {
    public static void main(String[] args) {
        System.out.println(" Nhập Vào 2 Số Bất Kì");
        System.out.println(" n = ");
        Scanner scanner = new Scanner(System.in);
        int n  = scanner.nextInt();
        System.out.printf("%d + %d + %d = %d", n * 1, n * 11, n * 111, n * 1 + n * 11 + n * 111);

    }
}
