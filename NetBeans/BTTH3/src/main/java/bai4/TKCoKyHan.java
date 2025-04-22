/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author LE TUNG
 */
public class TKCoKyHan extends TaiKhoan {

    private KyHan kyHan;
    private Calendar ngayDaoHan;

    public TKCoKyHan(String tenTK, BigDecimal soTien, KyHan kyHan) {
        super(tenTK, soTien);
        this.kyHan = kyHan;
        this.ngayDaoHan = this.kyHan.tinhDaoHan(new GregorianCalendar());
        // new GregorianCalendar() de lay ngay hien tai

    }

    public void capNhatNgayDaoHan() {
        this.ngayDaoHan = this.kyHan.tinhDaoHan(this.ngayDaoHan);
    }

    @Override
    public BigDecimal tinhLai() {
        return this.kyHan.tinhLai(this.soTien);
    }

    @Override
    public boolean isDaoHan() {
        // Khong can phai ghi de nopTien va rutTien
        Calendar d = new GregorianCalendar(); // lay ngay hien tai;
        // chuyen ca 2 ve chuoi de so sanh
//        String s1 = df.format(d.getTime());
        String s1 = df.format(d.getTime());
        String s2 = df.format(this.ngayDaoHan.getTime());
        return s1.equals(s2);
    }

    
    
    @Override
    public String toString() {
        return String.format("\n===========\nSo tk: %s\nTen tk: %s\nSo tien: %.1f VND\nLoai TK : co ky han",
                super.getStk(), super.getTenTK(), super.getSoTien());

    }

    /**
     * @return the kyHan
     */
    public KyHan getKyHan() {
        return kyHan;
    }

    /**
     * @param kyHan the kyHan to set
     */
    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    /**
     * @return the ngayDaoHan
     */
    public Calendar getNgayDaoHan() {
        return ngayDaoHan;
    }

    /**
     * @param ngayDaoHan the ngayDaoHan to set
     */
    public void setNgayDaoHan(Calendar ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }

}
