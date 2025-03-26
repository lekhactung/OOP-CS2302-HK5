/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lkt.btth2_tung.lib2;

/**
 *
 * @author admin
 */
public class Diem {
    private double hoanhDo, tungDo;
    
    public Diem(double x, double y){
        this.hoanhDo = x;
        this.tungDo = y;
    }
    
    public Diem(){
        this(0,0);
    }

    /**
     * @return the hoanhDo
     */
    public double getHoanhDo() {
        return hoanhDo;
    }

    /**
     * @param hoanhDo the hoanhDo to set
     */
    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    /**
     * @return the tungDo
     */
    public double getTungDo() {
        return tungDo;
    }

    /**
     * @param tungDo the tungDo to set
     */
    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }
    
    public void hienThi(){
        System.out.printf("(%.1f , %.1f)\n", this.hoanhDo, this.tungDo);
    }
    
    public double distance(Diem d){
        return Math.sqrt(Math.pow(this.hoanhDo-d.hoanhDo,2) + Math.pow(this.tungDo-d.tungDo,2 ));
    }
    
}
