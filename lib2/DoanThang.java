/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lkt.btth2_tung.lib2;

/**
 *
 * @author admin
 */
public class DoanThang {

    private Diem diemDau, diemCuoi;

    public DoanThang(Diem d1, Diem d2) {
        this.diemDau = d1;
        this.diemCuoi = d2;
    }

    public void hienThi() {
        System.out.printf("[(%.1f,%.1f),(%.1f,%.1f)]\n", this.diemDau.getHoanhDo(), this.diemDau.getTungDo(), this.diemCuoi.getHoanhDo(), this.diemCuoi.getTungDo());
    }

    public double tinhDoDai() {
        return this.diemDau.distance(this.diemCuoi);
    }

    public Diem timTrungDiem() {
        double x = (this.diemDau.getHoanhDo() + this.diemCuoi.getHoanhDo()) / 2;
        double y = (this.diemDau.getTungDo() + this.diemCuoi.getTungDo()) / 2;
        return new Diem(x,y);
    }
    
    public boolean isParallel(DoanThang d){
        double v1 = (this.diemDau.getHoanhDo() - this.diemCuoi.getHoanhDo()) * (d.diemDau.getTungDo() - d.diemCuoi.getTungDo());
        double v2 = (this.diemDau.getHoanhDo() - this.diemCuoi.getHoanhDo()) * (d.diemDau.getTungDo() - d.diemCuoi.getTungDo());

        return Double.compare(v1, v2) == 0;
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