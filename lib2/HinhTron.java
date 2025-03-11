/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lkt.btth2_tung.lib2;

/**
 *
 * @author admin
 */
public class HinhTron {

    private Diem toaDoTam;
    private double banKinh;

    public HinhTron(Diem toaDoTam, double banKinh) {
        this.toaDoTam = toaDoTam;
        this.banKinh = banKinh;
    }

    public double dienTich() {
        return Math.PI * banKinh * banKinh;
    }

    public double chuVi() {
        return Math.PI * 2 * banKinh;
    }

    public int xdVtDiemDt(Diem d) {
        double kc = this.toaDoTam.distance(d);
        return Double.compare(kc, this.banKinh);
    }

    public int xdVtDtDt(HinhTron d) {
        double kc = this.toaDoTam.distance(d.toaDoTam);
        double t = this.banKinh = d.banKinh;
        return Double.compare(kc, t);
    }

    public void hienThi() {
        System.out.printf("Dien tich hinh tron la : %.1f", dienTich());
        System.out.printf("Chu vi hinh tron la : %.1f", chuVi());
        

    }

    /**
     * @return the toaDoTam
     */
    public Diem getToaDoTam() {
        return toaDoTam;
    }

    /**
     * @param toaDoTam the toaDoTam to set
     */
    public void setToaDoTam(Diem toaDoTam) {
        this.toaDoTam = toaDoTam;
    }

    /**
     * @return the banKinh
     */
    public double getBanKinh() {
        return banKinh;
    }

    /**
     * @param banKinh the banKinh to set
     */
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

}
