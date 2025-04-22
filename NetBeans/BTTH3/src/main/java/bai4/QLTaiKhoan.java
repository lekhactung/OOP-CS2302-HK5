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
 * @author LE TUNG
 */
public class QLTaiKhoan {
    private List<TaiKhoan> ds = new ArrayList<>();

    public void themTK(TaiKhoan... a){
        this.ds.addAll(Arrays.asList(a));
    }
    
    public void xuatDSTK(){
        this.ds.forEach(tk -> System.out.println(tk));
    }
    
    public TaiKhoan timKiem(String stk){
        return this.ds.stream()
                .filter(tk -> tk.getStk().equals(stk))
                .findFirst().get();
    }
    
    public List<TaiKhoan> getDs() {
        return ds;
    }

    public void setTk(List<TaiKhoan> ds) {
        this.ds = ds;
    }
    
    
    
    
}
