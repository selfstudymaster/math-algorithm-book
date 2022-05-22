// 選択ソートの実装

import java.util.Scanner;

class Code_3_06_2 {
    public static void main(String[] args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }

        // 選択ソート
        for (int i = 1; i <= N; i++) {
            int minPosition = i;
            int minValue = A[i];

            for (int j = i + 1; j <= N; j++) {
                if (A[j] < minValue) {
                    // minPosition は最小値のインデックス（1 ～ N）
                    minPosition = j;
                    // minValue は現時点での最小値
                    minValue = A[j];
                }
            }
            // 次の3行で A[i]とA[minPosition]を交換
            int temp = A[i];
            A[i] = A[minPosition];
            A[minPosition] = temp;
        }

        // 出力
        for (int i = 1; i <= N; i++) {
            System.out.println(A[i]);
        }
    }
}
