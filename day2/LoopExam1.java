package day2;

public class LoopExam1 {
    // 문제 : 1부터 100까지 출력해주세요.
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) System.out.println(i);


// 문제1. 1 ~ 100까지 수를 출력하는데 숫자 뒤에 짝수는 even, 홀수는 odd를 붙여서 출력

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) System.out.println(i + "even");
            if (i % 2
                    != 0) ;
            System.out.println(i + "odd");
        }

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) System.out.println(i + "even");
            else System.out.println(i + "odd");
        }

    }
}








