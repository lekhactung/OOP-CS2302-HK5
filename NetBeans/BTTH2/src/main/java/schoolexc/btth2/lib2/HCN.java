/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolexc.btth2.lib2;

/**
 *
 * @author LE TUNG
 */
public class HCN {
    private int height,length;
    public HCN(){
        this(1,0);
    }
    public HCN(int x,int y){
        this.length = x;
        this.height = y;
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public double chuVi(){
        return (this.length+this.height)*2;
    }
    public double dienTich(){
        return this.length*this.height;
    }
}
