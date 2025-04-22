/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LE TUNG
 */
public class GiangVienCoHuu extends GiangVien {

    private BigDecimal luongCB;
    private double heSoLuong;

    public GiangVienCoHuu(String hoTen, String ngaySinh, String hocHam, String hocVi, String ngayBDCTac, BigDecimal luongCB, double soGioLam, double heSoLuong) {
        super(hoTen, LocalDate.parse(ngaySinh,CauHinh.df), hocHam, hocVi, LocalDate.parse(ngayBDCTac,CauHinh.df), soGioLam);
        this.luongCB = luongCB;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public BigDecimal tinhLuong() {
        BigDecimal b1 = this.thuLao.multiply(BigDecimal.valueOf(this.getSoGioLam()));
        BigDecimal b2 = this.luongCB.multiply(BigDecimal.valueOf(this.heSoLuong));
        return b1.add(b2);
    }

}
