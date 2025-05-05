/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKM;

import java.time.LocalDate;

/**
 *
 * @author LE TUNG
 */
public abstract class KhuyenMai {

    protected String maKM;

    @Override
    public String toString() {
        return String.format("~Ma KM : %s", maKM);
    }

    public String getMaKM() {
        return maKM;
    }

    public void setMaKM(String maKM) {
        this.maKM = maKM;
    }

}
