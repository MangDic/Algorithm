package Simul;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Noise2935 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Ncnt = 0;
        int Mcnt = 0;
        int Max;
        int Min;
        String N = br.readLine();
        String oper = br.readLine();
        String M = br.readLine();
        for(int i = 0; i < N.length(); i++) {
            if(N.charAt(i) == '0') {
                Ncnt ++;
            }
        }
        for(int i = 0; i < M.length(); i++) {
            if(M.charAt(i) == '0') {
                Mcnt ++;
            }
        }
        if(Mcnt > Ncnt) {
            Max = Mcnt;
            Min = Ncnt;
        }
        else {
            Max = Ncnt;
            Min = Mcnt;

        }
        switch (oper) {
            case "+" : {
                if(Ncnt == Mcnt) {
                    System.out.print("2");
                    for (int j = 0; j < Ncnt; j++) {
                        System.out.print("0");
                    }
                }
                else {
                    System.out.print("1");
                    for(int j = 0; j < Max-Min-1; j++) {
                        System.out.print("0");
                    }
                    System.out.print("1");
                    for(int j = 0; j < Min; j++) {
                        System.out.print("0");
                    }
                }
                break;
            }
            case "*" : {
                System.out.print("1");
                for(int j = 0; j < Min + Max; j++) {
                    System.out.print("0");
                }
                break;
            }
        }

    }
}
