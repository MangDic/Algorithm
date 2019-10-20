package Member;

class CalculatorDemo2{

    public static void sum(int left, int right){ // static 을 붙였으니 class 소속의 메소드! 클래스 직접접근을 통해 실행 가능!
                                                 // 왜 쓰는가! 인스턴스는 서로 다른 상태에 따라 여러 결과가 필요 할 때 사용
                                                 // 일회용처럼 한 번만 사용하면 될 때는 메모리를 더 소모하지 않는 클래스 메소드 사용
                                                 // 메소드가 인스턴스 변수를 참조하지 않는다면 클래스 메소드를 사용해서 불필요한 인스턴스의 생성을 막을 수 있다.
        System.out.println(left+right);
    }

    public static void avg(int left, int right){
        System.out.println((left+right)/2);
    }
}

public class Calculator2 {

    public static void main(String[] args) {
        CalculatorDemo2.sum(10, 20); // 클래스 직접 접근
        CalculatorDemo2.avg(10, 20);

        CalculatorDemo2.sum(20, 40);
        CalculatorDemo2.avg(20, 40);

        /*
        예제 Calculator 은 인스턴스 변수 left 와 right 를 이용해서 합계(sum)과 평균(avg)을 계산한다.
        생각해보면 굳이 인스턴스가 left 와 right 의 값을 항상 유지하고 있어야 할 이유는 없다.
        합계나 평균을 구할 때마다 좌항과 우항의 값을 주는 방식으로 계산을 할 수도 있다
        만약 메소드가 인스턴스 변수를 참조하지 않는다면 클래스 메소드를 사용해서 불필요한 인스턴스의 생성을 막을 수 있다.
         */
    }

}
