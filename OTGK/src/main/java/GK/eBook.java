/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GK;

/**
 *
 * @author LE TUNG
 */
public class eBook extends TaiLieuDienTu{
    private int soTrang;
    private DinhDang dinhdang;

    public eBook(String tieuDe, String tacGia, int namPhatHanh,int soTrang, DinhDang dinhdang) {
        super(tieuDe, tacGia, namPhatHanh);
        this.soTrang = soTrang;
        this.dinhdang = dinhdang;
    }

    @Override
    public void hienThi() {
        super.hienThi(); 
        System.out.printf("So trang: %d trang\nDinh dang: %s\n-----\n",soTrang,dinhdang);
    }

    @Override
    public String getType() {
        return "eBook";
    }
    
    
    
    
    
    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    /**
     * @return the dinhdang
     */
    public DinhDang getDinhdang() {
        return dinhdang;
    }

    /**
     * @param dinhdang the dinhdang to set
     */
    public void setDinhdang(DinhDang dinhdang) {
        this.dinhdang = dinhdang;
    }
    
    
    
}
