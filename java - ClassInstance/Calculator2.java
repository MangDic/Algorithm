package ClassInstance;

public class Calculator2 {

    /*
    public static void setOperands (int a, int b){
        int x = a;
        int y = b;
        sum(x, y);
        avg(x, y);

    }

    public static void sum (int a, int b){
        int x = a;
        int y = b;
        System.out.println(a+b);
    }

    public static void avg (int a, int b){
        int x = a;
        int y = b;
        System.out.println((a+b)/2);
    }

    public static void main(String[] args) {
        setOperands(10,20);
        setOperands(30,40);
    }

    내가 짠 것. 아래와 비교해보자!

    class Calculator{
            int left, right;

         public void setOperands(int left, int right){
              this.left = left;     // this.left 는 우리가 생성한 c1에 담겨있는 Calculator()라는 클래스를 구체적으로 만든 인스턴스를 가리킴.
                                    // this 는 인스턴스 자신을 의미한다! left 는 (int left, int right) 에 있는 매개변수 left
                                    // 만약 left 대신 this.left 를 사용하면 class Calculator 에서 정의한 int left 를 뜻 함.
              this.right = right;
         }

            public void sum(){
             System.out.println(this.left+this.right);
            }

          public void avg(){
                System.out.println((this.left+this.right)/2);
            }
        }

// 객체를 볼 때 하나의 프로그램처럼 볼 것. 객체에는 메소드와 변수가 있쥐
public class CalculatorDemo4 {

    public static void main(String[] args) {

        Calculator c1 = new Calculator();   // Calculator 라는 객체를 새로 만들어 c1 이라 하는 변수에 담았다.
                                            // 이 설계도에 해당하는 부분이 위에 있는 class Calculator
        c1.setOperands(10, 20);
        c1.sum();
        c1.avg();

        Calculator c2 = new Calculator();   // 또 한번 인스턴스를 생성하고 있다. 이번엔 c2에 담기고 있다!
        c2.setOperands(20, 40);
        c2.sum();
        c2.avg();
    }

}

    클래스는 일종의 설계도다. 클래스를 정의하는 것 자체로는 할 수 있는 일이 많지 않다.
    설계도를 구체적인 제품으로 만들어야 한다. 그 때 사용하는 키워드가 new 이다.
    new Calculator()은 클래스 Calculator 를 구체적인 제품으로 만드는 명령이다. 이렇게 만들어진 구체적인 제품을 인스턴스(instance)라고 부른다.
    클래스 : 설계도, 인스턴스 : 제품 이런 관계로 생각하자!
    클래스를 만든다는 것은 사용자 정의 데이터 타입을 만드는 것과 같은 의미
    Calculator c1 = new Calculator(); 는 Calculator 라는 데이터 타입을 만든 것이다.
    클래스를 인스턴스화 할 때는 변수에 담아야 한다는 것과 이 때 사용하는 변수의 데이터 타입은 그 클래스가 된다.

    객체를 만들어서 사용하는 이유는 재활용성을 높이기 위해서다.

     두개의 인스턴스를 각각 c1과 c2에 담았다. 그리고 각각의 인스턴스에 소속된 메소드를 호출하고 있다.
     각각의 인스턴스는 메소드 setOperands 를 통해서 변수 left, right 의 값을 설정하고 있다.
     그 결과 인스턴스 C1과 C2는 아래와 같이 서로 다른 변수의 값을 내부적으로 가지고 있게 된다.
     이 때 메소드 setOperands 내에 this.이라는 것이 있다. this 는 클래스를 통해서 만들어진 인스턴스 자신을 가리킨다. 위의 코드에서 left 는 매개변수이고 이 변수는 setOprands 밖에서는 접근 할 수 없다.
     반면에 this.left 는 4행에서 선언한 변수에 값을 설정하는 것이고 메소드 밖에서 선언한 변수는 인스턴스 내의 모든 메소드에서 접근이 가능

     c1과 c2는 상태가 다르다!
     변수를 다른 말로는 상태(state)라고도 표현
     메소드를 다른 말로는 행동(behave)
     하나의 클래스를 바탕으로 서로 다른 상태를 가진 인스턴스를 만들면 서로 다른 행동을 하게 된다는 것
     하나의 클래스가 여러개의 인스턴스가 될 수 있다는 점이 객체 지향이 제공하는 가장 기본적인 재활용성
    */

}
