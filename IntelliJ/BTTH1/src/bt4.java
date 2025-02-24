import static java.lang.Math.sqrt;
import java.util.*;

public class bt4 {
    public static boolean prime(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (prime(11)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
