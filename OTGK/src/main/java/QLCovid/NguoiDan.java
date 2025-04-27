/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCovid;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LE TUNG
 */
public class NguoiDan {

    private String cccd;
    private String hoTen;
    private GioiTinh gioiTinh;
    private String SDT;
    private LocalDate ngaySinh;
    protected List<MuiTiem> muiTiem = new ArrayList<>();

    public NguoiDan(String cccd, String hoTen, GioiTinh gioiTinh, String SDT, String ngaySinh) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.SDT = SDT;
        this.ngaySinh = LocalDate.parse(ngaySinh, CauHinh.df);
    }

    public void hienThi() {
        if (cccd != null) {
            System.out.printf("So CCCD: %s\n", cccd);
        }
        System.out.printf("Ho ten: %s\nGioi tinh: %s\n", hoTen, gioiTinh);
        if(muiTiem!=null){
            this.muiTiem.forEach(mt -> mt.hienThi());
        }
        System.out.println("-------------");
    }

    public void themMuiTiem(MuiTiem a){
        this.muiTiem.add(a);
    }
    
    /**
     * @return the cccd
     */
    public String getCccd() {
        return cccd;
    }

    /**
     * @param cccd the cccd to set
     */
    public void setCccd(String cccd) {
        this.cccd = cccd;
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
     * @return the gioiTinh
     */
    public GioiTinh getGioiTinh() {
        return gioiTinh;
    }

    /**
     * @param gioiTinh the gioiTinh to set
     */
    public void setGioiTinh(GioiTinh gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    /**
     * @return the SDT
     */
    public String getSDT() {
        return SDT;
    }

    /**
     * @param SDT the SDT to set
     */
    public void setSDT(String SDT) {
        this.SDT = SDT;
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

    public List<MuiTiem> getMuiTiem() {
        return muiTiem;
    }

    public void setMuiTiem(List<MuiTiem> muiTiem) {
        this.muiTiem = muiTiem;
    }

}
