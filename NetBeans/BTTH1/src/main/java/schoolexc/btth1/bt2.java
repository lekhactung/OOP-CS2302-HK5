package schoolexc.btth1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class bt2 {
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
//        char ch[] = new char[txt.length()+1];
        for(int i=0;i<txt.length();i++){
            if(Character.isUpperCase(txt.charAt(i))) count++;
        }
        return count;
    }

    public static void inputf() throws java.io.FileNotFoundException{
        File f = new File("../resources/data.txt");
        try(Scanner scanner = new Scanner(f)){
            System.out.println("hello");
        }
    }

    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
//        emailOutput(scanner);
//        int count = uppercaseCount(scanner);
        inputf();
        System.out.println(uppercaseCount(scanner));

    }  
}
