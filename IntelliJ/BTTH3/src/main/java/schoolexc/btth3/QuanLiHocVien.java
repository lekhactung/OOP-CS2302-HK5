/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolexc.btth3;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LE TUNG
 */
public class QuanLiHocVien {
    private  List<HocVien> ds = new ArrayList<>();

    
    public void themHV(){
        HocVien h = new HocVien();
        h.nhap1HV();
        this.getDs().add(h);   
    }
    
    public void themHV(HocVien... a){
        this.getDs().addAll(Arrays.asList(a));
    }
    
    public void themHV(String duongDan) throws FileNotFoundException{
        File f = new File(duongDan);
        try(Scanner sc = new Scanner(f)){
            while(sc.hasNext()){
                getDs().add(new HocVien(sc.nextLine(),sc.nextLine()));
            }
        }
    }
    
    public void hienThi(){
        this.getDs().forEach(h -> h.hienThi());
    }
    
    public void nhapDiem(){
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
