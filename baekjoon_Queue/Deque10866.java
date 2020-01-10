package baekjoon_Queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class Deque10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str;
        String oper;
        Deque<Integer> dq = new ArrayDeque<Integer>();
        int temp;
        for(int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            oper = str[0];
            switch (oper) {
                case "push_front" : {
                    temp = Integer.parseInt(str[1]);
                    dq.push(temp);
                    break;
                }
                case "push_back" : {
                    temp = Integer.parseInt(str[1]);
                    dq.offer(temp);
                    break;
                }
                case "pop_front" : {
                    if(dq.size() == 0) {
                        System.out.println("-1");
                    }
                    else {
                        System.out.println(dq.removeFirst());
                    }
                    break;
                }
                case "pop_back" : {
                    if(dq.size() == 0) {
                        System.out.println("-1");
                    }
                    else {
                        System.out.println(dq.removeLast());
                    }
                    break;
                }
                case "size" : {
                    System.out.println(dq.size());
                    break;
                }
                case "empty" : {
                    if(dq.isEmpty()) {
                        System.out.println("1");
                    }
                    else {
                        System.out.println("0");
                    }
                    break;
                }
                case "front" : {
                    if(dq.size() == 0) {
                        System.out.println("-1");
                    }
                    else {
                        System.out.println(dq.peekFirst());
                    }
                    break;
                }
                case "back" : {
                    if(dq.size() == 0) {
                        System.out.println("-1");
                    }
                    else {
                        System.out.println(dq.peekLast());
                    }
                    break;
                }
            }
        }
    }

}
/*
addFirst: 덱 앞 쪽에 자료를 넣는 연산
addFirst: 덱 뒷 쪽에 자료를 넣는 연산
removeFirst: 덱 앞 쪽에서 자료를 빼는 연산
removeLast: 덱 뒷 쪽에서 자료를 빼는 연산
getFirst : 덱 앞 쪽에있는 자료를 가져온다
getLast : 덱 뒷 쪽에있는 자료를 가져온다
empty: 덱이 비어있는지 아닌지를 알아보는 연산
*/
