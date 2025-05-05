/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GK;

/**
 *
 * @author LE TUNG
 */
public abstract class TaiLieuDienTu {

    private static int dem = 0;
    private String maNoiDung;
    private String tieuDe;
    private String tacGia;
    private int namPhatHanh;

    {
        maNoiDung = String.format("CONTENT%05d", ++dem);
    }

    public TaiLieuDienTu(String tieuDe, String tacGia, int namPhatHanh) {
        this.tieuDe = tieuDe;
        this.tacGia = tacGia;
        this.namPhatHanh = namPhatHanh;
    }

    public void hienThi() {
        System.out.printf("Ma noi dung: %s\nTieu de: %s\nTac gia: %s\nNam phat hanh: %d\n",
                 maNoiDung, tieuDe, tacGia, namPhatHanh);
    }

    public abstract String getType();
    
    /**
     * @return the maNoiDung
     */
    public String getMaNoiDung() {
        return maNoiDung;
    }

    /**
     * @return the tieuDe
     */
    public String getTieuDe() {
        return tieuDe;
    }

    /**
     * @param tieuDe the tieuDe to set
     */
    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    /**
     * @return the tacGia
     */
    public String getTacGia() {
        return tacGia;
    }

    /**
     * @param tacGia the tacGia to set
     */
    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    /**
     * @return the namPhatHanh
     */
    public int getNamPhatHanh() {
        return namPhatHanh;
    }

    /**
     * @param namPhatHanh the namPhatHanh to set
     */
    public void setNamPhatHanh(int namPhatHanh) {
        this.namPhatHanh = namPhatHanh;
    }

}
