/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.Date;

/**
 *
 * @author LE TUNG
 */
public abstract class TaiKhoan {

    private static int cnt = 0;
    private String stk;
    private String tenTK, sdt, email;
    private long soTienTrongTK;
    private Date ngayTaoTK;
    private boolean trangThaiTK;

    public TaiKhoan(String stk, String tenTK, String sdt, String email, long soTienTrongTK, Date ngayTaoTK, boolean trangThaiTK) {
        this.stk = String.format("%06d", ++cnt);
        this.tenTK = tenTK;
        this.sdt = sdt;
        this.email = email;
        this.soTienTrongTK = soTienTrongTK;
        this.ngayTaoTK = ngayTaoTK;
        this.trangThaiTK = trangThaiTK;
    }

    public abstract String getLoaiTK();

    public void hienThiThongTin() {
        System.out.printf("%STK : %d\nTen TK : %s \nSDT : %s \nEmail : %s \nSoTien : %d \n");
    }

//    public void xuatTTTK (){
//        System.out.printf("%STK : %d\nTen TK : %s \nSDT : %s \nEmail : %s \nSoTien : %d \n" ); 
//    }
//    
    /**
     * @return the stk
     */
    public String getStk() {
        return stk;
    }

    /**
     * @param stk the stk to set
     */
    public void setStk(String stk) {
        this.stk = stk;
    }

    /**
     * @return the tenTK
     */
    public String getTenTK() {
        return tenTK;
    }

    /**
     * @param tenTK the tenTK to set
     */
    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
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
     * @return the soTienTrongTK
     */
    public long getSoTienTrongTK() {
        return soTienTrongTK;
    }

    /**
     * @param soTienTrongTK the soTienTrongTK to set
     */
    public void setSoTienTrongTK(long soTienTrongTK) {
        this.soTienTrongTK = soTienTrongTK;
    }

    /**
     * @return the ngayTaoTK
     */
    public Date getNgayTaoTK() {
        return ngayTaoTK;
    }

    /**
     * @param ngayTaoTK the ngayTaoTK to set
     */
    public void setNgayTaoTK(Date ngayTaoTK) {
        this.ngayTaoTK = ngayTaoTK;
    }

    /**
     * @return the trangThaiTK
     */
    public boolean isTrangThaiTK() {
        return trangThaiTK;
    }

    /**
     * @param trangThaiTK the trangThaiTK to set
     */
    public void setTrangThaiTK(boolean trangThaiTK) {
        this.trangThaiTK = trangThaiTK;
    }

}
