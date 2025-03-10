/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolexc.btth2.lib2;

/**
 *
 * @author LE TUNG
 */
public class DoanThang {
    private Diem diemDau, diemCuoi;

    public DoanThang(Diem d1, Diem d2) {
        this.diemDau = d1;
        this.diemCuoi = d2;
    }
    public DoanThang(){
        this(new Diem(0,0), new Diem(0,0));
    }

    /**
     * @return the diemDau
     */
    public Diem getDiemDau() {
        return diemDau;
    }

    /**
     * @param diemDau the diemDau to set
     */
    public void setDiemDau(Diem diemDau) {
        this.diemDau = diemDau;
    }

    /**
     * @return the diemCuoi
     */
    public Diem getDiemCuoi() {
        return diemCuoi;
    }

    /**
     * @param diemCuoi the diemCuoi to set
     */
    public void setDiemCuoi(Diem diemCuoi) {
        this.diemCuoi = diemCuoi;
    }
    
    
}
