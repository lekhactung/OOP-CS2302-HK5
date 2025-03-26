/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package  lkt.tungbtth3;

/**
 *
 * @author admin
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public PhanSo() {
        this(0, 1);
    }
    
    public static int ucln(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b)
            if (a > b)
                a -= b;
            else
                b -= a;
        
        return a;
    }
    
    public PhanSo rutGon() {
        int u = ucln(this.tuSo, this.mauSo);
        return new PhanSo(this.tuSo / u, this.mauSo / u);
    }
    
    public PhanSo cong(PhanSo p) {
        // this + p
        int t = this.tuSo * p.mauSo + this.mauSo * p.tuSo;
        int m = this.mauSo * p.mauSo;
        return new PhanSo(t, m);
    }
    
    public int soSanh(PhanSo p) {
        double v1 = this.tuSo*1.0 / this.mauSo;
        double v2 = p.tuSo*1.0 / p.mauSo;
        
        return Double.compare(v1, v2);
    }
    
    public void hienThi() {
        System.out.printf("%d/%d\t", this.tuSo, this.mauSo);
    }

    /**
     * @return the tuSo
     */
    public int getTuSo() {
        return tuSo;
    }

    /**
     * @param tuSo the tuSo to set
     */
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    /**
     * @return the mauSo
     */
    public int getMauSo() {
        return mauSo;
    }

    /**
     * @param mauSo the mauSo to set
     */
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
}
