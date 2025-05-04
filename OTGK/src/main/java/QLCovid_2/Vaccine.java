/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLCovid_2;

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
        maVaccine = String.format("VC%02d", ++dem);
    }
    
    public Vaccine(String tenVaccine, String xuatXu, int soLuong) {
        this.tenVaccine = tenVaccine;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
    }

    public void hienThi(){
        System.out.printf("Ten vaccine: %s\nXuat xu: %s\nSo luong: %d\n",tenVaccine,xuatXu,soLuong);
    }
    
    public void NhapLoaiVaccine(){
        
    }
    
    /**
     * @return the maVaccine
     */
    public String getMaVaccine() {
        return maVaccine;
    }

    /**
     * @param maVaccine the maVaccine to set
     */
    public void setMaVaccine(String maVaccine) {
        this.maVaccine = maVaccine;
    }

    /**
     * @return the tenVaccine
     */
    public String gettenVaccine() {
        return tenVaccine;
    }

    /**
     * @param tenVaccine the tenVaccine to set
     */
    public void settenVaccine(String tenVaccine) {
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
