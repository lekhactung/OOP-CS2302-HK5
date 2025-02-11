import java.util.*;
public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do{
            System.out.print("Nhap bac cua da thuc :");
            n = scanner.nextInt();
            if(n<0){
                System.out.println("Bac cua da thuc phai la so nguyen duong, vui long nhap lai!");
            }
        } while(n<0);
        int[] coef = new int[n+1];
        for(int i =0;i<n;i++){
            System.out.print("Nhap he so cua x^"+i+1 +" ");
            coef[i] = scanner.nextInt();
        }
    }
}

