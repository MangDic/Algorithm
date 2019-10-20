package Scope;

class C2 {
    int v = 10;

    void m() {
        int v = 20; // 없으면 10 출력
        System.out.println(v);          // 20 출력
        System.out.println(this.v);     // 10 출력. 인스턴스 자신을 의미하는 값. 그 객체에 대한 전역의 의미를 갖는다.
    }
}

public class ScopeDemo2 {

    public static void main(String[] args) {
        C2 c1 = new C2();
        c1.m();
    }
}