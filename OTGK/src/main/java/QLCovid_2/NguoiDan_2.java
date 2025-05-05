/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCovid_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LE TUNG
 */
public class NguoiDan_2 {

    private String cccd;
    private String hoTen;
    private GioiTinh gioiTinh;
    private String sdt;
    private LocalDate ngaySinh;
    private List<MuiTiem_2> muiTiem = new ArrayList<>();

    public NguoiDan_2(String cccd, String hoTen, GioiTinh gioiTinh, String sdt, String ngaySinh) {
        this.cccd = cccd;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
        this.ngaySinh = LocalDate.parse(ngaySinh, CauHinh.df);
    }

    public void hienThi() {
        if (cccd != null) {
            System.out.printf("CCCD : %s\n", cccd);
        }
        System.out.printf("Ho ten: %s\nGioi tinh: %s\nNgay sinh: %s\n", hoTen, gioiTinh,ngaySinh);
    }

    public void themMuiTiem(QLCovid_2.MuiTiem_2 mt) {
        this.muiTiem.add(mt);
    }

    public boolean duDKTiem() {
        if (this.muiTiem.size() >= 3) {
            return false;
        }
        if (this.ngaySinh.plusYears(18).compareTo(LocalDate.now()) > 0) {
            return false;
        }
        if (!muiTiem.isEmpty()) {
            return !this.muiTiem.getLast().getNgayTiem().plusMonths(3).isAfter(LocalDate.now());
//            return true;
        }
        return true;
    }

    public void hienThiThongTinTiemChung() {
        if (muiTiem.size()>=2) {
            hienThi();
            this.muiTiem.forEach(m -> m.hienThi());
            System.out.printf("Ngay tiem tiep theo: %s\n",muiTiem.getLast().ngayTiemTiepTheo());
        }
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
     * @return the sdt
     */
    public String getSdt() {
        return sdt;
    }

    /**
     * @param sdt the sdt to set
     */
    public void setSdt(String sdt) {
        this.sdt = sdt;
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
    public List<MuiTiem_2> getMuiTiem() {
        return muiTiem;
    }

    /**
     * @param muiTiem the muiTiem to set
     */
    public void setMuiTiem(List<MuiTiem_2> muiTiem) {
        this.muiTiem = muiTiem;
    }

}
