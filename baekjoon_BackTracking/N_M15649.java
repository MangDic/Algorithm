package baekjoon_BackTracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class N_M15649 {
    private static Queue<Integer> list = new LinkedList<>();
    private static boolean visit[];
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        visit = new boolean[N];
        solution(M, N);
    }

    public static void solution(int M, int N) {
        if (list.size() == M) {
            for (int i : list) {
                System.out.print(i + " ");
            }
            System.out.println();
            return;
        } // M 4 N 2
        for (int i = 0; i < N; i++) {
            if (!visit[i]) {
                visit[i] = true;
                list.add(i + 1);
                solution(M, N);
                list.poll();
                visit[i] = false;
            }
        }
    }
}
