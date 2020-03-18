package baekjoon_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class AC5430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] oper = br.readLine().split("");
            int N = Integer.parseInt(br.readLine());
            String str[] = br.readLine().replace("[","").replace("]","").split(",");
            int cnt = 0;
            for(int j = 0; j < oper.length; j++) {
                if(oper[j].equals("D")) {
                    cnt++;
                }
            }
            if(cnt > N) {
                System.out.println("error");
                continue;
            }
            int flag = 1;
            Deque<Integer> dq = new ArrayDeque<>();
            for(int j = 0; j < N; j++) {
                dq.offer(Integer.parseInt(str[j]));
            }
            for(int j = 0; j < oper.length; j++) {
                switch (oper[j]) {
                    case "R": {
                        flag ++;
                        break;
                    }
                    case "D": {
                        if(flag % 2 == 0) {
                            dq.pollLast();
                            break;
                        }
                        else {
                            dq.poll();
                            break;
                        }
                    }
                }
            }
            if(flag % 2 == 0) {
                Deque<Integer> temp = new ArrayDeque<>();
                while (!dq.isEmpty()){
                    temp.push(dq.poll());
                }
                dq = temp;
            }
            System.out.print("[");
            int size = dq.size();
            for(int j = 0; j < size; j++) {
                if(j == size - 1) {
                    System.out.print(dq.poll());
                }
                else {
                    System.out.print(dq.poll() + ",");
                }
            }
            System.out.println("]");
        }
    }
}

