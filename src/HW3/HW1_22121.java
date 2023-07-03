package HW3;

// HW1_안호성
public class HW1_22121 {
    public static void main(String[] args) {
        // 정수형 변수 2개(반지름, 높이)와 실수형 변수 2개(3.141592, 부피)를 이용하여 코드 완성하기
        int r = 10;
        int h = 100;

        double pi = 3.141592;
        double V = 0;

        V = 1 / (double) 3 * pi * r * r * h;
        System.out.println("원뿔의 반지름 : " + r);
        System.out.println("원뿔의 높이 : " + h);
        System.out.println("원뿔의 부피는 " + V);

//        추가
        V = 1 / 3 * pi * r * r * h;
        System.out.println("원뿔의 반지름 : " + r);
        System.out.println("원뿔의 높이 : " + h);
        System.out.println("원뿔의 부피는 " + V);
    }
}