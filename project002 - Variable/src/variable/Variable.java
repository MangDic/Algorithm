package Variable;

public class Variable {
    public static void main(String[] args) {
        int a; // 선언, int : 데이터 형식, a : 변수의 이름
        a = 1;
        System.out.println("a+1의 값은 " + (a+1) + "입니다."); // 2
        a = 2; // 재할당
        System.out.println("a+1의 값은 " + (a+1) + "입니다."); // 3

        double b; //변수 b의 데이터 형식은 double(실수)
        b = 1.1;
        System.out.println(b+1.1);

        String first; // 문자열을 담을 수 있는 first 선언
        first = "cording"; // String first = "cording";으로 한 줄로 작성 가능
        String c, d; // 동시 선언 가능
        c = "HELLO";
        d = "WORLD";
        System.out.println(c+d); // 문자열 더하기

        //변수를 사용하는 이유 ex
        System.out.println(100 + 10);
        System.out.println((100 + 10) / 10);
        System.out.println(((100 + 10) / 10) - 10);
        System.out.println((((100 + 10) / 10) - 10) * 10); // 이 코드에서 100대신 1000으로 바꾼다면 4번이나 수정해야 한다.

        int e = 100;
        System.out.println(a + 10);
        System.out.println((a+ 10) / 10);
        System.out.println(((a + 10) / 10) - 10);
        System.out.println((((a + 10) / 10) - 10) * 10); // 이 코드에서는 e라는 변수를 한 번만 수정하면 된다. 즉 중복을 제거한다. - 가독성과 유지보수 용이성 증가.
    }

}
