import java.util.*;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = -1;
        do {
            System.out.print("Nhap bac cua da thuc (n) :");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Bac cua da thuc phai la so nguyen duong, vui long nhap lai!");
            }
        } while (n < 0);

        int[] coef = new int[n + 1];
        System.out.println("Nhập các hệ số của đa thức (từ hệ số của x^0 đến x^" + n + "):");
        for (int i = 0; i <= n; i++) {
            coef[i] = scanner.nextInt();
        }

        System.out.println("\nNhap gia tri x");
        int x = scanner.nextInt();

        int result = 0;
        for (int i = n; i >= 0; i--) {
            result += coef[i] * Math.pow(x, i);
        }
        System.out.print("Gia tri cua da thuc bac " + n + " tai " + x + " = " + result);
    }
}

