package backjoon_Math2;

        import java.util.Scanner;

public class TexiGiha3053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        System.out.println(String.format("%.6f", Math.PI*R*R));
        System.out.println(String.format("%.6f", (double)2*R*R));
    }
}
