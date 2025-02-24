import java.io.File;
import java.io.FileNotFoundException;
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
//        char ch[] = new char[txt.length()+1];
        for(int i=0;i<txt.length();i++){
            if(Character.isUpperCase(txt.charAt(i))) count++;
        }
        return count;
    }
    public static void inputf() throws java.io.FileNotFoundException{
        String path = "resources/data.txt";
        File f = new File(path);
        try(Scanner scanner = new Scanner(f)){
            while(scanner.hasNext()){
                String hoten = scanner.nextLine();
                int namsinh = scanner.nextInt();
                double diem = scanner.nextDouble();
                scanner.nextLine();
                System.out.printf("Ho ten : %s - Nam sinh : %d - Diem : %.1f%n",hoten,namsinh,diem);
            }

        scanner.close();
        }
    }
    public static void countW(Scanner scanner){
        System.out.println("Nhap chuoi : ");
        String s = scanner.nextLine();
        System.out.println(s);

    }
    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in);
//        inputf();
        countW(scanner);
    }
}
