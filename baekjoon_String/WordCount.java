package beakjoon_String;

import java.util.Scanner;
//nextLine()과 next()메소드의 차이는 nextLine()메소드는 Enter를 치기 전까지 쓴 문자열을 모두 리턴
//next() 메소드는 스페이스 즉 공백 전까지 입력받은 문자열을 리턴.


public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String N = sc.nextLine(); // sc.nextLine().trim() 하면 앞 뒤 공백 사라짐...
        String[] word = N.split("\\s");
        if((N.charAt(0)) == ' ' && (N.length() != 1)) {
            cnt = cnt - 1;
        }
        for(String wo : word ){
            cnt = cnt + 1;
        }
        System.out.println(cnt);
    }
}
