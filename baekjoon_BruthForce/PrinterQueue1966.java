package baekjoon_BruthForce;

import java.io.*;
import java.util.*;

public class PrinterQueue1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for(int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int N = Integer.parseInt(str[0]);
            int M = Integer.parseInt(str[1]);
            Integer[] arr = new Integer[N];
            Queue<Integer> qu = new LinkedList<>();
            String[] str1 = br.readLine().split(" ");
            for(int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(str1[j]);
                qu.offer(Integer.parseInt(str1[j]));
            }
            Arrays.sort(arr);
            int importanceOrder = arr.length-1; // 중요도가 가장 큰 것부터 출력하기 위한 순서
            int order = 0; // 출력 횟수
            int calCount = 0; // 입력 순서에 맞춰서 순서를 기억하기 위한 변수

            while(true) {
                int pollNum = qu.poll();

                if(calCount == M) { // 큐에서 out 될 때 알고싶은 00번째 수를 알 수 있다.
                    pollNum += 101; // 주어지는 수가 100이하이므로 다른 위치에 똑같은 중요도가 나오더라도 다른 점수로 만들어줌
                }
                calCount++;

                if(arr[importanceOrder] == pollNum-101) { // 알고 싶은 수의 중요도만 101을 넘어가기 때문에 해당 숫자가 나오면 끝.
                    order++;
                    bw.write(String.valueOf(order));
                    bw.newLine();
                    break;

                }else if(arr[importanceOrder] == pollNum){ // 중요도가 높은 것이 출력되면 다음 중요도가 높은 것으로 이동
                    order++;
                    importanceOrder--;
                }else {
                    qu.add(pollNum); // 어느 해당 사항도 없으면 다시 큐 맨 뒤로 추가해준다
                }
            }
        }
        bw.flush();
    }
}


