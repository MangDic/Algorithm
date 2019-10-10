package Method;

import java.util.Scanner;

public class Method {

    public static void num() {                  // 메소드 정의
        int i = 0;
        while (i<5) {
            System.out.println(i + "번 째 출력");
            i++;
        }
        return;
    }

    public static void input(int limit) {
        int i = 0;
        while(i<limit){
            System.out.println(i+1 + "번 째 출력");
            i++;
        }

    }

    public static void dou(int a, int b) {
        int x = a, y = b;
        System.out.println(x + " + " + y +" = " + (x+y));
        System.out.println(x + " - " + y +" = " + (x-y));
        System.out.println(x + " * " + y +" = " + (x*y));
        System.out.println(x + " / " + y +" = " + (x/y));
    }

    public static void main(String[] args) {
        // num();  num 호출
        System.out.print("첫 번째 값을 입력하세요 : ");
        Scanner scan = new Scanner(System.in);
        String limit;                           // limit : 인자(argument)
        String init;
        limit = scan.nextLine();
        System.out.print("두 번째 값을 입력하세요 : ");
        init = scan.nextLine();
        input(Integer.parseInt(limit));         // 메소드 호출
        dou(Integer.parseInt(limit), Integer.parseInt(init));

    }

    /*
    public static void main(String[] args) {
        int i = 0;
        while(i<5){
            System.out.println(i);
            i++;
            }
         }
     와 동일한 의미를 갖는다.
     */

    /*
    public static void main(String[] args) {
        return;
    }
    여기서 main 이 메소드. 여기서 public static 은 객체지향과 함께 언급해야 할 부분.
    정의(define) : 메소드를 만드는 것
    호출(call) : 만들어진 메소드를 실행하는 것

    method = function, 즉 메소드는 함수와 같다.

    main 메소드는 규칙.
    반드시 public static void main(String[] args)가 이끄는 중괄호 안에 실행되기를 기대하는 로직을 위치시켜야 한다.
    우리는 main 메소드를 작성하고, 자바는 main 메소드를 실행하는 관계라고 할 수 있다.

    [메소드 호출을 사용하는 이유]
    만약 0부터 9까지를 5번 출력해야 한다면?
    int i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }

        i = 0;
        while(i<10){
            System.out.println(i);
            i++;
        }
     ... 보기만 해도 극혐...!
     만약 5번이 아니라 1000번 이라면? 불행해 질 것이다!
     하지만 메소드를 사용한다면

     public static void numbering() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
    }

    public static void main(String[] args) {
        numbering();
        numbering();
        numbering();
        numbering();
        numbering();
    }
    훨씬 간견해 진 것을 확인 할 수 있다.
    결과는 같지만 로직은 단 한 번만 등장. 이것을 재활용성이라고 한다. (실행)

    [매개변수와 인자]
    메소드의 입력 값은 매개변수(parameter)를 통해 이루어 짐.

    [활용도 높은 출력문]
    public static String numbering(int init, int limit) {  // String numbering : numbering 이라는 메소드는 반드시 String 형태의 값을 반환
        int i = init;
        // 만들어지는 숫자들을 output 이라는 변수에 담기 위해서 변수에 빈 값을 주었다.
        String output = "";
        while (i < limit) {
            // 숫자를 화면에 출력하는 대신 변수 output에 담았다.
            output += i;        // output = output + i ;
            i++;
        }
        // 중요!!! output 에 담겨 있는 문자열을 메소드 외부로 반환하려면 아래와 같이 return 키워드 뒤에 반환하려는 값을 배치하면 된다.
        return output;          // return 을 만나면 그 메소드를 무조건 거기서 종료하고 해당 값(output)을 외부로 전달
    }

    public static void main(String[] args) {
        // 메소드 numbering 이 리턴한 값이 변수 result 에 담긴다.
        String result = numbering(1, 5);        // numbering(1, 5)의 반환 값(numbering 메소드의 output)을 result 에 넣는다.
                                                // String 을 써줘야 하는 번거로움이 있지만 result 는 String 이라는 것을 알 수 있다
                                                // 만약 String 이 없다면 result 에 어떤 형태가 올지 생각해야 하는 단점이 있다.
                                                // 즉, 유연성은 없지만 예측 가능성은 있다.
        // 변수 result 의 값을 화면에 출력한다.
        System.out.println(result);
    }
    → 메소드 내에 사용한 result 은 return 뒤에 따라오는 값을 메소드의 결과로 반환하고 동시에 메소드를 종료.
      ☆ return 을 통해서 반환할 값의 데이터 형식을 메소드의 이름 옆에 명시해주어야 한다!

    public static String numbering(int init, int limit)
    메소드가 리턴 할 값을 명시함으로서 numbering 이라는 메소드는 반드시 문자열의 값을 리턴한다는 것을 보장할 수 있는 장점이 있다.
    모든 일에는 장점과 단점이 있다. 장단의 다면성을 충실하게 응시할 때 적합함을 얻을 수 있다.

    public static void numbering(int init, int limit)
    만약 반환 값이 없다면 아래와 같이 void 를 적어준다.

    메소드를 볼 때 메소드의 정의부터 보는것 보단 메인함수에서 어떻게 사용하는지(사용방법)을 먼저 보는 것이 코드를 이해하기 더 쉽다.

    [굳이 데이터를 복잡하게 리턴하는 이유?]
    굳이 이렇게 복잡하게 데이터를 리턴하는 이유는 무엇일까? 내용을 화면에 출력하는 것은 동일하지 않은가?
    결론적으로 말하면 부품으로서의 가치를 높이기 위해서라고 할 수 있다.
    만약 여러분이 이 메소드가 출력한 값을 화면에 출력하는 것이 아니라 파일에 기록하고 싶다면 어떻게 해야 할까?
    또는 이메일로 보내고 싶다면 어떻게 해야 할까? 3개의 메소드를 만들고 용도에 따라서 코드를 재작성하는 것도 좋은 방법이다.
    하지만 더 좋은 방법은 숫자를 출력하고, 숫자를 파일에 기록하고, 숫자로 이메일을 보내는 작업으로부터 숫자를 계산하는 로직을 분리하는 것이다.
     numbering 은 자신이 어떻게 사용될지 모른다.
     누구든지 numbering 이라는 메소드를 호출할 때 초기값과 마지막 값을 입력하면 numbering은 숫자를 문자열의 형태로 반환하면 되는 것
    [예시]
    public static String numbering(int init, int limit) {
        int i = init;
        String output = "";
        while (i < limit) {
            output += i;
            i++;
        }
        return output;
    }

    public static void main(String[] args) {
        String result = numbering(1, 5);
        System.out.println(result);
        try { // 무시
            // 다음 행은 out.txt 라는 파일에 numbering이라는 메소드가 반환한 값을 저장합니다.
            BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
            out.write(result);
            out.close();
        } catch (IOException e) {
        } // 무시

     [return 은 메소드를 중단 시키는 역할도 한다]
        public static String num(int i) {
        if(i==0){
            return "zero";
        } else if(i==1){
            return "one";
        } else if(i==2){
            return "two";
        }
        return "none";
    }

    public static void main(String[] args) {
        System.out.println(num(1));
    }

    만약 여러 데이터를 리턴하고 싶을 경우 배열을 이용하여 쉽게 해결할 수 있다.
    public static String[] getMembers() {
        String[] members = { "최진혁", "최유빈", "한이람" };
        return members;
    }

    public static void main(String[] args) {
        String[] members = getMembers();
    }
     */
}
