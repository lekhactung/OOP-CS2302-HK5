/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GK;

/**
 *
 * @author LE TUNG
 */
public class Podcast extends TaiLieuDienTu {

    private int soTap;
    private double thoiLuongTB;

    public Podcast(String tieuDe, String tacGia, int namPhatHanh, int soTap, double thoiLuongTB) {
        super(tieuDe, tacGia, namPhatHanh);
        this.soTap = soTap;
        this.thoiLuongTB = thoiLuongTB;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("So tap: %d\nThoi luong TB: %.0f phut\n-----\n", soTap, thoiLuongTB);
    }

    @Override
    public String getType() {
        return "Podcast";
    }

    
    
    /**
     * @return the soTap
     */
    public int getSoTap() {
        return soTap;
    }

    /**
     * @param soTap the soTap to set
     */
    public void setSoTap(int soTap) {
        this.soTap = soTap;
    }

    /**
     * @return the thoiLuongTB
     */
    public double getThoiLuongTB() {
        return thoiLuongTB;
    }

    /**
     * @param thoiLuongTB the thoiLuongTB to set
     */
    public void setThoiLuongTB(double thoiLuongTB) {
        this.thoiLuongTB = thoiLuongTB;
    }

}
