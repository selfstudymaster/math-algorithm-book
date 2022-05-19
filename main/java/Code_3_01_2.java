// 高速な素数判定を行うプログラム
import java.util.Scanner;

class Code_3_01_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        boolean answer = isPrime(N);

        if (answer == true) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    // 素数か素数でないかを判定するメソッド
    static boolean isPrime(long N) {
        // 2 以上の整数 N に対し、N が素数であれば true、素数でなければ false を戻す
        // N を 2から√Nまでの値で割った余りが0ならば、Nは素数ではない。i * i <= N は、i <= √N を表している
        for (long i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
