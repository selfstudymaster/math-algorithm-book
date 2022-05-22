// 再帰関数による階上の計算
// Nが1の場合、1を戻す、Nが2以上の場合、(操作 N - 1 の計算結果) x N を戻す
import java.util.Scanner;

class Code_3_06_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(func(N));
    }

    static int func(int N) {
        if (N == 1) {
            // このような場合分けすべきケースを「ベースケース」といいます
            return 1;
        }
        return func(N - 1) * N;
    }
}
