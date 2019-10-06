package DataType;

public class DataType {
    public static void main(String[] args) {
        byte a; //  -128 ~ 127, 범위에 맞지 않으면 miss match 발생
        short b; // -32,768 ~ 32,767
        int c; // 약 20억까지 표현 가능

        /*
        [데이터 크기]
        8 bit = 1 byte

        1024 byte = 1 Kbyte
        1024 Kbyte = 1 Mbyte
        1024 Mbyte = 1 Gbyte
        1024 Gbyte = 1 Tbyte

        [정수형]
        byte	1byte // 메모리 절약할 때 사용
        short	2byte
        int	    4byte // 처리속도가 가장 빠르고, 충분히 큰 수를 표현 가능
        long	8byte
        // 즉, 형태에 따라 메모리 소모가 다르다. 상황에 따라 알맞게 사용하자!

        만약
        long a = 2147483647;
        long b = 1;
        일 때, a와 b가 소모하는 메모리 양은 같다! 형태가 같기 때문

        int a = 2147483647;
        long b = 2147483647;
        일 때, a와 b가 소모하는 메모리 양은 다르다. a는 4byte, b는 8btye

        [실수형]
        float(4byte)와 double(8byte)에서는 double을 사용하자

        [문자]
        char(2byte)
        */

    }
}
