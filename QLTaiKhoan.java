/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class QLTaiKhoan {

    private List<TaiKhoan> ds = new ArrayList<>();

    public void themTK(TaiKhoan... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void hienThi() {
        this.ds.forEach(tk -> tk.hienThi());
    }

    public List<TaiKhoan> timKiem(String kw) {
        return this.ds.stream().filter(tk -> tk.getTenTK().contains(kw)).toList();
    }

//    public TaiKhoan timKiem(String stk){
//        return this.ds.stream().filter(tk -> tk.getStk().equals(stk)).findFirst().get();
//    }
    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }

    public List<TaiKhoan> getDs() {
        return ds;
    }

}
