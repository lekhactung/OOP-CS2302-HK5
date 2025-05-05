/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author LE TUNG
 */
public class NguoiDung {
    private static int dem =0;
    private int maNguoiDung;
    private String hoTen;
    private String email;
    private List<TaiLieuDienTu> dsYeuThich = new ArrayList<>();

    public NguoiDung(String hoTen, String email) {
        this.maNguoiDung = ++dem;
        this.hoTen = hoTen;
        this.email = email;
    }
    
    public void themTaiLieuYeuThich(TaiLieuDienTu d){
        this.dsYeuThich.add(d);
    }

//    public void themTaiLieuYeuThich(TaiLieuDienTu tl){
//        this.dsYeuThich.add(tl);
//    }
    
    public void hienThi(){
        System.out.printf("Ma nguoi dung: %s\nHo ten: %s\nEmail: %s\n",maNguoiDung,hoTen,email);
//        this.dsYeuThich.forEach(t -> System.out.printf(""));
//        this.dsYeuThich.forEach(t -> t.hienThi());
    }
    
    
    /**
     * @return the maNguoiDung
     */
    public int getMaNguoiDung() {
        return maNguoiDung;
    }

    /**
     * @param maNguoiDung the maNguoiDung to set
     */
    public void setMaNguoiDung(int maNguoiDung) {
        this.maNguoiDung = maNguoiDung;
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
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the dsYeuThich
     */
    public List<TaiLieuDienTu> getDsYeuThich() {
        return dsYeuThich;
    }

    /**
     * @param dsYeuThich the dsYeuThich to set
     */
    public void setDsYeuThich(List<TaiLieuDienTu> dsYeuThich) {
        this.dsYeuThich = dsYeuThich;
    }
    
    
}
