/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btth1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Bai05 {

    public static int[][] nhapMang(int n, int m) {
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * 10 + 1);
            }
        }
        return a;
    }

    public static void xuatMang(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.printf("%d \t", a[i][j]);
            }
            System.out.println();
        }
    }
       
    public static void tongTungDong (int [][] a) {
        int [] tong = new int[a.length];
        for(int i=0;i<tong.length;i++){
            tong[i] = 0;
        }
        for(int i=0;i<a.length;i++){
            for (int j = 0; j < a.length; j++) {
                tong[i]+=a[i][j];
            }
            System.out.println("Tong dong thu " + (i+1) + " la : " + tong[i]);
        }
    }
    public static void main(String[] args) {
        int[][] a = nhapMang(5, 5);
        xuatMang(a);
        tongTungDong(a);
    }
}
