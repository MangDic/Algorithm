package Member;

import ClassInstance.Calculator2;

class Calculator {
    static double PI = 3.14; // 클래스 변수. 값이 변할 필요가 없어! 모든 인스턴스가 공유할 수 있는 변수 (클래스 변수)
    // 아래 int left 와는 다르게 static 이 붙었다. PI 는 스태틱한 변수가 된다 - 클래스에 소속이 된다. - 이 변수를 모든 인스턴스에서 동일한 값으로 가져온다!
    static int base = 0;
    int left, right;

    public void setOperands(int left, int right) {
        this.left = left;
        this.right = right;
    }

    public void sum() {
        System.out.println(this.left + this.right + base);
    }

    public void avg() {
        System.out.println((this.left + this.right + base) / 2);
    }
}

public class Member {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        System.out.println(c1.PI);  // 인스턴스를 통한 접근

        Calculator c2 = new Calculator();
        System.out.println(c2.PI);

        System.out.println(Calculator.PI);  // 클래스를 통한 접근. 원주율만 필요할 때 클래스에 직접 접근하기 때문에 인스턴스를 생성할 필요가 없다.
        // 즉 모든 인스턴스가 같은 PI 값을 사용하기 때문에 3.14로 동일

        c1.setOperands(10, 20);
        // 30 출력
        c1.sum();


        c2.setOperands(20, 40);
        // 60 출력
        c2.sum();

        // 클래스 변수 base의 값을 10으로 지정했다.
        Calculator.base = 10;

        // 40 출력
        c1.sum();

        // 70 출력
        c2.sum();

    }

}
        /*
        설계도에 따라 만들어진 제품들 (인스턴스)
        인스턴스에 들어간 변수의 값에 따라 각각의 인스턴스가 가진 상태가 다르다. - 인스턴스의 구분
        인스턴스의 행위 - 메소드를 실행한다.
        인스턴스의 변수로 지정했다 : c1 c2 는 모두 left right 같은 변수명을 가지고 있지만 값이 달라요

        클래스 변수의 용도를 정리해보면 아래와 같다.

        인스턴스에 따라서 변하지 않는 값이 필요한 경우 (위의 예에서는 PI)
        (이런 경우 final 을 이용해서 상수로 선언하는 것이 바람직 하지만 final을 아직 배우지 않았기 때문에 언급하지 않았다)
        인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
        값의 변경 사항을 모든 인스턴스가 공유해야 하는 경우


         */


