package com.mycompany.btth1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Bai03 {

    public static void XuatTenEmail(Scanner sc) {
        System.out.println("Nhap dia chi Email : ");
        String email = sc.nextLine();
        System.out.println(email.substring(0, email.indexOf('@')));
    }

    public static void DemSoTuInHoa(Scanner sc) {
//        System.out.println("Nhap chuoi : ");
        int count = 0;
//        String s = sc.nextLine(); 
        String s = "   JAVA   is   simPle!  ";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        System.out.println("So luong chu in hoa trong chuoi la : " + count);
    }

    public static void DocFile() throws FileNotFoundException {
        String path = "src/main/resources/input.txt";
        File f = new File(path);
        File fo = new File("src/main/resources/output.txt");
        try (Scanner sc = new Scanner(f); PrintWriter w = new PrintWriter(fo)) {
            String s = "";
            while (sc.hasNextLine()) {
                s += sc.nextLine();
            }
            s = s.replaceAll("\\{file\\}", "tap tin");
            w.println(s);
        }
    }

    public static void ChuanHoaChuoi() {
        String s = "    JAVA    ;;;, ,,,; ;;, , is  ;;,,;;,,,   simPle!  ";
        System.out.println(s);
        String a[] = s.trim().split("[;,\\s]+");
        System.out.println("So tu trong xau : " + a.length);

        int max = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i].length() > a[max].length()) {
                max = i;
            }
        }
        System.out.println("Tu dai nhat trong chuoi : " + a[max]);
        
        StringBuilder b = new StringBuilder();
        for (var v : a) {
            b.append(v.substring(0,1).toUpperCase())
                    .append(v.substring(1).toLowerCase())
                    .append(" ");
        }
        System.out.println("Chuoi sau khi chuan hoa: " + b.toString().trim());
    }

   

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
//        XuatTenEmail(sc);
//        DemSoTuInHoa(sc); 
//        DocFile();
        ChuanHoaChuoi();
    }
}
