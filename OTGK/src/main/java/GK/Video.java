/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GK;

/**
 *
 * @author LE TUNG
 */
public class Video extends TaiLieuDienTu{
    private double thoiLuong;
    private ChatLuongVideo chatLuong;

    public Video( String tieuDe, String tacGia, int namPhatHanh,double thoiLuong, ChatLuongVideo chatLuong) {
        super(tieuDe, tacGia, namPhatHanh);
        this.thoiLuong = thoiLuong;
        this.chatLuong = chatLuong;
    }

    @Override
    public void hienThi() {
        super.hienThi(); 
        System.out.printf("Thoi luong: %.0f phut\nChat luong: %s\n-----\n",thoiLuong,chatLuong);
    }

    @Override
    public String getType() {
        return "Video";
    }
    
    
    /**
     * @return the thoiLuong
     */
    public double getThoiLuong() {
        return thoiLuong;
    }

    /**
     * @param thoiLuong the thoiLuong to set
     */
    public void setThoiLuong(double thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    /**
     * @return the chatLuong
     */
    public ChatLuongVideo getChatLuong() {
        return chatLuong;
    }

    /**
     * @param chatLuong the chatLuong to set
     */
    public void setChatLuong(ChatLuongVideo chatLuong) {
        this.chatLuong = chatLuong;
    }
    
    
}
