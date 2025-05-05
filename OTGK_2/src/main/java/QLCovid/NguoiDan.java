/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCovid;

import java.time.LocalDate;
import java.time.temporal.TemporalQueries;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LE TUNG
 */
public class NguoiDan {

    private String cccd;
    private String hoTen;
    private GioiTinh gioiTinh;
    private LocalDate ngaySinh;
    private List<MuiTiem> muiTiem = new ArrayList<>();

    public NguoiDan(String cccd, String hoTen, GioiTinh gioiTinh, String ngaySinh) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = LocalDate.parse(ngaySinh, CauHinh.df);
    }

    public void hienThi() {
        if (cccd != null) {
            System.out.printf("CCCD: %s\nHo ten: %s\nGioi tinh: %s\nNgay sinh: %s\n", cccd, hoTen, gioiTinh, ngaySinh);
        }
//        this.muiTiem.forEach(v -> v.hienThi());
    }

    public boolean duDKTiem() {
        if (this.muiTiem.size() >= 3) {
            return false;
        }
        if (this.ngaySinh.plusYears(18).compareTo(LocalDate.now()) > 0) {
            return false;
        }
        if (!muiTiem.isEmpty()) {
//            return !this.muiTiem.getLast().getNgayTiem().plusMonths(3).isAfter(LocalDate.now());
            return true;
        }
        return true;
    }

    public void hienThiThongTinTiemChung() {
        if (this.muiTiem.size() >= 2) {
            this.hienThi();
            this.muiTiem.forEach(m -> m.hienThi());
            System.out.printf("Ngay tiem tiep theo: %s\n", muiTiem.getLast().ngayTiemTiepTheo());
        }
    }

    public void themMuiTiem(MuiTiem m) {
        this.muiTiem.add(m);
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
     * @return the muiTiem
     */
    public List<MuiTiem> getMuiTiem() {
        return muiTiem;
    }

    /**
     * @param muiTiem the muiTiem to set
     */
    public void setMuiTiem(List<MuiTiem> muiTiem) {
        this.muiTiem = muiTiem;
    }

}
