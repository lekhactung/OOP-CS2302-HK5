/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCovid_2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import QLCovid_2.MuiTiem_2;
import java.util.Comparator;

/**
 *
 * @author LE TUNG
 */
public class QLTiemChung_2 {

    private List<Vaccine> dsvc = new ArrayList<>();
    private List<NguoiDan_2> ds = new ArrayList<>();

    public void themVaccine(Vaccine... a) {
        this.dsvc.addAll(Arrays.asList(a));
    }

    public void hienThiVaccine() {
        this.dsvc.forEach(v -> v.hienThi());
    }

    public void themNguoiDan(NguoiDan_2... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void hienThiNguoiNuocNgoai() {
        this.ds.stream().filter(n -> n instanceof NguoiNuocNgoai)
                .collect(Collectors.toList())
                .forEach(n -> n.hienThi());
    }

    public void themMuiTiem(NguoiDan_2 nd, Vaccine vc, String diaDiemTiem) {
        if (!nd.duDKTiem()) {
            System.out.println("Khong du dieu kien tiem!");
            return;
        }
        MuiTiem_2 muiTiem = new MuiTiem_2(vc, LocalDate.now(), diaDiemTiem);
         nd.themMuiTiem(muiTiem);
        System.out.printf("Da tiem thanh cong cho %s mui thu %d\n", nd.getHoTen(), nd.getMuiTiem().size());
    }

    public void hienThiThongTinTiemChung() {
        this.ds.forEach(n -> n.hienThiThongTinTiemChung());
    }

    public List<NguoiDan_2> dsNguoiDanTren2Mui() {
        return this.ds.stream().filter(n -> n.getMuiTiem().size() >= 2)
                .collect(Collectors.toList());
    }

    public void kiemTraDKTiemChungNguoiDan(String kw) {
        if (this.ds.stream().filter(n -> n.getHoTen().toLowerCase().contains(kw.toLowerCase()))
                .findFirst().get().duDKTiem()) {
            System.out.println("Du dieu kien tiem!");
        } else {
            System.out.println("Khong du dieu kien tiem!"); 
        }
    }

    public void sapXep() {
        dsvc.stream()
                .sorted((v1, v2) -> {
                    int cmp = v1.getXuatXu().compareTo(v2.getXuatXu());
                    if (cmp != 0) {
                        return cmp;
                    }
                    return Long.compare(demSoNguoiDaTiem(v1), demSoNguoiDaTiem(v2)); // giảm dần
                })
                .forEach(v -> {
                    System.out.printf("Ten vaccine: %s | Xuat xu: %s | So nguoi da tiem: %d\n",
                            v.gettenVaccine(), v.getXuatXu(), demSoNguoiDaTiem(v));
                });
    }

//    public void sapXep(){
//        this.dsvc.stream().sorted((v1,v2) -> v1.getXuatXu().compareTo(v2.getXuatXu())).forEach(v -> v.hienThi());
//    }
    
    private Long demSoNguoiDaTiem(Vaccine vaccine) {
        return ds.stream()
                .filter(n -> n.getMuiTiem().stream()
                .map(MuiTiem_2::getVaccine)
                .distinct()
                .anyMatch(v -> v.equals(vaccine)))
                .count();
    }

    public List<Vaccine> getDsvc() {
        return dsvc;
    }

    public void setDsvc(List<Vaccine> dsvc) {
        this.dsvc = dsvc;
    }

}
