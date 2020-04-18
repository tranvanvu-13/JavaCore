package buoi1;

import java.util.Scanner;

public class Baitap2 {
    public static void main(String[] args) {
        System.out.println("Nhập Vào 2 Số Bất Kì Từ Ban Phím Để Thực Hiện Phép Tính");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c , d;
        c = a + b;
        d = a * b;
        System.out.println("Kết Quả Phép Tính Tổng Là : " + c );
        System.out.println("Kết Quả Phép Tính Nhân Là : " + d );

    }
}
