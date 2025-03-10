import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

import static java.lang.Math.sqrt;


public class bt4 {
    public static int[] input(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * 20 + 1);
        }
        return a;
    }

    public static void output(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d \t", a[i]);
        }
        System.out.println();
    }

    public static boolean isPrime(int x) {
        if (x < 2) {
            return true;
        }
        for (int i = 2; i <= sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void primeSum(int[] a) {
        int sum = 0;
        for (int v : a) {
            if (isPrime(v)) {
                System.out.printf("%d \t", v);
                sum += v;
            }
        }
        System.out.println();
        System.out.println(sum);
    }


    public static void main(String[] args) {
//        int [] a = input(10);
        int[] a = {19, 20, 2, 4, 12, 18, 17, 12, 6, 1};
        output(a);
//        primeSum(a);
//        System.out.println(IntStream.of(a).sum());
//        System.out.println(IntStream.of(a).max().getAsInt());
//        System.out.println(IntStream.of(a).min().getAsInt());
//        System.out.println(IntStream.of(a).filter(x -> isPrime(x)).sum());
//        System.out.println(IntStream.of(a).filter(x -> isPrime(x)).min().getAsInt());
//        System.out.println(IntStream.of(a).filter(x -> isPrime(x)).max().getAsInt());
        Arrays.sort(a);
        int idx = Arrays.binarySearch(a, 19);
        output(a);
        System.out.println(idx);
    }

}
