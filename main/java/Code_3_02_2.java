import java.util.Scanner;

// 最大公約数を求めるユークリッドの誤除法の実装例
public class Code_3_02_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        System.out.println(GCD(A, B));
    }

    static long GCD(long A, long B) {
        // 正の整数 A と B の最大公約数を戻す関数
        // GDC は Great Common Divisor(最大公約数)の略
        while (A >= 1 && B >= 1) {
            if (A < B) {
                // A < B の場合、大きい方 B を書き換える
                B %= A;
            } else {
                // A >= B の場合、大きい方 A を書き換える
                A %= B;
            }
        } if (A >= 1) {
            return A;
        }
        return B;
    }
}
