package baekjoon_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class AC5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String oper = br.readLine();
            int N = Integer.parseInt(br.readLine());
            Deque<Integer> dq = new ArrayDeque<>();
            String str[] = br.readLine().replaceAll("[^0-9]", "").split("");
            if(N < oper.length()) {
                System.out.println("error");
                continue;
            }
            else {
                for (int j = 0; j < N; j++) {
                    dq.offer(Integer.parseInt(str[j]));
                }
                for (int j = 0; j < oper.length(); j++) {
                    Deque<Integer> temp = new ArrayDeque<>();
                    int tem;
                    switch (oper.charAt(j)) {
                        case 'R': {
                            for (int k = 0; k < N; k++) {
                                tem = dq.poll();
                                temp.push(tem);
                                if (dq.isEmpty()) {
                                    dq = temp;
                                }
                            }
                            break;
                        }
                        case 'D': {
                            dq.poll();
                            N = N - 1;
                            break;
                        }
                    }
                }
            }
            System.out.println(dq);

        }
    }
}
