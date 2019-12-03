package baekjoon_greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coin11047 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int money =  Integer.parseInt(temp[1]);
        int[] a = new int[n];
        int coin = 0;
        for(int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        while (money != 0) {
            for(int i = n-1; i >= 0; i--) {
                if(a[i] <= money) {
                    money = money - a[i];
                    coin = coin + 1;
                    break;
                }
            }
        }
        System.out.println(coin);
    }
}
