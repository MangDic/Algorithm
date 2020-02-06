package baekjoon_DFS_BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ObjectPractice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        car c = new car();
        for(int i = 0; i < n; i++) {
            String[] str = br.readLine().split(" ");
            c.Color = str[0];
            c.Speed = Integer.parseInt(str[1]);
            c.Gear = Integer.parseInt(str[2]);
            c.print(c.Color, c.Speed, c.Gear);
        }


    }
}
class car {
    String Color;
    int Speed;
    int Gear;

    void print(String c, int s, int g) {
        Color = c;
        Speed = s;
        Gear = g;
        System.out.println("Color : " + Color + " Speed : " + Speed + " Gear : " + Gear);
    }
}
/* 객체 생성 과정
1. new 연산자가 c 객체에 저장될 메모리 공간 할당
2. 생성자가 c 객체를 초기화
3. new 연산자가 새로 생성된 객체의 주소(reference) c 변수에 저장
4. c를 통해 car 에 접근 가능 */
