package baekjoon_BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Long2_12015 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> binary = new ArrayList<>();
        binary.add(0);
        int[] arr = new int[N];
        String[] str = br.readLine().split(" ");
        int Mid;
        for(int i = 0; i < N; i++) {
            int temp = arr[i] = Integer.parseInt(str[i]);
            // System.out.println("temp : " + temp + " binary.get(binary.size()-1) : " + binary.get(binary.size() - 1));
            if(temp > binary.get(binary.size() - 1)) {
                binary.add(temp);
            }
            else {
                int Left = 0;
                int Right = binary.size() - 1;
                while (Left < Right) {
                    Mid = (Left + Right) / 2;
                    // System.out.println("Left : " + Left + " Right : " + Right + " Mid : " + Mid + " binary.get(Mid) : " + binary.get(Mid));
                    if(binary.get(Mid) > temp) {
                        Right = Mid;
                    }
                    else {
                        Left = Mid + 1;
                    }
                    binary.set(Right, temp);
                }
            }
        }
        System.out.println(binary.size() - 1);
    }
}
