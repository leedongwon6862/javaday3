package day2;

public class IncDecOperator
{public static void main(String[] args) {
    // 반복문을 이용해 동일한 명령을 여러번 실행
//    while(true) {
//        System.out.println("실행");

        //  원하는 만큼만 반복

        int cnt = 0; //반복횟수 세는 용도


        while(cnt < 5) { System.out.println("실행");
            cnt++;




        // 반복문의 또다른 형태 for문
        for(int cnt2 =0; cnt2 <5; cnt2++){System.out.println("실행"); }

        // 1부터 10 까지 출력
            for(int i =1; i<= 10; i++ ){
                System.out.println(i);
            };


        // 1부터  10까지 짝수 출력
                for(int i = 2; i <= 10; i+=2) {
                    System.out.println(i);
                }






}}}