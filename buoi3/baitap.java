package buoi3;

import java.util.Scanner;

public class baitap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Các số chia hết cho 3 là: ");
        int a = scanner.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.print(i + " ");
        }
        for (int c = 1; c < a; c++) {
            if (c / 3 == 1) ;
            System.out.print(c);
        }

    }
}



