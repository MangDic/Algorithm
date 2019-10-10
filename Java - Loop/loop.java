package Loop;

public class loop {
    public static void main(String[] args) {

        int i = 0;

        while(i<5) {
            System.out.println(i);
            i++;
        }

        for(int j = 0; j < 5; j++){
            System.out.println(j);
        }

        for (int k = 0; k < 10; k++) {
            if (k == 5)
                break;  // continue 가 대신 오면 조건에 맞는 상황은 실행을 건너 뛰고 다음 조건 실행. 즉 k = 5일 때 건너 뛰고 k = 6 실행
            System.out.println("Coding Everybody " + k);
        }

        for(int a = 0; a<10; a++){
            for(int b = 0; b<10; b++) {
                System.out.println(a +""+ b);
            }
        }
        /*
        while (false) {
            System.out.println("Coding");
        }                                   // 이것만 실행하면 실행할 것이 없이 때문에 컴파일 에러 발생

        for(초기화; 종료조건; 반복실행) {
        }
        while문에서 초기화부분 종료조건부분 반복실행부분이 멀어지면 나중에 코드 수정에 어려움을 유발
        이를 극복하기 위해 for문 사용

        만약 반복문이 없다면?
        Coding 이라는 단어를 1000번 출력하기 위해
        System.out.println("Coding"); 를 1000번 적어야 한다... 불행하다...
        하지만 반복문이 있다면
        int max = 1000;
        while(max<1000){
        System.out.println("Coding");
        }
        에서 max 부분만 수정하면 된다! 즉 가변적인 int max의 값만 수정해 주면 훨씬 쉽게 바꿀 수 있다.


        */

    }
}
