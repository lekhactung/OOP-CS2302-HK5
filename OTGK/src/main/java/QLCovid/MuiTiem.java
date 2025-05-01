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
public class MuiTiem {

    private Vaccine vaccine;
    private LocalDate ngayTiem;
    private String diaDiemTiem;

    public MuiTiem(Vaccine vaccine, LocalDate ngayTiem, String diaDiemTiem) {
        this.vaccine = vaccine;
        this.ngayTiem = ngayTiem;
        this.diaDiemTiem = diaDiemTiem;
    }

    public void hienThi() {
        vaccine.hienThi();
        System.out.printf("Ngay tiem: %s\nDia diem tiem:%s\n", ngayTiem, diaDiemTiem);
    }

    /**
     * @return the vaccine
     */
    public Vaccine getVaccine() {
        return vaccine;
    }

    /**
     * @param vaccine the vaccine to set
     */
    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }

    /**
     * @return the ngayTiem
     */
    public LocalDate getNgayTiem() {
        return ngayTiem;
    }

    /**
     * @param ngayTiem the ngayTiem to set
     */
    public void setNgayTiem(LocalDate ngayTiem) {
        this.ngayTiem = ngayTiem;
    }

    /**
     * @return the diaDiemTiem
     */
    public String getDiaDiemTiem() {
        return diaDiemTiem;
    }

    /**
     * @param diaDiemTiem the diaDiemTiem to set
     */
    public void setDiaDiemTiem(String diaDiemTiem) {
        this.diaDiemTiem = diaDiemTiem;
    }

}
