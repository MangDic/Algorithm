package baekjoon_Short;


public class ployd {
    public static final int INF = 10000;
    public static void main(String[] args) {
        int[][] d = new int[][]{{0,   1,   INF, 4},
                {INF, 0,   3,   2},
                {1,   INF, 0,   5},
                {INF, INF, INF, 0}};

        // 경유지
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if (d[i][j] > d[i][k] + d[k][j]) {
                        d[i][j] = d[i][k] + d[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (d[i][j] == INF)
                    System.out.printf("%4s", "INF");
                else
                    System.out.printf("%4d", d[i][j]);
            }
            System.out.println();
        }
    }
}


