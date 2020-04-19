package buoi1;

import java.util.Scanner;

public class baitap1 {
    public static void main(String[] args) {
        System.out.println("Chào Bạn !");
        System.out.println("Để Thực Hiện Phép Tính Mời Bạn Nhập Vào 2 Số Bất Kì :");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c , d , e , f , g;
        c = a + b;
        d = a - b;
        e = a * b;
        f = a / b;
        g = a % b;
        System.out.println("Kết Quả Phép Tính Cộng Là : " + c );
        System.out.println("Kết Quả Phép Tính Trừ Là : " + d );
        System.out.println("Kết Quả Phép Tính Nhân Là : " + e );
        System.out.println("Kết Quả Phép Tính Chia Là : " + f );
        System.out.println("Kết Quả Phép Tính Chia Lấy Phần Nguyên Là : " + g );
    }
}
