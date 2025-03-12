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
    
    @Override
    public String toString(){
        return "Doan Thang [ ( "+diemDau.getHoanhDo() + " , " + diemDau.getTungDo() + ") , (" + diemCuoi.getHoanhDo() + " , " + diemCuoi.getTungDo() +" )]";
    }
    
    public double lengthOfLine(){
        return Diem.distance(diemDau, diemCuoi);
    }
    
    public Diem midPoint(){
        int x1 = diemDau.getHoanhDo();
        int x2 = diemCuoi.getHoanhDo();
        int y1 = diemDau.getTungDo();
        int y2 = diemDau.getTungDo();
        return new Diem((x1+x2)/2,(y1+y2)/2);
    }
    
    public boolean isParallel (DoanThang dt1, DoanThang dt2){
        return false;
    }
}
