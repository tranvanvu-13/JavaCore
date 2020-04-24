package buoi2;

import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Vào 2 Số Bất Kì Để Thực Hiện Phép Nhân");
        System.out.println("a =");
        int a = scanner.nextInt();
        System.out.println("b =");
        int b = scanner.nextInt();
        int c = 0 ;
        for (int i = 1 ; i <= b; i++ ){
            c += a;
        }
        System.out.print("Kết Quả Là " + c);
    }
}

