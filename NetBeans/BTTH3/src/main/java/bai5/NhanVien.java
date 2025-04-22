/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai5;

/**
 *
 * @author LE TUNG
 */
public class NhanVien {
    
    public enum GioiTinh{
        NAM,NU
    }
    
    private int luong = 100000;
    private static int cnt = 0;
    protected String maSo;
    private String cmnd,hoTen,queQuan,sdt;
    private GioiTinh gioiTinh;

    {
        ++cnt;
        if (cnt > 9999)
            throw new IllegalStateException("Khong the tiep tuc them nhan vien");
        maSo = String.format("NV%04d", cnt);
    }

    public NhanVien(String cmnd, String hoTen, String queQuan, String sdt, GioiTinh gioiTinh) {
        this.cmnd = cmnd;
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.sdt = sdt;
        this.gioiTinh = gioiTinh;
    }

    public double tinhLuong(int soNgayCong){
        return luong * soNgayCong;
    }
    
    
    @Override
    public String toString() {
        return String.format("\n=============\nMa so: %s\nHo ten: %s\nCCCD: %s\nGioi tinh: %s\nQue quan: %s\nSDT: %s", 
                maSo, hoTen, cmnd, gioiTinh, queQuan, sdt);
    }
    
    
    
    /**
     * @return the luong
     */
    public int getLuong() {
        return luong;
    }

    /**
     * @param luong the luong to set
     */
    public void setLuong(int luong) {
        this.luong = luong;
    }

    /**
     * @return the cnt
     */
    public static int getCnt() {
        return cnt;
    }

    /**
     * @param aCnt the cnt to set
     */
    public static void setCnt(int aCnt) {
        cnt = aCnt;
    }

    /**
     * @return the maSo
     */
    public String getMaSo() {
        return maSo;
    }

    /**
     * @param maSo the maSo to set
     */
    public void setMaSo(String maSo) {
        this.maSo = maSo;
    }

    /**
     * @return the cmnd
     */
    public String getCmnd() {
        return cmnd;
    }

    /**
     * @param cmnd the cmnd to set
     */
    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
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
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
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

    
    
    
    
}
