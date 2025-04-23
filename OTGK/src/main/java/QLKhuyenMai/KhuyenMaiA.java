/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKhuyenMai;

/**
 *
 * @author LE TUNG
 */
public class KhuyenMaiA extends KhuyenMai{
    private static int dem =0;
    private double tyLeGiam;

    public KhuyenMaiA(double tyLeGiam) {
        this.maKM = String.format("A%02d", ++dem);
        this.tyLeGiam = tyLeGiam;
    }

    @Override
    public String toString() {
        return String.format("%s - Ty le giam : %.1f", super.toString(), this.tyLeGiam );
    }

    
    
    public void setTyLeGiam(double tyLeGiam) {
        this.tyLeGiam = tyLeGiam;
    }

    public double getTyLeGiam() {
        return tyLeGiam;
    }
    
    
}
