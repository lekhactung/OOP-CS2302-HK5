/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lkt.btth2_tung.lib2;

/**
 *
 * @author admin
 */
public class HinhChuNhat {

    private Diem diemTrenTrai, diemDuoiPhai;

    public HinhChuNhat(Diem d1, Diem d2) {
        this.diemTrenTrai = d1;
        this.diemDuoiPhai = d2;
    }

    public double dienTich() {
        double chieuDai = diemDuoiPhai.getHoanhDo() - diemTrenTrai.getHoanhDo();
        double chieuRong = diemTrenTrai.getTungDo() - diemTrenTrai.getHoanhDo();
        return chieuDai * chieuRong;
    }

    public double chuVi() {
        double chieuDai = diemDuoiPhai.getHoanhDo() - diemTrenTrai.getHoanhDo();
        double chieuRong = diemTrenTrai.getTungDo() - diemTrenTrai.getHoanhDo();
        return (chieuDai + chieuRong) *2;
    }

    public void hienThi(){
        System.out.printf("Hinh chu nhat co toa do tren (%.1f,%.1f) toa do duoi (%.1f,%.1f) \nChu vi : %.1f \nDien tich : %.1f",
                diemTrenTrai.getHoanhDo(),diemTrenTrai.getTungDo(),diemDuoiPhai.getHoanhDo(),diemDuoiPhai.getTungDo(),this.chuVi(),this.dienTich());
    }
    
    /**
     * @return the diemTrenTrai
     */
    public Diem getDiemTrenTrai() {
        return diemTrenTrai;
    }

    /**
     * @param diemTrenTrai the diemTrenTrai to set
     */
    public void setDiemTrenTrai(Diem diemTrenTrai) {
        this.diemTrenTrai = diemTrenTrai;
    }

    /**
     * @return the diemDuoiPhai
     */
    public Diem getDiemDuoiPhai() {
        return diemDuoiPhai;
    }

    /**
     * @param diemDuoiPhai the diemDuoiPhai to set
     */
    public void setDiemDuoiPhai(Diem diemDuoiPhai) {
        this.diemDuoiPhai = diemDuoiPhai;
    }

}
