/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai2;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author LE TUNG
 */
public class GiangVienThinhGiang extends GiangVien {

    private String noiCTacHT;

    public GiangVienThinhGiang(String hoTen, String ngaySinh, String hocHam, String hocVi, String ngayBDCTac, double soGioLam, String noiCTacHT) {
        super(hoTen, LocalDate.parse(ngaySinh,CauHinh.df), hocHam, hocVi, LocalDate.parse(ngayBDCTac,CauHinh.df), soGioLam);
        this.noiCTacHT = noiCTacHT;
    }

    @Override
    public BigDecimal tinhLuong() {
        return thuLao.multiply(BigDecimal.valueOf(this.getSoGioLam()));
    }

}
