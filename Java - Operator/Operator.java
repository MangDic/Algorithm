package Operator;

public class Operator {
    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println(result);

        result = result - 1;
        System.out.println(result);

        result = result * 2;
        System.out.println(result);

        result = result / 2;
        System.out.println(result);

        result = result + 8;
        System.out.println(result);

        int a = 3;
        System.out.println(0%a);
        System.out.println(2%a);
        System.out.println(3%a);
        System.out.println(4%a);
        System.out.println(5%a);
        System.out.println(6%a);

        String firstString = "This is ";
        String secondString = "a concatenated string";
        String thirdString = firstString + secondString;
        System.out.println(thirdString);
        /*
        [산술 연산자]
        + - * / %
        즉 수학적인 계산에 사용되는 연산자

         */
    }

}
