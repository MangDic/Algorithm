package Member;

/*
    인스턴스 메소드는 클래스 멤버에 접근 할 수 있다.
    sum() {
    클래스 변수, 클래스 메소드 호출 가능
    }
    클래스 메소드는 인스턴스 멤버에 젒근 할 수 없다.
    클래스 : 언제나 메소드보다 먼저 존재. 인스턴스는 클래스 생성 이후에 생성
    아직 생성되지 않은 인스턴스에 접근하는 것은 불가능! 이라고 생각하자
    인스턴스가 생성 - 클래스가 이미 생성되었으니 인스턴스는 클래스에 접근 가능하다!
    인스턴스 변수 -> Non-Static Field
    클래스 변수 -> Static Field
    복습할 땐
    https://devbox.tistory.com/entry/Java-%ED%81%B4%EB%9E%98%EC%8A%A4%EB%A9%A4%EB%B2%84%EC%99%80-%EC%9D%B8%EC%8A%A4%ED%84%B4%EC%8A%A4%EB%A9%A4%EB%B2%84%EA%B0%84%EC%9D%98-%EC%B0%B8%EC%A1%B0%EC%99%80-%ED%98%B8%EC%B6%9C
    참조
 */

class C1{
    static int static_variable = 1; // static - 클래스 변수
    int instance_variable = 2;      // 인스턴스 변수

    static void static_static(){    // 클래스 메소드가 클래스 변수를 호출하고 있을 때 - 앞에 static 이 붙었으니 클래스 메소드
        System.out.println(static_variable);
    }
    static void static_instance(){  // 클래스 메소드에서 인스턴스 변수 접근
        // 클래스 메소드에서는 인스턴스 변수에 접근 할 수 없다.
        //System.out.println(instance_variable);    // 결국 에러 발생
    }
    void instance_static(){
        // 인스턴스 메소드에서는 클래스 변수에 접근 할 수 있다.
        System.out.println(static_variable);
    }
    void instance_instance(){
        System.out.println(instance_variable);
    }
}
public class AccessCase {
    public static void main(String[] args) {
        C1 c = new C1();        // C1()이라는 클래스를 new 해서 c라고 하는 C1에 담을 수 있는 변수에 그 인스턴스를 담았다.
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 인스턴스 메소드가 정적 변수에 접근 -> 성공

        // c.static_static();
        // 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
        // 정적 메소드가 인스턴스 변수에 접근 -> 실패

        // c.static_instance();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 클래스 변수에 접근 -> 성공

        // c.instance_static();
        // 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
        // 인스턴스 메소드가 인스턴스 변수에 접근 -> 성공

        // c.instance_instance();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 클래스 변수에 접근 -> 성공

        // C1.static_static();
        // 클래스를 이용해서 클래스 메소드에 접근 -> 성공
        // 클래스 메소드가 인스턴스 변수에 접근 -> 실패

        //C1.static_instance();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instance_static();
        // 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
        //C1.instance_instance();
    }

}