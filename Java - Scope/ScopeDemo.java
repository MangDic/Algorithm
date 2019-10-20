package Scope;

public class ScopeDemo {
    /*
    정적 스코프와 동적 스코프. 자바는 동적 스코프는 채택 x
     */
    static int i = 5;

    static void a() {
        int i = 10;
        b();
    }

    static void b() {
        System.out.println(i);
    }

    public static void main(String[] args) {
        a();
    }
}
