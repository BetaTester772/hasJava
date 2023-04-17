package HW6;

//HW3_안호성
public class HW3_22121 {
    public static void main(String[] args) {

        int year = 2023;
        int month = 13;
        int day = -1;

        System.out.println(year + "년의 " + month + "월");

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
            case 2:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    day = 29;
                else
                    day = 28;
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
        }
        if (day == -1) {
            System.out.println("달을 잘못 입력하셨습니다.");
        } else
            System.out.println("달의 날 수는 :" + day);
    }
}