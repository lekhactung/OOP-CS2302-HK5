/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLKM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author LE TUNG
 */
public class QLSP {

    private List<SanPham> ds = new ArrayList<>();

    public void themSP(SanPham... a) {
        this.ds.addAll(Arrays.asList(a));
    }

    public void hienThi() {
        this.ds.forEach(s -> s.hienThi());
    }

    public SanPham timKiem(int id) {
        return this.ds.stream().filter(s -> s.getMaSP() == id).findFirst().get();
    }

    public SanPham timKiem(String kw) {
        return this.ds.stream().filter(s -> s.getTenSP().contains(kw))
                .findFirst().get();
    }

    public List<SanPham> timKiemTheoKM(String tenLopKM) throws ClassNotFoundException {
        Class c = Class.forName(tenLopKM);
        return this.ds.stream().filter(s -> s.isKM(c)).collect(Collectors.toList());
    }

    public void sapXep(){
//        this.ds.stream().sorted((s1,s2) -> -Double.compare(s1.getKhuyenMai().size(), s2.getKhuyenMai().size())).forEach(s -> s.hienThi());
        this.ds.sort((s1,s2) -> -Double.compare(s1.getKhuyenMai().size(), s2.getKhuyenMai().size()));
    }
    
    public List<SanPham> getDs() {
        return ds;
    }

    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }

}
