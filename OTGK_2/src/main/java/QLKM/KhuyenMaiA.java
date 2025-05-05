/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKM;

/**
 *
 * @author LE TUNG
 */
public class KhuyenMaiA extends KhuyenMai {

    private static int dem = 0;
    private double tyLeGiam;

    public KhuyenMaiA(double tyLeGiam) {
        maKM = String.format("A%02d", ++dem);
        this.tyLeGiam = tyLeGiam;
    }

    @Override
    public String toString() {
        return String.format("%s\nTy le giam : %.0f%%", super.toString(), this.tyLeGiam * 100);
    }

    /**
     * @return the tyLeGiam
     */
    public double getTyLeGiam() {
        return tyLeGiam;
    }

    /**
     * @param tyLeGiam the tyLeGiam to set
     */
    public void setTyLeGiam(double tyLeGiam) {
        this.tyLeGiam = tyLeGiam;
    }

}
