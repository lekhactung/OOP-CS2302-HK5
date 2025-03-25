package com.lkt.hv;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.DoubleStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author admin
 */
public class HocVien {

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the Diem
     */
    public double[] getDiem() {
        return diem;
    }

    /**
     * @param Diem the Diem to set
     */
    public void setDiem(double[] Diem) {
        this.diem = diem;
    }
    private static int dem;
    private int Id = ++dem;
//    private /*String*/ hoTen;
    private String hoTen;
    private LocalDate ngaySinh;
    private double[] diem;

    public HocVien() {
    }

    
    
    public HocVien(String ht, LocalDate ns) {
        this.hoTen = ht;
        this.ngaySinh = ns;
    }

    public HocVien(String ht, String ns) {
        this(ht, LocalDate.parse(ns, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public void hienThi() {
        System.out.printf("%d - %s - %s\n", this.Id, this.hoTen, this.ngaySinh.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        if(this.diem !=null){
            for(var d: this.diem){
                System.out.printf("%.1f\t",d);
            }
            System.err.println("");
        }
    }

    public void nhap1HV() {
        System.out.print("Ho Ten = ");
        this.hoTen = CauHinh.SC.nextLine();
        System.out.print("Ngay sinh (dd/MM/yyy) = ");
        this.ngaySinh = LocalDate.parse(CauHinh.SC.nextLine(), CauHinh.FORMATTER);

    }
    
    public void nhapDiem(){
        System.out.printf("== Nhap cua %s\n",this.hoTen.toUpperCase());
        this.diem = new double[CauHinh.SO_MON];
        for(int i=0;i<CauHinh.SO_MON;i++){
            System.out.printf("Mon thu %d = ", i+1);
            this.diem[i] = Double.parseDouble(CauHinh.SC.nextLine());
        }
    }
    
    public double tinhTB(){
        if(this.diem!= null){
            return DoubleStream.of(this.diem).average().getAsDouble();
        }
        return 0;
    }

}
