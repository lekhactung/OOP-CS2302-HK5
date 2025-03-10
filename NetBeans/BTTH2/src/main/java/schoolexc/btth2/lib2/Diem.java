/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolexc.btth2.lib2;

public class Diem {

    private int hoanhDo, tungDo;

    public Diem (int x,int y){
        this.hoanhDo = x;
        this.tungDo = y;
    }
    
    public Diem(){
        this(0,0);
    }
    
    public int getHoanhDo() {
        return hoanhDo;
    }

    public void setHoanhDo(int hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public int getTungDo() {
        return tungDo;
    }

    public void setTungDo(int tungDo) {
        this.tungDo = tungDo;
    }

    @Override
    public String toString() {
        return "( " + hoanhDo + " ; " + tungDo + " )";
    }

    public static double distance(Diem d1, Diem d2) {
        return Math.sqrt(Math.pow((d1.hoanhDo - d2.hoanhDo), 2) + Math.pow((d1.tungDo - d2.tungDo), 2));
    }
}
