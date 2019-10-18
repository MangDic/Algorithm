package ClassInstance;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // 아래 로직이 1000줄 짜리의 복잡한 로직이라고 가정.
        System.out.println(10 + 20);
        System.out.println(20 + 40);    // 변수만 바뀌고 나머지는 중복 - 중복은 제거해야 한다. - 메소드 사용

        // 아래처럼 중복 제거
        cal(10, 20);
        cal(30, 40);    // 연관된 코드르 모아놓았기에 가독성 향상

        int left, right;

        left = 10;
        right = 20;

        sum(left, right);
        avg(left, right);

        /* ================================================
         만약 위 아래가 멀어지면 유지보수가 어려워진다. - 예상하지 못한 로직이 추가 될 수 있음.
         누군가는 right 를 우항이 아닌 권리로 해석할 수 도 있다.
         sum 이 미리 정해진 것을 모르고 summary 의 약자로 sum 을 또 사용할도 수 있다.

         이를 방지하기 위해 cal_left, cal_sum 등으로 바꿀 수 있다. 연관되어 있는 로직은 가까이 두는 등 노력 가능.
         객체 지향 : 데이터와 연산을 그루핑 할 수 있는 기능을 제공하여 마치 메소드가 한 것 처럼 언어 차원에서 문법적 기능적으로
         자바에서는 이것을 적극 채용
        */

        left = 30;
        right = 60;

        sum(left, right);
        avg(left, right);

        /*
        클래스 : 객체를 만들기 위한 일종의 설계도    // 같진 않지만 굳이 비교하자면 메소드 정의
        인스턴스 : 설계도에 따라 만들어진 구체적인 제품들    // 메소드 호출
        프로그래밍의 중요한 원칙 중 하나 : 중복의 제거. 리펙토링(중복을 제거하는 등 코드를 보다 효율적으로 만든 행위)
         */
    }

    public static void cal(int a, int b) {
        int x = a;
        int y = b;
        System.out.println(x + y);
    }

    public static void sum(int a, int b) {
        int x = a; int y = b;
        System.out.println(a+b);

    }

    public static void avg(int a, int b) {
        int x = a; int y = b;
        System.out.println((a+b)/2);

    }
}
