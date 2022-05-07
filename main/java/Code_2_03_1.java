//　プログラミングにおける関数の例
import java.util.Scanner;

class Code_2_03_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(func1()); // 2021と出力
        System.out.println(func2(500)); // 1501と出力
        System.out.println(func2(500)); // 1502と出力
    }

    static int cnt = 1000;

    static int func1() {
        return 2021;
    }

    static  int func2(int pos) {
        cnt += 1;
        return cnt + pos;
    }

}
