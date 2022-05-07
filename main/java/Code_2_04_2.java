// XまたはYの倍数の個数を出力するプログラム
import java.util.Scanner;

class Code_2_04_2 {

    public static void main(String[] args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        // 答えを求める
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (i % X == 0 || i % Y ==0) {
                cnt++;
            }
        }

        // 出力
        System.out.println(cnt);
    }
}
