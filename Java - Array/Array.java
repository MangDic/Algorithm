package Array;

public class Array {

    public static void main(String[] args) {
        String[] classGroup = {"가씨","나씨","다씨","라씨"}; // 문자열의 데이터 타입을 가진 데이터들의 모임!
        int[] num = {1,2,3,4};

        System.out.println(num[0] + classGroup[0]); // [0] : 인덱스(색인) 정보를 빠르게 찾을 수 있도록 도와준다!
        System.out.println(num[1] + classGroup[1]);
        System.out.println(num[2] + classGroup[2]);
        System.out.println(num[3] + classGroup[3]);

        String[] ab = new String[4];
        ab[0] = "최진혁";
        System.out.println(ab.length); // length는 배열에 담긴 원소의 숫자가 아니라 배열을 선언할 때 지정한 배열이 담을 수 있는 값의 크기. 즉 여기선 5!
        ab[1] = "최유빈";
        System.out.println(ab.length);
        ab[2] = "한이람";
        System.out.println(ab.length);
        ab[3] = "이명직";
        System.out.println(ab.length);

        for(int i = 0; i < ab.length; i++){
            String bc = ab[i];              // 재선언하는 이유는 아래 설명!
            System.out.println(bc);
        }

        String[] members = { "최진혁", "최유빈", "한이람" };
        for (String e : members) {                          // 배열 members 의 값을 변수 e에 담아서 중괄호 구간 안으로 전달 해준다.
                                                            // 반복문의 종료조건이나 종료조건을 위해서 기준값을 증가시키는 등의 반복적인 작업을 내부적으로 감준 것. 자바 5.0부터 도입된 기능.
            System.out.println(e + "이 상담을 받았습니다");
        }

    }

    /*
    배열 : 연관된 정보를 그루핑 하는데 사용. 연관된 데이터를 모아 관리하기 위해 사용하는 데이터 타입.

    만약 한 학교에 1000명의 학생이 있는데 반을 나누지 않는다면 한 사람씩 모두 호명 하면 많은 시간이 소요될 것이다.
    하지만 학년을 나누고 반을 나누어 호명을 하면 시간을 상당히 절약할 수 있을 것이다!

    배열을 선언할 때는 데이터 타입 뒤에 []를 붙여야 한다.
    []가 없다면 classGroup 은 배열이 아니라 문자열 데이터 타입을 갖는 변수가 된다. // String classGroup 이 되기 때문!
    배열에 소속될 데이터들은 중괄호 안에 위치한다. 그리고 각각의 데이터들은 쉼표로 구분된다.

    대괄호 속에 있는 것을 원소(엘리먼트)라고 한다.
    ☆ 배열은 0부터 카운트 !

    [오류]
    인덱스가 50인데 51을 찾을경우.
    인덱스가 50인데 51을 넣을경우.

    [배열의 한계]
    배열을 초기화할 때 그 크기가 정해진다. 고로 정해진 크기 이상의 값을 넣을 수 없다.
    JavaScript 나 Python, PHP 와 같은 언어들은 배열의 크기를 미리 정의하고 사용하지 않는다.
    자바에는 컬렉션 Collection 이라는 기능이 있다.
    Container 라고도 부르는 이 기능을 이용하면 JavaScript의 배열과 같이 유연하게 배열을 사용할 수 있다.

    members 의 scope 는 main 함수인데, 이를 for문 내에서 그대로 사용하게 되면 원하지 않는 데이터의 변화를 줄 수 있으며
    이는 for 문 뒤에서 members 를 쓰는 모든 코드에 영향을 줍니다.
    그렇기에 loop 내에서 main 에서 사용되는 변수를 가져다 쓸 때는 loop 내에 scope 를 가지는 변수를 재선언 해 주고(member)이를 사용 하는 경우 문제가 커지는걸 막을 수 있습니다.
    즉 loop 내에서 선언한 member 의 값을 변화시켰다 하더라도 for 문이 끝나면 member 는 폐기되고 members는 그대로 유지되어 for 문 외부에 영항을 주지 않게 됩니다.
     */
}
