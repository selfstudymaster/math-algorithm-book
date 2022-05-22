// 分割島地方による区間の合計値の計算

import java.util.*;

class Code_3_06_5 {
    static int N;
    static int[] A;
    public static void main(String[] args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        A = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }
        // 再帰呼び出し → 答えの出力
        int answer = solve(1, N + 1);
        System.out.println(answer);
    }
    // 再帰呼び出し
    static int solve(int l, int r) {
        if (r - l == 1) {
            return A[l];
        }
        // 区間 [l, r) の中央で分割する
        int m = (l + r) / 2;
        // s1 は A[l] + ... + A[m-1] の合計値となる
        int s1 = solve(l, m);
        // s2 は A[m] + ... + A[r-1] の合計値となる
        int s2 = solve(m, r);
        return s1 + s2;
    }
}
