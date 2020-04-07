package baekjoon_Tree;

import java.util.*;

public class treeParants11725 {
    static boolean[] visit;
    static List<Integer>[] link;
    static int[] parents;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        link = new ArrayList[N + 1];
        visit = new boolean[N + 1];
        parents = new int[N + 1];
        for(int i = 0; i <= N; i++) {
            link[i] = new ArrayList<>();
        }
        for(int i = 0; i < N - 1; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            link[a].add(b);
            link[b].add(a);
        }
        dfs(1);
        for(int i = 2; i <= N; i++) {
            System.out.println(parents[i]);
        }

    }
    public static void dfs(int a) {
       visit[a] = true;
       for (int i : link[a]) {
           if(!visit[i]) {
               parents[i] = a;
               dfs(i);
           }
       }
    }
}
