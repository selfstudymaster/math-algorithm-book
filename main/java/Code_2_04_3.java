// 2枚のカードの全検索
// 2枚のカードに1以上N以下の整数を1つずつ書き込み、合計がS以下となる書き方がいくつあるか出力する
import java.util.Scanner;

class Code_2_04_3 {
    public static void main(String[] args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();

        // 答えを求める
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i + j <= S) {
                    cnt++;
                }
            }
        }
        // 出力
        System.out.println(cnt);
    }
}
