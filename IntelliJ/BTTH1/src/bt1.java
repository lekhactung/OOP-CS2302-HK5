import java.util.*;
public class bt1 {
    public static void main(String[] args) {
        Random r = new Random();
        int random = r.nextInt(100)+ 1;
        Scanner scanner = new Scanner(System.in);
        int guess;
        System.out.println("Chao mung den voi tro choi doan so!");
        System.out.println("Hay doan mot so tu 1 den 100! ");

        while(true){
            System.out.print("Nhap so muon doan: ");
            guess = scanner.nextInt();
            if(guess<random){
                System.out.println("So ban doan nho hon!");
            } else if(guess > random){
                System.out.println("So ban doan lon hon!");
            } else{
                System.out.println("Ban da doan dung so " + random + " !");
                break;
            }
        }
        scanner.close();
    }
}
