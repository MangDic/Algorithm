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
