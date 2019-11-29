package baekjoon_BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class pass1759_1 {
    public static boolean check(String password) {
        int ja = 0;
        int mo = 0;
        for (char x : password.toCharArray()) {
            if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
                mo += 1;
            } else {
                ja += 1;
            }
        }
        return ja >= 2 && mo >= 1;
    }

    public static void go(int n, String [] alpha, String password, int i) {
        if(password.length() == n) {
            if(check(password)) { //모음 자음 개수 검사
                System.out.println(password);
            }
            return;
        }
        if(alpha.length <= i)
            return;

        go(n, alpha, password+alpha[i], i+1); //사용하는 경우
        go(n, alpha, password, i+1); //사용하지 않는 경우
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        scan.nextLine();
        String [] alpha = scan.nextLine().split(" ");

        Arrays.sort(alpha);
        go(n, alpha, "", 0);
    }
}
