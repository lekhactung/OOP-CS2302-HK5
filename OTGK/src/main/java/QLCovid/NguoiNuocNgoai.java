/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCovid;

import java.time.LocalDate;

/**
 *
 * @author LE TUNG
 */
public class NguoiNuocNgoai extends NguoiDan {

    private String soHoChieu;
    private String quocTich;

    public NguoiNuocNgoai(String soHoChieu, String quocTich, String hoTen, GioiTinh gioiTinh, String SDT, String ngaySinh) {
        super(null, hoTen, gioiTinh, SDT, ngaySinh);
        this.soHoChieu = soHoChieu;
        this.quocTich = quocTich;
    }

    @Override
    public void hienThi() {
        super.hienThi(); 
        System.out.printf("So ho chieu : %s\nQuoc tich : %s\n",soHoChieu,quocTich);
    }

    
    
    /**
     * @return the soHoChieu
     */
    public String getSoHoChieu() {
        return soHoChieu;
    }

    /**
     * @param soHoChieu the soHoChieu to set
     */
    public void setSoHoChieu(String soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    /**
     * @return the quocTich
     */
    public String getQuocTich() {
        return quocTich;
    }

    /**
     * @param quocTich the quocTich to set
     */
    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

}
