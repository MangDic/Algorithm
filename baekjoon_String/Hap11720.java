package beakjoon_String;

import java.util.Scanner;

public class Hap11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String inputs = sc.next();
        sc.close();

        int result = 0;
        for (int i = 0; i < n; ++i) {
            result += Integer.parseInt(inputs.substring(i, i + 1));
        }
        System.out.println(result);
    }
}
