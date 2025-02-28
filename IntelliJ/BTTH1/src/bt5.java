public class bt5 {
    public static int [][] input(int n){
        int [][] a = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j = 0;j<n;j++){
                a[i][j] = (int) (Math.random()*9+1);
            }
        }
        return a;
    }
    public static void output(int [][]a){
        for(int i=0;i<a.length;i++){
            for(int j = 0;j<a.length;j++){
                System.out.printf("%d \t",a[i][j]);
            }
            System.out.println();
        }
    }
    public static void Sum(int [][] a){
        int sumR =0, sumC = 0;
        for(int i =0;i<a.length;i++){
            sumR = 0;
            for(int j=0;j<a.length;j++){
                sumR += a[i][j];
            }
            System.out.printf("Tong dong thu %d la : %d \n",(i+1),sumR);
        }
        for(int i =0;i<a.length;i++){
            sumC = 0;
            for(int j=0;j<a.length;j++){
                sumC += a[j][i];
            }
            System.out.printf("Tong cot thu %d la : %d \n",(i+1),sumC);
        }
    }

    public static void main(String[] args){
        int [][]a = input(5);
        output(a);
        Sum(a);
//        System.out.println(a.length);
    }
}
