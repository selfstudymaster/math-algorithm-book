// 約数をすべて出力するプログラム
import java.util.Scanner;

class Code_3_01_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        for (long i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                // iを約数に追加
                System.out.println(i);
                if (i != N / 1) {
                    // i ≠ N/i のとき、N/i も約数に追加
                    System.out.println(N / i);
                }
            }
        }
    }
}
