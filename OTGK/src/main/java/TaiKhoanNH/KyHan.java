/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package TaiKhoanNH;

import java.time.LocalDate;

/**
 *
 * @author LE TUNG
 */
public enum KyHan {
    MOT_TUAN(7,0.5){
        @Override
        protected LocalDate tinhDaoHan(LocalDate ngayBatDau) {
            return ngayBatDau.plusDays(this.khoangThoiGian);
        }

        @Override
        protected double tinhLai(double st) {
            return (st*this.laiSuat) / (12*100*7);
        }
        
    },
    MOT_THANG(1,4.5){
        @Override
        protected LocalDate tinhDaoHan(LocalDate ngayBatDau) {
            return ngayBatDau.plusMonths(this.khoangThoiGian);
        }
        @Override
        protected double tinhLai(double st) {
            return (st*this.laiSuat) / (12*100);
        }
    },
    MOT_NAM(1,6.8){
        @Override
        protected LocalDate tinhDaoHan(LocalDate ngayBatDau) {
            return ngayBatDau.plusYears(this.khoangThoiGian);
        }
        @Override
        protected double tinhLai(double st) {
            return (st*this.laiSuat) / 100;
        }
    };
    
    protected int khoangThoiGian;
    protected double laiSuat;

    private KyHan(int khoangThoiGian, double laiSuat) {
        this.khoangThoiGian = khoangThoiGian;
        this.laiSuat = laiSuat;
    }
    
    protected abstract LocalDate tinhDaoHan(LocalDate ngayBatDau);
    protected abstract double tinhLai(double st);
    
}
