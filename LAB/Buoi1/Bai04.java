/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.btth1;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *
 * @author admin
 */
public class Bai04 {
    
    public static int[] nhapMang(int n) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] : ", i);
            a[i] = sc.nextInt();
        }
        return a;
    }
    
    public static void xuatMang(int[] a) {
        for (var v : a) {
            System.out.printf("%d \t", v);
        }
        System.out.println();
    }
    
    public static boolean isSNT(int x) {
        if (x < 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap so phan tu trong mang :");
//        int n = sc.nextInt();
//        int[] a = nhapMang(n);
        int []a = {2,3,4,5,6,7,8,9,10,11};
        xuatMang(a);    
        System.out.println(IntStream.of(a).sum());
        System.out.println(IntStream.of(a).max().getAsInt());
        System.out.println(IntStream.of(a).min().getAsInt());
        System.out.println(IntStream.of(a).filter(x -> isSNT(x) == true).sum());
        System.out.println(IntStream.of(a).filter(x -> isSNT(x) == true).min().getAsInt());
        System.out.println(IntStream.of(a).filter(x -> x > 0).max().orElse(0));
//        for(var v:a){
//            if(isSNT(v)){
//                System.out.printf( "%d\n",v);
//            }
//        }
    }
}
