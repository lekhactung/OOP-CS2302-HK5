/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKhuyenMai;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author LE TUNG
 */
public class QLSanPham {

    private List<SanPham> ds = new ArrayList<>();

    public void themSP(SanPham... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void hienThi() {
        this.ds.forEach(sp -> sp.hienThi());
    }

    public SanPham timKiem(int id) {
        return this.ds.stream().filter(sp -> sp.getMaSP() == id).findFirst().get();
    }

    public List<SanPham> timKiem(String kw) {
        return this.ds.stream().filter(sp -> sp.getTenSP().contains(kw)).collect(Collectors.toList());
    }
    
    public void sapXep(){
        this.ds.sort((a,b) -> -(a.getDskm().size() - b.getDskm().size()));
    }
    
    public List<SanPham> timKiemTheoMaKM(String tenLopKM) throws ClassNotFoundException{
        Class c = Class.forName(tenLopKM);
        return this.ds.stream().filter(s -> s.isKM(c)).collect(Collectors.toList());
    }
    
    public List<SanPham> getDs() {
        return ds;
    }

    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }

}
