package baekjoon_Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Zero10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int cnt = 0;
        Stack<Integer> money = new Stack<>();
        long hap = 0;
        for(int i = 0; i < k; i++){
            int temp = Integer.parseInt(br.readLine());
            if(temp == 0) {
                money.pop();
                cnt = cnt - 1;
            }
            else {
                money.push(temp);
                cnt = cnt + 1;
            }
        }
        for(int i = 0; i < cnt; i++) {
            hap = hap + money.pop();
        }
        System.out.println(hap);
    }
}
