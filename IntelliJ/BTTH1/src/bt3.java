import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;
public class bt3 {
    public static void emailOutput(Scanner scanner){
        System.out.println("Nhap dia chi email cua ban : ");
        String email = scanner.nextLine();
        int atIndex = email.indexOf('@');
        if(atIndex!=-1){
            String emailName = email.substring(0,atIndex);
            System.out.println(emailName);
        } else{
            System.out.println("Email khong hop le!");
        }
    }
    public static int uppercaseCount(Scanner scanner){
        int count = 0;
        System.out.println("Nhap 1 chuoi : ");
        String txt = scanner.nextLine();
        for(int i=0;i<txt.length();i++){
            if(Character.isUpperCase(txt.charAt(i))) count++;
        }
        return count;
    }
    public static void DocFile() throws java.io.FileNotFoundException{
        String pathIn = "resources/input.txt";
        String pathOut = "resources/output.txt";
        File f = new File(pathIn);
        File fo = new File(pathOut);
        try(Scanner sc = new Scanner(f); PrintWriter w = new PrintWriter(fo)){
            String s = "";
            while(sc.hasNextLine()){
                s+=sc.nextLine();
            }
            s = s.replaceAll("\\{file}","tap tin");
            w.println(s);
        }
    }
    public static void ChuanHoaChuoi(){
        String s = "    JAVA    ;;;, ,,,; ;;, , is  ;;,,;;,,,   simPle!  ";
        System.out.println(s);
        String[] a  = s.trim().split("[,;\\s]+");
        System.out.println(a.length + " Ky tu trong xau ");

        StringBuilder b = new StringBuilder();
        for(var v : a){
            b.append(v.substring(0,1).toUpperCase(Locale.ROOT)).append(v.substring(1).toLowerCase()).append(" ");
        }
        System.out.println(b.toString().trim());
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
//        DocFile();
        ChuanHoaChuoi();
    }
}
