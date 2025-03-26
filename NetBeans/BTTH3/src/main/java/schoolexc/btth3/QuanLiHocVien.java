/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolexc.btth3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


/**
 *
 * @author LE TUNG
 */
public class QuanLiHocVien {
    
    private List<HocVien> ds = new ArrayList<>();
    
    public void themHv(HocVien... a) {
        this.getDs().addAll(Arrays.asList(a));
    }

    public void themHv() {
        HocVien h = new HocVien();
        h.nhap1HV();
        this.getDs().add(h);

    }

    public void themHv(String duongDan) throws FileNotFoundException {
        File f = new File(duongDan);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                getDs().add(new HocVien(sc.nextLine(), sc.nextLine()));
            }
        }
    }
    
    public void hienThi() {
        this.getDs().forEach(p -> p.hienThi());
    }

    
    public void nhapDiem(){
        this.getDs().forEach(h -> h.nhapDiem());
    }
    
    public HocVien timKiem(int id){
        return this.ds.stream().filter(h -> h.getId() == id).findFirst().get();
    }
    
    public List<HocVien> timKiem(String kw){
        return this.ds.stream().filter(h -> h.getHoTen().contains(kw)).collect(Collectors.toList());
    }
    
    public List<HocVien> timKiem(){
        return this.ds.stream().filter(h -> h.isHb()).collect(Collectors.toList());
    }
    
    public void xuatHb(String duongDan) throws FileNotFoundException{
        File f = new File(duongDan);
        try(PrintWriter w = new PrintWriter(f)){
            List<HocVien> hb = this.timKiem();
            for(var h : hb){
                w.printf("%d - %s %.1f\n", h.getId(), h.getHoTen(), h.tinhTB());
            }
        }
    }
    
    public void sapXep(){
        this.ds.sort((h1,h2) -> {
            double t1 = h1.tinhTB();
            double t2 = h2.tinhTB();
            return -Double.compare(t1, t2);
        });
    }

    public List<HocVien> getDs() {
        return ds;
    }

    public void setDs(List<HocVien> ds) {
        this.ds = ds;
    }
    
}