package InOut;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class In_Out {
    public static void main(String[] args) {  // (String[] args) : 입력 값의 파라미터로 동작. 입력 값을 args에
                                              // 매개변수 : 메소드가 호출될 때 전달된 입력 값을 메소드 내부로 전달하는 역할을 하는 변수

        System.out.println(args.length); // 배열에 몇 개를 담을 수 있는지 확인
        for(String e : args) {      // "String[] args" 의 args 를 (String e : args)의 args로 들어 간뒤 for 문에서 args 의 데이터 값을 하나 하나 꺼내서 e에 담는다!
            System.out.println(e);  // e에 들어있는 값을 출력
        }


        //Scanner sc = new Scanner(System.in);        // import 를 통해 로드. // System.in 대신 file 명을 입력하면 해당 파일을 탐색
        //System.out.println("값을 입력하세요 : ");
        // int i = sc.nextInt();                       // sc.nextInt() 에서 입력 값을 받을 때 까지 멈춤(Int 만 받는다.) 입력을 받으면 int i에 전달
        //while(sc.hasNextInt()) { // hasNextInt() 1. 일단 정지. 2. 입력받은 값이 정수라면 true 리턴. 문자 등이면 false 로 리턴. 즉 문자 등을 입력하면 종료
                                 // while 문에서는 true 일때만 동작 !
            //System.out.println(sc.nextInt() * 1000);
            //if(sc.nextInt() == 999)
                //break;
        //}
        //sc.close();


        try {
            File file = new File("out.txt");
            Scanner p = new Scanner(file);  // file 이라는 변수는 new file 이라는 객체를 생성. out.txt 를 받음. System.in 면 사용자의 입력 값을 받아라!
            while(p.hasNextInt()) {
                System.out.println(p.nextInt()*1000);
            }
            p.close();
        } catch(FileNotFoundException e){       // 예외 만약 out.txt 를 찾을 수 없을 경우
            e.printStackTrace();                // 에러의 내용을 출력해라!
        }
        /*
        메소드는 작은 프로그램으로 볼 수 있다.
        IO : 인풋과 아웃풋 ㅎㅎ
        String[] args : args 라는 이름으로 스트링 형태의 배열을 만든다. main 이라는 함수의 파라미터(괄호 속에 있으니)
        void : main 이라는 함수는 출력 값이 존재하지 않는다.
        main 메소드의 내용을 구현하면 자바 app 을 실행 할 때 main 메소드가 호출되면서 프로그램이 구동된다. 자바로 부터 main 호출됨
        -cp : class path
        프로그램에 입력 값을 전달하는 방법 : 알트 쉬프트 f10 → edit configuration 클릭 → program arguments 에 값 입력하여 실행! ^_^
        만약 입력 값을 one two three 로 주면 String[] args 에 각각의 원소로 들어간다!
        CLI : 커맨드 라인 인터페이스 - 명령을 통해 컴퓨터를 제어하고, 그 결과를 텍스트를 통해 피드백을 줌
        GUI : 그래픽 유저 인터페이스
         */

    }
}
