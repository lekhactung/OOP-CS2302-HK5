/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolexc.btth3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDate;
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

    public void themHV() {
        HocVien h = new HocVien();
        h.nhap1HV();
        this.getDs().add(h);
    }

    public void themHV(HocVien... a) {
        this.getDs().addAll(Arrays.asList(a));
    }

    public void themHV(String duongDan) throws FileNotFoundException {
        File f = new File(duongDan);
        try (Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                getDs().add(new HocVien(sc.nextLine(), sc.nextLine()));
            }
        }
    }

    public HocVien timKiem(int id) {
        return this.ds.stream().filter(h -> h.getId() == id).findFirst().get();
    }

    public List<HocVien> timKiem(String kw) {
        return this.ds.stream().filter(h -> h.getTen().contains(kw)).collect(Collectors.toList());
    }

    public List<HocVien> timKiem() {
        return this.ds.stream().filter(h -> h.isHB()).collect(Collectors.toList());  
    }
    
    public void sapXep(){
        this.ds.sort((HocVien h1,HocVien h2) -> {
            double t1 = h1.tinhDiemTB();
            double t2 = h2.tinhDiemTB();
            return -Double.compare(t1, t2);
        }); 
    }
    
   public void xuatHB() throws FileNotFoundException{
        File f = new File("src/main/resources/output.txt");
        try(PrintWriter w = new PrintWriter(f)){
            List<HocVien> hb = this.timKiem();
            for(var h : hb ){
                w.printf("%d - %s %.1f\n", h.getId(), h.getTen(), h.tinhDiemTB());
            }
        }
    } 
    
    public long countYear(){
        return this.ds.stream().filter(h -> h.nhoHon18()).count();
    }
   
    public long countYear1(){
        return this.ds.stream().filter(h -> h.tu18Den23()).count();
    }
        
    public void hienThi() {
        this.getDs().forEach(h -> h.hienThi());
    }

    public void nhapDiem() {
        this.getDs().forEach(h -> h.nhapDiem());
    }

    /**
     * @return the ds
     */
    public List<HocVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<HocVien> ds) {
        this.ds = ds;
    }

}
