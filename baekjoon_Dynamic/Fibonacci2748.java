package baekjoon_Dynamic;

import java.util.Scanner;
import java.util.Stack;

public class Fibonacci2748 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            Stack<Long> st = new Stack<>();
            long hap = 1;
            long first = 0;
            long second = 1;
            long temp;
            st.push(first);
            st.push(second);
            if (N == 0) {
                System.out.println("0");
            } else if (N == 1) {
                System.out.println("1");
            } else {
                for (int i = 2; i <= N; i++) {
                    temp = st.pop();
                    hap = st.pop() + temp;
                    st.push(temp);
                    st.push(hap);
                }
                System.out.println(st.pop());
            }
        }
}
