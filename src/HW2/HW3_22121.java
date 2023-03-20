package HW2;

//HW3_안호성
public class HW3_22121 {
    public static void main(String[] args) {
        int r = 10, h = 100;
        double pi = 3.141592;
        System.out.println("원기둥의 반지름 : " + r);
        System.out.println("원기둥의 높이 : " + h);

        System.out.println("원기둥의 부피는 : " + r * r * pi * h); // 31415.92
        System.out.println("원기둥의 부피는 : " + r * r * h * pi); // 31415.920000000002
        /*
        부동 소수점 오류 때문에
        31415.920000000002가 출력됨
         */
    }
}
