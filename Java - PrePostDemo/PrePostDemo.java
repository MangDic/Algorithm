package PrePostDemo;

public class PrePostDemo {
    public static void main(String[] args) {
        int i = 3;
        i++;
        System.out.println(i);      // 4 출력
        ++i;
        System.out.println(++i);    // 5 출력
        System.out.println(i++);    // 6 출력
        System.out.println(i);      // 7 출력
    /*
    [단항 연산자]
    + -(음수 표현) ++ --
    ++i : i에 1을 더한 값을 출력
    i++ : i를 출력 후 1을 더한다
    [우선 순위]
    1 : [] {} .
    2 : ++ -- + - ~ ! new
    3 : * / %
     */
    }
}
