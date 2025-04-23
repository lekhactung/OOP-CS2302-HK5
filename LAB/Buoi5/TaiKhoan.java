/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

/**
 *
 * @author admin
 */
public abstract class TaiKhoan {

    private static int dem = 0;
    private String stk;
    private String tenTK;
    protected double soTienTK;

    {
        stk = String.format("%06d", ++dem);
    }

    public TaiKhoan(String tenTK, double soTienTK) {
        this.tenTK = tenTK;
        this.soTienTK = soTienTK;
    }

    public void hienThi() {
        System.out.printf("STK : %s\nTen tai khoan : %s\nSo tien : %.1f\n", stk, tenTK, soTienTK);
    }

    public abstract boolean isDaoHan();

    public abstract double tinhLai();

    public void nopTien(double soTien) {
        if (this.isDaoHan()) {
            this.soTienTK += soTien;
        }
    }

    public void rutTien(double st) {
        if (this.isDaoHan() && this.soTienTK >= st) {
            this.soTienTK -= st;
        }
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
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
     * @return the soTienTK
     */
    public double getSoTienTK() {
        return soTienTK;
    }

    /**
     * @param soTienTK the soTienTK to set
     */
    public void setSoTienTK(double soTienTK) {
        this.soTienTK = soTienTK;
    }

}
