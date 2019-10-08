package DivisionDemo;

public class DivisionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        float c = 10.0F;
        float d = 3.0F;

        System.out.println(a/b);
        System.out.println(c/d);
        System.out.println(a/d); // 좁은 범위를 표한하는 수를 더 넓은 수를 표현 가능한 수로 변환. 즉 int를 float로 변환.
    }
}
