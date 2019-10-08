package Condition;

public class ConditionDemo {
    public static void main(String[] args) {

        if(true) {  // true를 false로 바꾸면 해당 if절에 대해서는 아무것도 출력 x
            System.out.println("result : true");
        }

        if(true) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
        }
        System.out.println(5);

        if (true) {
            System.out.println(1);
        }
        else if(false) {
            System.out.println(2);
        }
        else {
            System.out.println(3);
        }

        /*
        System.out.println("switch(1)");
        switch(2){      // 1과 일치하면 1,2,3 출력. 2와 일치하면 2, 3 출력. 원하는 것만 출력하고 싶으면 break;
                        // ()에 들어 갈 수 있는 것(조건)은 byte, short, char, enum, String, Character, Byte, Short, Integer 형태
            case 1:
                System.out.println("one");
            case 2:
                System.out.println("two");
            case 3:
                System.out.println("three");
            default:
                System.out.println("default");
        }
        */
        System.out.println("switch(1)");
        switch(4){
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            default:                            // case에 맞는 값이 없을 경우 default 값 출력
                System.out.println("default");
        }

        /*
        [if문]
        if(이 값이 true면 if절 수행) {
              if 절
              than 절
             }
        [if-else문]
        if() {
              }
        else {
             }

        로그인 예제 (반복문 중첩)
        public static void main(String[] args) {
        String id = args[0];
        String password = args[1];
        if (id.equals("egoing")) {
            if (password.equals("111111")) {
                System.out.println("right");
            } else {
                System.out.println("wrong");
            }

        } else {
            System.out.println("wrong");
        }
    }
         */
    }
}
