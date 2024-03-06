package day3;

public class Return {
    public static void plus(int num1, int num2) {
        System.out.println(num1 + num2);


    }

    public static double circleArea(int radius) {
//    System.out.println(radius * radius * 3.14);

      return radius *radius *3.14;
}
    public static void main(String[] args) {

        plus(10, 20);

        double area1 = circleArea( 5);
        System.out.println("반지름이 5인 원의 넓이" + area1);

        // 반지름이 5인 원의 넓이를 3의로 나눈값
        System.out.println(area1 / 3);
        // 반지름이 5인 원의 넓이 / 3
        System.out.println(area1 * 2);
        //반지름이 5인 원의 넓이 2배

    }
}

