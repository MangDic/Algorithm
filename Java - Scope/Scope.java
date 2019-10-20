package Scope;

public class Scope {
    /*
    프로그램이 커지면, 여러가지 이유로 이름이 충돌 할 수 있다. 그래서 고안된 것이 유효범위(Scope)이다.
    디렉터리로 생각하면 쉽다. a라는 폴더와 b라는 폴더에 동시에 c라는 파일(동일한 이름)이 존재할 수 있다.
     */
    static void a() {
         int i = 0;
    }

    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            a();
            System.out.println(i);
            /*
            만약
    static int i;   // 전역변수(Global)

    static void a() {
        i = 0;      // 지역변수(Local) 이 부분이나
    }

    public static void main(String[] args) {
        for (i = 0; i < 5; i++) {   // 이 부분 i 앞에 int 를 붙이면 지역변수로! for 문 내에서만 사용
            a();
            System.out.println(i);
        }
    }
    일경우 무한루프 !!

    int left, right ;

    public void setOperand(int left, int right) {
        this.left = left        // this.left 는 전역변수 의미. left 는 가장 가까운 지역변수 즉, (int left)
        this.right = right
    }

    int left, right ;

    public void setOperand(int _left, int _right) {
        left = _left        // setOperand 내에 left 가 없으므로 밖에서 left 를 찾는다!
        right = _right
    }https://opentutorials.org/course/1223/5447   7분 30초 부터
             */
        }
    }
 }
