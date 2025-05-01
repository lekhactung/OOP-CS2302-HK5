/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCovid;

import java.time.LocalDate;
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

    public void themVaccine(Vaccine... a) {
        this.dsvc.addAll(Arrays.asList(a));

    }

    public void hienThiNguoiDan() {
        System.out.println("----NGUOI DAN----");
        this.ds.forEach(nd -> nd.hienThi());
    }

    
    public void hienThiVaccine() {
        System.out.println("----VACCINE----");
        this.dsvc.forEach(vc -> vc.hienThi());
    }

    public List<NguoiDan> dsNguoiNuocNgoai() {
        return this.ds.stream().filter(nd -> nd instanceof NguoiNuocNgoai).collect(Collectors.toList());
    }

    public void tiemChung(NguoiDan nd, Vaccine v, String diaDiemTiem) {
        if(!nd.duDKTiem()){
            System.out.println("Khong du dieu kien tiem!");
            return;
        }
        MuiTiem mt = new MuiTiem(v, LocalDate.now(), diaDiemTiem);
        nd.themMuiTiem(mt);
        System.out.printf("Tiem thanh cong mui thu %d cho %s!\n", nd.getMuiTiem().size(),nd.getHoTen());
    }

    public void kiemTra(String kw){
        if( this.ds.stream().filter(n -> n.getHoTen().toLowerCase().contains(kw.toLowerCase())).findFirst().get().duDKTiem() ){
            System.out.println("Du dieu kien tiem!");
            return;
        }
        System.out.println("Khong du dieu kien tiem!");
    }
    
    public void nguoiTiemTren2Mui(){
        this.ds.stream().filter(n -> n.muiTiem.size()>=2).collect(Collectors.toList()).forEach(n -> n.hienThi());
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
