package buoi2;

import java.util.Scanner;

public class activity3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Nhap a");
        int a = scanner.nextInt();
        int sum = 0 ;
        float avg;
        for (int i = 1;i<=a;i++){
            sum+=i;
        }
        System.out.printf("Ket qua  = 1 + 2 +... %d = %d\n",a,sum);
        System.out.printf("avg = %.2f",(float)sum/a);
    }
}
