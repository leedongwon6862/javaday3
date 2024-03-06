package day2;

public class DoubleLoop {
    public static void main(String[] args) {
        //반복문안반복문 : 반복되는 것이 또반복될수 있을때 이중반복문 대표적인것이 구구단
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }


        for (int i = 0; i < 3; i++) {
            System.out.println("실행");
            System.out.println("됩니다");
        }
        //코드가 몇줄이건간데 중괄호 안에 적으면 반복


        for (int i = 0; i < 3; i++) {
            for (int J = 1; J <= 5; J++) {
                System.out.println(J);
            }
        }
        for (int cnt = 0; cnt < 5; cnt++) {
            System.out.println("실행");
        }

        //1 부터 5까지 반복되는걸 3번 반복해라 라는 이중반복문


        //구구단 2~ 9단 출력
        System.out.println("2 X 1 = 2");
        System.out.println("2 X 2 = 4");
        System.out.println("2 X 3 = 6");
        System.out.println("2 X 4 = 8");

        //구구단 2단 출력
        int dan = 2;
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " X " + i + "  = " + (dan * i));
        }

        //구구단 3단출력
        for (int i = 1; i <= 9; i++) {
            System.out.println("3 X " + i + "  = " + (3 * i));


        }
    }}

