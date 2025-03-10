/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolexc.btth2.lib2;

/**
 *
 * @author LE TUNG
 */
public class Diem {

    private double hoanhDo, tungDo;
    private int tenDiem;
    private static int stt = 0;
    private double hoanhdDo;

    public Diem() {
        this(0, 0);
    }

    public Diem(double x, double y) {
        this.hoanhDo = x;
        this.tungDo = y;
        stt++;
        tenDiem = stt;
    }
    public double getHoanhDo() {
        return hoanhDo;
    }
    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }
    public double getTungDo() {
        return tungDo;
    }
    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }

    @Override
    public String toString() {
        return "Dien " + tenDiem + "(" + this.hoanhDo + "," + this.tungDo + ")\n";
    }

    public static double distance(Diem d1, Diem d2) {
//        return Math.sqrt(Math.pow(()));
        return Math.sqrt(Math.pow((d1.hoanhDo - d2.hoanhDo),2) + Math.pow((d1.tungDo - d2.tungDo),2)); 
    }
}
