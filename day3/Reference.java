package day3;

public class Reference {
    public static void main(String[] args) {
        new Person();  // 객체가 힙메모리에 형성

        Person p1 = new Person();
        Person p2 = new Person();

        System.out.println(p1);
        System.out.println(p1);
        p1.name ="홍길동";
        p1.age  = 20;
        p1.home = "서울";

        System.out.println(p1.name);

        //사람복사
        Person p3 = p1; // 홍길동 정보를 p 3에 복사
        System.out.println(p3.name);

        //홍길동은 2명이 될걸까 ? x   홍길동 객체가 복사된 것이 아니라 참조값이 복사된것이기 때문 홍길동 객체는
        //여전히 한개이며 P1 과 P3는 같은 객체를 참조하고있다.

        p3.name = "이순신";
        System.out.println(p3.name);

        // 문제 손흥민을 2명 만들어주세요.( 단 코드의 중복은 없어야한다 .)
        // 손흥민 , 31 , 런던

        Person p4 =new Person();
        p4.name = "손흥민";
        p4.age =  31;
        p4.home = "런던";

        System.out.println(p1);


        //객체의 복사는 참조값의 복사 (얕은복사) ,객체값의 복사 (깊은복사)

        //메모리 는 스택 (우리가 변수 저장하는거 )과 힙( 객체)  , 객체는 직접갈수없어 참조값만들어서감
    }


    static class Person {

        String name;
        int age;
        String home;

    }}

