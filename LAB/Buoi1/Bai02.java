/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btth1;

/**
 *
 * @author admin
 */
import java.util.*;

public class Bai02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhap bac cua da thuc (n>0) : ");
            n = sc.nextInt();
            if (n < 0) {
                System.out.println("So vua nhap khong hop le!");
            }
        } while (n < 0);
        System.out.println("Nhap he so cho phuong trinh bac " + n);
        System.out.print("Nhap gia tri x : ");
        int x = sc.nextInt();
        int KetQua = 0;
        for (int i = 0; i <= n; i++) {
            System.out.printf("a%d : ", i);
            int a = sc.nextInt();
            KetQua += a * Math.pow(x, i);
        }
        System.out.println("Gia tri da thuc bac " + x + " = " + KetQua);
    }
}
