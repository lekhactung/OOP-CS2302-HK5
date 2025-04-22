/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

/**
 *
 * @author LE TUNG
 */
public class TaiKhoan {
    
//    public static final DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    private static int cnt = 0;
    private String stk;
    private String tenTK, sdt, email;
    protected BigDecimal soTien;
    private Date ngayTaoTK;
    private boolean trangThaiTK;

    {
        setStk(String.format("%06d", ++cnt));
        setNgayTaoTK(new Date());
    }

    public TaiKhoan(String tenTK , BigDecimal soTien) {
        this.tenTK = tenTK;
        this.soTien = soTien;
    }

    public boolean isDaoHan(){
        return true;
    }
    
    public void rutTien(BigDecimal st){
        if(this.isDaoHan()){
            if(this.soTien.compareTo(st) >=0 ){
                this.soTien = this.soTien.subtract(st);
            }
        }
    }
    
    public void napTien(BigDecimal st){
        if(this.isDaoHan()){
            this.soTien = this.soTien.add(st);
        }
    }    
    
    public BigDecimal tinhLai(){
        //tai khoan khong ky han tinh lai~ theo thang nen /12
        return this.soTien.multiply(new BigDecimal(0.001).divide(new BigDecimal(12)));
    }
    
    @Override
    public String toString() {
        return String.format("\n===========\nSo tk: %s\nTen tk: %s\nSo tien: %.1f VND\nLoai TK : khong ky han",
                stk, tenTK, soTien);
                
    }     
    /**
     * @return the cnt
     */
    public static int getCnt() {
        return cnt;
    }

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
     * @return the soTien
     */
    public BigDecimal getSoTien() {
        return soTien;
    }

    /**
     * @param soTien the soTien to set
     */
    public void setSoTien(BigDecimal soTien) {
        this.soTien = soTien;
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
