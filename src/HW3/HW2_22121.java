package HW3;

// HW2_안호성
public class HW2_22121 {
    public static void main(String[] args) {
        // 정수형 변수 1개(화씨온도)와 실수형 변수 1개(섭씨온도)를 활용해 다음과 같은 결과 출력하기

        int f = 100;
        double c = 0;

        c = 5 / (double) 9 * (f - 32);

        System.out.println("화씨 온도를 입력하세요 : " + f);
        System.out.println("화씨 " + f + "도는 섭씨 " + c + "에 해당합니다.");
    }
}
