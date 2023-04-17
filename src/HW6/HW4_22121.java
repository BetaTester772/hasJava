package HW6;

//HW4_안호성
public class HW4_22121 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        boolean school = true;
        int money = 10000;

        if (money > 1300){ // 1300원 보다 많으면
            if (school) // 학생이면
                System.out.println("버스를 타서 학생요금을 냅니다"); // 학생요금을 냅니다
            else
                System.out.println("버스를 타서 어른요금을 냅니다"); // 어른요금을 냅니다
        } else if (money > 8000) { // 1300원 보다 크지 않고 8000원 보다 크면
            System.out.println("택시를 탑니다."); // 택시를 탑니다
        }
    }
}
