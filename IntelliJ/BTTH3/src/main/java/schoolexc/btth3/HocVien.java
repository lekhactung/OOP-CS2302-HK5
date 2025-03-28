/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package schoolexc.btth3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author LE TUNG
 */
public class HocVien {
    private static int dem=0;
    private int id = ++dem;
    private String ten;
    private LocalDate ngaySinh;
    private double[] diem;

    public HocVien() {
    }
    
    public HocVien(String ten, LocalDate ngaySinh) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    public HocVien(String ten, String ngaySinh) {
        this(ten,LocalDate.parse(ngaySinh,CauHinh.FORMATER));
    }
    
    public void hienThi(){
        System.out.printf("%d - %s - %s\n",this.id, this.ten, this.ngaySinh.format(CauHinh.FORMATER));
        if(this.diem != null){
            for(var d : this.diem){
                System.out.printf("%.1f\t",d);
            }
            System.out.println("");
        }
    }

    public void nhap1HV(){
        System.out.print("Ho ten = ");
        this.ten = CauHinh.SC.nextLine();
        System.out.println("Ngay sinh (dd/MM/yyyy) = ");
        this.ngaySinh = LocalDate.parse(CauHinh.SC.nextLine(), CauHinh.FORMATER);
    }
    
    public void nhapDiem(){
        System.out.printf("== Hoc sinh %s ==\n", this.getTen());
        this.diem = new double[CauHinh.SO_MON];
        for(int i=0;i<CauHinh.SO_MON;i++){
            System.out.printf("Mon thu %d : ", i+1 );
            this.diem[i] = Double.parseDouble(CauHinh.SC.nextLine());
//            this.diem[i] = CauHinh.SC.nextDouble();
        }
    }
    
    
    
    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the diem
     */
    public double[] getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double[] diem) {
        this.diem = diem;
    }
    
    
    
    
} 
