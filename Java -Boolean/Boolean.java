package Boolean;

public class Boolean {
    public static void main(String[] args){

        System.out.println(1 == 2);
        System.out.println(1 == 1);

        System.out.println("one" == "two");
        System.out.println("one" == "one");

        System.out.println(1 != 2);

        System.out.println(1 > 2);
        System.out.println(2 > 1);

        System.out.println(2 >= 2);

        String a = "Hello world";
        String b = new String ("Hello world");
        System.out.println(a==b); // false → a는 a지 b가 아니다. 즉 a에 담긴 값이 아닌 a 그 자체를 비교
        System.out.println(a.equals(b)); //true → a에 들어간 값을 b에 들어간 값과 비교

        /*
         Boolean은 참과 거짓을 의미하는데이터 타입으로 bool이라고도 부른다.
         [비교(관계) 연산자]
         연산 결과에 따라 true 또는 false 값을 나타냄
         동등 비교 연산자 : .equals  // 문자열을 비교할 때 사용하기
          */
    }
}
