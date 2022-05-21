import java.util.Random;

// 円周率πの近似値を求めるプログラム
class Code_3_05_1 {
    public static void main(String[] args) {
        Random rd = new Random();
        // 試行回数 N (適宜変更する)
        int N = 10000;
        int M = 0;

        for (int i = 1; i <= N; i++) {
            double px = rd.nextDouble();
            double py = rd.nextDouble();

            // 原点からの距離は sqrt(px * px + py * py)
            // これが 1 以下であれば良いので、条件は「px * px + py * py <= 1」（「sqrt(px * px + py * py) <= 1」と同値）
            if (px * px + py * py <= 1.0) {
                M++;
            }
        }
        System.out.format("%.12f\n", 4.0 * M / N);
    }
}
