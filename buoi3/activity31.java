package buoi3;

import java.util.Scanner;

public class activity31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mơi bạn nhap vao so phan tư cua mang n : ");
        int a = scanner.nextInt();
        int b[] = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.print("a[" + i + "]");
            b[i] = scanner.nextInt();
        }
        System.out.println(" ");
        int[] result = new int[b.length];
        int newLength = 0;
        for (int i = 0; i < b.length; i++) {
            boolean existied = false;
            for (int j = 0; j < newLength; j++) {
                if (b[i] == result[j]) {
                    existied = true;
                    break;
                }
            }
            if (!existied) {
                result[newLength] = b[i];
                newLength++;
            }
        }
        System.out.print(newLength);
        int[] c = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            c[i] = result[i];
        }
        System.out.println("Kich thuoc mang moi la: " + c.length);
        for (int i = 0; i < newLength; i++) {
            System.out.print(c[i] + " ");
        }
    }
}