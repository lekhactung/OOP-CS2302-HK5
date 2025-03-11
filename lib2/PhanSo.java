/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lkt.btth2_tung.lib2;

/**
 *
 * @author admin
 */
public class PhanSo {

    private int tuSo, mauSo;
    private static int soPhanSo = 0;

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        soPhanSo++;
    }

    public PhanSo() {
        this(0, 1);
    }

    public static int ucln(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void rutGon() {
        int ucln = ucln(this.tuSo, this.mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
    }

    public PhanSo cong(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo + ps.tuSo * this.mauSo;
        int mau = this.mauSo * ps.mauSo;
        PhanSo result = new PhanSo(tu, mau);
        result.rutGon();
        return result;
    }

    public int soSanh(PhanSo ps) {
        if ((double) this.tuSo / this.mauSo < (double) ps.tuSo / ps.mauSo) {
            return -1;
        } else if ((double) this.tuSo / this.mauSo > (double) ps.tuSo / ps.mauSo) {
            return 1;
        }
        return 0;
    }

    public void hienThiPS() {
        System.out.println(this.tuSo + "/" + this.mauSo + "\t");
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    public static int getSoPhanSo() {
        return soPhanSo;
    }

    public static void setSoPhanSo(int aSoPhanSo) {
        soPhanSo = aSoPhanSo;
    }

}
