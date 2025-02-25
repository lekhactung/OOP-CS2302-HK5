package com.mycompany.btth1;

import java.util.*;

public class Bai01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 100 + 1);
        System.out.println("Chuong trinh doan so tu 1 -> 100 ");
        int guessNum;
        do {
            System.out.print("Nhap so muon doan : ");
            guessNum = scanner.nextInt();
            if (guessNum < randomNum) {
                System.out.println("So ban doan nho hon! ");
            } else if (guessNum > randomNum) {
                System.out.println("So ban doan lon hon! ");
            } else {
                System.out.println("Chinh xac!");
            }
        } while (guessNum != randomNum);

    }
}
