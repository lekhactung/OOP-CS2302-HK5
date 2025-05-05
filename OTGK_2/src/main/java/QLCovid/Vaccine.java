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
    private static int dem =0;
    private String maVC = String.format("%d", ++dem) ;
    private String tenVC;
    private String xuatXu;
    private int soLuong;

    public Vaccine(String tenVC, String xuatXu, int soLuong) {
        this.tenVC = tenVC;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
    }

    public void hienThi(){
        System.out.printf("Ten VC: %s\nXuat xu: %s\nSo luong: %d\n",tenVC,xuatXu,soLuong);
    }
    
    /**
     * @return the maVC
     */
    public String getMaVC() {
        return maVC;
    }

    /**
     * @return the tenVC
     */
    public String getTenVC() {
        return tenVC;
    }

    /**
     * @param tenVC the tenVC to set
     */
    public void setTenVC(String tenVC) {
        this.tenVC = tenVC;
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
