package baekjoon_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackOper10828 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        Stack<Integer> st = new Stack<>();
        String[] str;
        String oper;
        int num;
        while(cnt < N) {
            str = br.readLine().split(" ");
            oper = str[0];
            cnt = cnt + 1;
            switch (oper) {
                case "push" : {
                    num = Integer.parseInt(str[1]);
                    st.push(num);
                    break;
                }
                case "pop" : {
                    if(st.isEmpty()) {
                        System.out.println("-1");
                    }
                    else {
                        System.out.println(st.pop());
                    }
                    break;
                }
                case "size" : {
                    System.out.println(st.size());
                    break;
                }
                case "top" : {
                    if (st.isEmpty()) {
                        System.out.println("-1");
                    } else {
                        System.out.println(st.peek());
                    }
                    break;
                }
                case "empty" : {
                    if(st.isEmpty()) {
                        System.out.println("1");
                    }
                    else {
                        System.out.println("0");
                    }
                    break;
                }
            }

        }
    }
}
