package Simul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Mario2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> score = new LinkedList<>();
        for(int i = 0; i < 10; i++) {
            score.offer(Integer.parseInt(br.readLine()));
        }
        int hap = 0;
        for(int i = 0; i < 10; i++)
        {
            int temp = score.poll();
            if(hap + temp > 100) {
                if(Math.abs(100 - (hap + temp)) == Math.abs(100 - hap)) {
                    hap = hap + temp;
                }
                else if((Math.abs(100 - (hap + temp)) < Math.abs(100 - hap))) {
                    hap = hap + temp;
                }
                break;
            }
            else if(Math.abs(100 - (hap + temp)) < Math.abs(100 - hap)) {
                hap = hap + temp;
            }
        }
        System.out.println(hap);

    }
}
