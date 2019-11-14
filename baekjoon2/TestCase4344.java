package baekjoon2;

import java.util.Scanner;

public class TestCase4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        double hap = 0;
        double cnt = 0; // int 형이면 안 나와...
        String[] prt = new String[C];

        //Math.round()와 String.format()차이점
        //
        //메서드들은 실수를 소수점 n번째까지 잘라서 표현한다는 공통점이 있음.
        // 하지만 두개의 메서드가 꼭 같은 결과값을 출력하지는 않음.
        // Math.round()함수는 소수점아래가 0일경우 절삭하지만 String.format은 절삭하지 않고 그대로 리턴
        for(int i = 0; i < C; i++) {
            int N = sc.nextInt();
            double[] a = new double[N];
            for(int j = 0; j < N; j++){
                a[j] = sc.nextInt();
                hap = hap + a[j];
                if(j == N-1){
                    double avg = hap / N;
                    for(int k = 0; k < N; k++){
                        if(a[k] > avg){
                            cnt = cnt + 1;
                        }
                        if(k == N-1){
                            prt[i] = String.format("%.3f", cnt*100/N);
                        }
                    }
                    hap = 0;
                    cnt = 0;
                }
            }
        }
        for(int i = 0; i < C; i++){
            System.out.println(prt[i]+"%");
        }
    }
}
