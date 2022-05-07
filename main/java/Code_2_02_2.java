// ビット演算(AND, OR, XOR)の実装
import java.util.*;

class Code_2_02_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(); // a を入力する(10進数で入力)
        int b = sc.nextInt(); // b を入力する(10進数で入力)

        System.out.println(a & b); // a AND b の値を出力する(10進数で出力される)
        System.out.println(a | b); // a OR b の値を出力する(10進数で出力される)
        System.out.println(a ^ b); // a XOR b の値を出力する(10進数で出力される)
    }
}
