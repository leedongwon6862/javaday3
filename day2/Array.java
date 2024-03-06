package day2;

public class Array {
    public static void main(String[] args) {

        //모든 변수를 출력. - 값이 많아지면 변수가 많아지고 변수가 많아지면 힘들다  > 배열
        //배열을 사용하면 변수를 하나로 묶을수있다.
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int e = 50;
        int f = 60;
        int g = 70;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        // sout 탭누르면됌

        //  배열 사용하는법 > 배열선언 > 배열은 순서(index)에 따라 값을 꺼낼수있다
        //  저장은 하나로 했지만 출력은 x
        int[] num = {10, 20, 30, 40, 50, 60, 70};
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);
        System.out.println(num[5]);
        System.out.println(num[6]);
        System.out.println(num.length);
        //모든 배열은 length 라는 길이 정보를 가지고있다
        // 프로그램 세계에선 시작을 0부터

        //0~6까지 수열 만들기

        for (int i = 0; i < 7; i++) {
            System.out.println(num[i]);
        }
        // 7대신 num.length 쓰면 더확실하다
        //배열을 미리 만들어 놓고 저장하기

        // 10개 짜리 배열 만든다.
        // 자료형 [개수]
        int[] arr = new int[10];
        // 3번째 인덱스에 100 저장
        arr[2] = 100;

        // 문자열 3개 저장하는 배열 만들어보세요
        String[] strArr = new String[3];

        int[] arr2 = new int[3];
        arr2[0] = 10;
        //배열은 한가지 자료형 만 묶을수있다

        // string 8 바이트 , int 4 바이트 인데 , 스택 안에  지역변수 는 8bite 만 저장할수있다 , 객체는 그래서 힙이라는곳에 저장해야함
        //스택은 직접접근 가능 하나 힙은 직접가능 못한다 > 객체 의 하나의 (참조값 )식별코드를 가지고 연결해줌



    }
}