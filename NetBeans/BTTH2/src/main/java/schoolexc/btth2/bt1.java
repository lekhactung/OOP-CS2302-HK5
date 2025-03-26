package schoolexc.btth2;

import schoolexc.btth2.lib2.Diem;
import java.util.*;

public class bt1 {

    public static void main(String[] args) {
        Diem d1 = new Diem(1,2);/        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap hoanh do cua diem d1! ");
//        int tmp = sc.nextInt();
//        d1.setHoanhDo(tmp);
//        System.out.println("Nhap tung do cua diem d1! ");
//        tmp = sc.nextInt();
//        d1.setTungDo(tmp);
//        System.out.println("Nhap hoanh do cua diem d2! ");
//        tmp = sc.nextInt();
//        d2.setHoanhDo(tmp);
//        System.out.println("Nhap tung do cua diem d2! ");
//        tmp = sc.nextInt();
//        d2.setTungDo(tmp);
        Diem d2 = new Diem(3,4);
/
        System.out.println(d1);
        System.out.println(d2);
        System.out.printf("Khoang cach giua d1 -> d2 la :  %.1f " , Diem.distance(d1, d2));
    }
}
