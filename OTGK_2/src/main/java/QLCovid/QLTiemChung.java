/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCovid;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author LE TUNG
 */
public class QLTiemChung {

    private List<NguoiDan> ds = new ArrayList<>();
    private List<Vaccine> dsvc = new ArrayList<>();

    public void themNguoiDan(NguoiDan... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void hienThiNguoiDan() {
        this.ds.forEach(n -> n.hienThi());
    }

    public void hienThiNguoiNuocNgoai() {
        this.ds.stream().filter(n -> n instanceof NguoiNuocNgoai)
                .collect(Collectors.toList())
                .forEach(n -> n.hienThi());
    }

    public void themVC(Vaccine... v) {
        this.dsvc.addAll(Arrays.asList(v));
    }

    public void themMuiTiem(NguoiDan nd, Vaccine v, String diaDiemTiem) {
        if (nd.duDKTiem()) {
            MuiTiem mt = new MuiTiem(v, diaDiemTiem);
            nd.themMuiTiem(mt);
            System.out.printf("Da tiem thanh cong mui thu %d cho %s!\n", nd.getMuiTiem().size(), nd.getHoTen());
        } else {
            System.out.println("Khong du dieu kien tiem!\n");
        }
    }

    public void hienThiThongTinTiemChung() {
        this.ds.forEach(n -> n.hienThiThongTinTiemChung());
    }

    public void kiemTraDKTiem(String kw) {
        if (this.ds.stream().filter(n -> n.getHoTen().toLowerCase().contains(kw.toLowerCase())).findFirst().get().duDKTiem()) {
            System.out.println("Du DK tiem!");
            return;
        }
        System.out.println("Khong du DK tiem!");
    }

    public void hienThiVC() {
        this.dsvc.forEach(v -> v.hienThi());
    }

    public void sapXep() {
        this.dsvc.stream()
                .sorted((v1, v2) -> {
                    int cmp = v1.getXuatXu().compareTo(v2.getXuatXu());
                    if (cmp != 0) {
                        return cmp;
                    }
                    return Long.compare(demSoLuongNguoiTiem(v1), demSoLuongNguoiTiem(v2));
                }).forEach(v -> {
                    System.out.printf("Ten vaccine: %s | Xuat xu: %s | So nguoi da tiem: %d\n"
                            ,v.getTenVC(),v.getXuatXu(),demSoLuongNguoiTiem(v));
                });
    }

    private Long demSoLuongNguoiTiem(Vaccine vc) {
        return ds.stream()
                .filter(n -> n.getMuiTiem().stream()
                .anyMatch(v -> v.getVaccine().equals(vc))).count();           
    }

    /**
     * @return the ds
     */
    public List<NguoiDan> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<NguoiDan> ds) {
        this.ds = ds;
    }

    /**
     * @return the dsvc
     */
    public List<Vaccine> getDsvc() {
        return dsvc;
    }

    /**
     * @param dsvc the dsvc to set
     */
    public void setDsvc(List<Vaccine> dsvc) {
        this.dsvc = dsvc;
    }

}
