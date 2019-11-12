package baekjoon;

import java.util.Scanner;

public class BiGyo10817 {
    public static void main(String[] args) {
        int A, B, C, tmp;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        int a[] = {A, B, C};
        if(a[0]>=a[1]){
            tmp = a[0];
            a[0] = a[1];
            a[1] = tmp;
        }
        if(a[1]>=a[2]){
            tmp = a[1];
            a[1] = a[2];
            a[2] = tmp;
        }
        if(a[0]>=a[1]){
            tmp = a[0];
            a[0] = a[1];
            a[1] = tmp;
        }
        System.out.println(a[1]);
    }
}
