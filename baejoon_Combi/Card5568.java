package baejoon_Combi;

import java.util.HashSet;
import java.util.Scanner;

public class Card5568 {
    static int[] card;
    static boolean[] visit;
    static int k;
    static int n;
    static HashSet<String> result = new HashSet<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        visit = new boolean[n];
        card = new int[n];
        for(int i = 0; i < n; i++) {
            card[i] = sc.nextInt();
        }
        back(0, "");
        System.out.println(result.size());

    }
    public static void back(int a, String str) {
        if(a == k) {
            result.add(str);
            return;
        }
        else {
            for(int i = 0; i < n; i++) {
                if(!visit[i]) {
                    visit[i] = true;
                    back(a+1, str + card[i]);
                    visit[i] = false;
                }
            }
        }
    }
}
/*
 HashSet은 Set의 파생클래스로 Set은 기본적으로 집합으로 중복된 원소를 허용하지 않음.
 HashSet은 순서 역시 고려가 되지 않음.
 HashNext() : 다음 원소가 남아 있는지 여부 확인 (true / false)
 next() : 다음 원소 가져옴
 remove() : 현재 반복자가 가리키고 있는 원소 삭제
 */
