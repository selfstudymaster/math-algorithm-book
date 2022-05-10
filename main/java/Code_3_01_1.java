import java.util.Scanner;

class Code_3_01_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        boolean answer = isPrime(N);

        if (answer == true) {
            System.out.println("prime");
        }
        else {
            System.out.println("not prime");
        }
    }

    // 素数か素数でないかを判定するメソッド
    static boolean isPrime(long N) {
        // 2以上の整数N に対し、N が素数であればtrue、N が素数でなければfalseを戻す
        for (long i = 2; i <= N - 1; i++) {
            if (N % i == 0) {
                // N が i で割り切れた場合、この時点で素数ではないと分かる
                return false;
            }
        }
        return true;
    }
}
