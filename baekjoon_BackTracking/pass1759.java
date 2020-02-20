package baekjoon_BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class pass1759 {
    static boolean[] visit;
    static int L;
    static int C;
    static String[] al;
    static StringBuilder sb;
    static int ja = 0;
    static int mo = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        L = sc.nextInt();
        C = sc.nextInt();
        sb = new StringBuilder();
        al = new String[C];
        sc.nextLine();
        al = sc.nextLine().split(" ");
        visit = new boolean[C];
        Arrays.sort(al);
        back(0, 0,"");
        System.out.println(sb);
    }
    public static void back(int a, int dist, String str) {
        if(dist == L) {
            for(int i = 0; i < L; i++) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    mo++;
                } else {
                    ja++;
                }
            }
            if(ja >= 2 && mo >= 1) {
                sb.append(str.trim() + "\n");
            }
            ja = 0;
            mo = 0;
            return;
        }
        else {
            for (int i = a; i < C; i++) {
                if (!visit[i]) {
                    visit[i] = true;
                    back(i+1,dist + 1, str + al[i]);
                    visit[i] = false;
                }
            }
        }
    }
}
