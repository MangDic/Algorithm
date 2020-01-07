package baekjoon_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Queue10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String temp = "";
        String[] str;
        int num = 0;
        int num1 = 0;
        Queue<Integer> qu = new LinkedList<>();
        for(int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            temp = str[0];
            switch (temp) {
                case "push" : {
                    num = Integer.parseInt(str[1]);
                    qu.offer(num);
                    break;
                }
                case "pop" : {
                    if(qu.isEmpty()) {
                        System.out.println("-1");
                    }
                    else {
                        num1 = qu.poll();
                        System.out.println(num1);
                    }
                    break;
                }
                case "size" : {
                    System.out.println(qu.size());
                    break;
                }
                case "empty" : {
                    if(qu.isEmpty()) {
                        System.out.println("1");
                    }
                    else {
                        System.out.println("0");
                    }
                    break;
                }
                case "front" : {
                    if(qu.isEmpty()) {
                        System.out.println("-1");
                    }
                    else {
                        System.out.println(qu.peek());
                    }
                    break;
                }
                case "back" : {
                    if(qu.isEmpty()) {
                        System.out.println("-1");
                    }
                    else {
                        System.out.println(num);
                    }
                    break;
                }
            }

        }
    }
}
