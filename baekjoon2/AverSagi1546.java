package baekjoon2;

import java.util.Scanner;

public class AverSagi1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double max = 0;
        double hap = 0;
        double[] a = new double[N];

        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
            if(a[i] >= max){
                max = a[i];
            }
        }

        for(int i = 0 ; i < N; i++){
            {
                hap = hap + (a[i] / max)*100;
            }
        }
        System.out.println(String.format("%.2f",Math.round(hap/N*1000)/1000.0));
    }
}
