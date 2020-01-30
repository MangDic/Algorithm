package Simul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TZZS1924 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int x = Integer.parseInt(str[0]);
        int y = Integer.parseInt(str[1]);
        int hap = 0;
        for(int i = 1; i < x; i++) {
            if(i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {
                hap = hap + 31;
            }
            else if(i == 2) {
                hap = hap + 28;
            }
            else {
                hap = hap + 30;
            }
        }
        hap = hap + y;
        int gj = hap%7;
        switch (gj) {
            case 0 : {
                System.out.println("SUN");
                break;
            }
            case 1 : {
                System.out.println("MON");
                break;
            }
            case 2 : {
                System.out.println("TUE");
                break;
            }
            case 3 : {
                System.out.println("WED");
                break;
            }
            case 4 : {
                System.out.println("THU");
                break;
            }
            case 5 : {
                System.out.println("FRI");
                break;
            }
            case 6 : {
                System.out.println("SAT");
                break;
            }
        }
    }
}
