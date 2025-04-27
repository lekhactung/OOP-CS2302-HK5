/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCovid;

/**
 *
 * @author LE TUNG
 */
public class Vaccine {

    private static int dem = 0;
    private String maVaccine;
    private String tenVaccine;
    private String xuatXu;
    private int soLuong;

    {
        setMaVaccine(String.format("VC%02d", ++dem));
    }

    public Vaccine(String tenVaccine, String xuatXu, int soLuong) {
        this.tenVaccine = tenVaccine;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
    }

    public void hienThi() {
        System.out.printf("--\n");
        System.out.printf("Ma Vaccine : %s\nTen vacinne : %s\nXuat xu : %s\nSo luong: %d\n", maVaccine,tenVaccine, xuatXu, soLuong);
    }

    /**
     * @return the maVacine
     */
    public String getMaVaccine() {
        return maVaccine;
    }

    /**
     * @param maVacine the maVacine to set
     */
    public void setMaVaccine(String maVaccine) {
        this.maVaccine = maVaccine;
    }

    /**
     * @return the tenVacine
     */
    public String getTenVaccine() {
        return tenVaccine;
    }

    /**
     * @param tenVacine the tenVacine to set
     */
    public void setTenVacine(String tenVaccine) {
        this.tenVaccine = tenVaccine;
    }

    /**
     * @return the xuatXu
     */
    public String getXuatXu() {
        return xuatXu;
    }

    /**
     * @param xuatXu the xuatXu to set
     */
    public void setXuatXu(String xuatXu) {
        this.xuatXu = xuatXu;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

}
