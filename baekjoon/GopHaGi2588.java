package baekjoon;

import java.util.Scanner;

public class GopHaGi2588 {
    public static void main(String[] args) {
        int A, B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        int a, b, c;
        c = B%10;
        b = ((B-c)%100)/10;
        a = (B - b*10 - c)/100;

        System.out.println(A*c);
        System.out.println(A*b);
        System.out.println(A*a);
        System.out.println(A*B);
    }
}
