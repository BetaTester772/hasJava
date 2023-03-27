package HW3;

// HW3_안호성
public class HW3_22121 {
    public static void main(String[] args) {
        // TODO Auto-gernerated method stub

        int i;
        double f;

        f = 5 / 4; // int 간의 연산의 결과인 1이 double f에 저장됨
        System.out.println(f); // 1.0
        f = (double) 5 / 4; // 5를 double로 형변환한 5.0이 4로 나누어져 1.25가 double f에 저장됨
        System.out.println(f); // 1.25
        f = 5 / (double) 4; // 4를 double로 형변환한 4.0으로 5를 나누어 1.25가 double f에 저장됨
        System.out.println(f); // 1.25
        f = (double) 5 / (double) 4; // 5와 4를 double로 형변환한 5.0을 4.0으로 나누어져 1.25가 double f에 저장됨
        System.out.println(f); // 1.25
        f = (double) (5 / 4); // int 간의 연산의 결과인 1을 double로 형변환한 1.0이 double f에 저장됨
        System.out.println(f); // 1.0
        i = (int) 1.3 + (int) 1.8; // 1.3과 1.8을 int로 형변환한 1과 1이 더해져 2가 int i에 저장됨
        System.out.println(i); // 2
    }
}
