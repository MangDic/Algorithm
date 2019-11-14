package baekjoon2;

import java.util.Scanner;

public class MaxMin2562 {
    public static void main(String[] args) {
      int Max = -1000000;
      int Min = 1000000;
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();

      for(int i = 0 ; i < N ; i++){
          int a = sc.nextInt();
          if(a >= Max){
              Max = a;
          }
          if(a <= Min){
              Min = a;
          }
      }
        System.out.print(Max + " ");
        System.out.println(Min);
    }
}
