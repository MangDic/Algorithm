package Simul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Vacation5532 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        for(int i = 0; i < 5; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }
        int day;
        if(a[1]/a[3] > a[2]/a[4]) {
            if(a[1]%a[3] == 0)
                day = a[0] - a[1]/a[3];
            else
                day = a[0] - a[1]/a[3] - 1;
        }
        else {
            if(a[2]%a[4] == 0)
                day = a[0] - a[2]/a[4];
            else
                day = a[0] - a[2]/a[4] - 1;
        }
        System.out.println(day);
    }
}
