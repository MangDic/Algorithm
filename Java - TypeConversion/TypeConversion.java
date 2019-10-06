package TypeConversion;

public class TypeConversion {
    public static void main(String[] args) {
        int a = 3;
        float b = 1.0f;
        double c = a + b; // a : int → double, b : float → double로 형변환되어 계산이 된다.
        int d = (int)100.1; // 0.1 손실
        System.out.println(c);
        System.out.println(d);
        /*
        실수 200.0을 컴퓨터에 저장을 하면
        00000000 00000000 00000000 11001000이 아닌
        01000011 01001000 00000000 00000000로 저장한다.
        사람은 정수 200과 실수 200.0을 같게 보지만, 컴퓨터는 그렇지 않다.

        [자동(암시적) 형 변환]
        double a = 3.0F;
        서로 다른 데이터 타입으로 에러가 발생해야 한다. 하지만 자바에서 자동(암시적)으로 형변환
        double이 더 많은 정보를 표현하고 더 많은 정보 표현 가능.
        float에서 double로 형변환 시 데이터 손실이 없다.

        float a = 3.0;
        double형의 데이터를 float에 담으려고 하는 경우이다.
        float < double 이기 때문에 지원하지 않는다. // 데이터 유실의 가능성
        실수 3.4를 정수형으로 변환 하면 3으로 0.4가 손실된다.

        자동형변환의 원칙 : 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로의 변환만 허용

        byte → short, char → int → long → float → double 화살표 방향으로만 형변환이 가능하다!

        [명시적 형 변환]
        float a = 100.0; 는 에러 // float < double로 자동 형 변환 발생 x
        int b = 100.0f; 역시 int < float로 자동 형 변환 x
        float a = (float)100.0; 와
        int b = (int)100.0f; 으로 명시적 형 변환

        int c = (int)100.1f; 로 형 변환 시 c = 100으로 0.1 손실
        */
    }
}
