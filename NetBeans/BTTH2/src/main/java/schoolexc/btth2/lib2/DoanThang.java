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
    public DoanThang() {
        this.diemDau = new Diem(0, 0);
        this.diemCuoi = new Diem(0, 0);

    }
    public DoanThang(Diem diemDau, Diem diemCuoi) {
        this.diemDau = diemDau;
        this.diemCuoi = diemCuoi;
    }
    public Diem getDiemDau() {
        return diemDau;
    }
    public void setDiemDau(Diem diemDau) {
        this.diemDau = diemDau;
    }
    public Diem getDiemCuoi() {
        return diemCuoi;
    }
    public void setDiemCuoi(Diem diemCuoi) {
        this.diemCuoi = diemCuoi;
    }
    @Override
    public String toString() {
        return "Doan thang [(" + diemDau.getHoanhDo() + "," + diemDau.getTungDo() + "), (" + diemCuoi.getHoanhDo() + "," + diemCuoi.getTungDo() + ")]";
    }

    public double lengthOfLine() {
        return Diem.distance(this.diemDau, this.diemCuoi);
    }

//    public Diem midPoint() {
//        double x1 = diemDau.getHoanhDo();
//        double x2 = diemCuoi.getHoanhDo();
//        double y1 = diemDau.getTungDo();
//        double y2 = diemCuoi.getTungDo();
//        return new Diem((x1+x2)/2,(y1+y2)/2);
//    }
}
