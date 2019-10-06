package ConstantType;

public class ConstantType {
    public static void main(String[] args) {


        /*
        변수는 변하는 값을, 상수는 변하지 않는 값을 의미
        a=1;에서 a(변수)는 변할 수 있지만, 1(상수)은 변하지 않는다.
        float a = 2.2; -> miss match -> double로 변경
        float는 명시적으로 변경(F)하면 사용 가능
        즉, float a = 2.2F;
        int a = 2147483648;은 표현 범위보다 1 초과한다.
        long으로 바꾸어도 에러가 발생. 상수가 int형 이기 때문이다. int를 long으로 변경 해야 한다.
        long a = 2147483648L;
        자바에서 사용자의 편의를 위해 byte와 short타입에 대해서는 범위 내에서 int로 허용
        */
    }
}
