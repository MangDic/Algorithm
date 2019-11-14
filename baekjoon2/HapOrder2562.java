package baekjoon2;

import java.util.Scanner;

public class HapOrder2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        int max = 0;
        int room = 0;
        for(int i = 0 ; i < 9; i++){
            cnt ++;
            int a = sc.nextInt();
            if(a>max){
                max = a;
                room = cnt;
            }
        }
        System.out.println(max);
        System.out.print(room);
    }
}
