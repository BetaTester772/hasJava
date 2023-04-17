package HW6;
//HW1_안호성
public class HW1_22121 {
    public static void main(String[] args) {
        int season = 6;
        System.out.println("Season:"+season);

        switch (season) {
            case 1:
                System.out.println("Spring");
                break;
            case 2:
                System.out.println("Summer");
                break;
            case 3:
                System.out.println("Autumn");
                break;
            case 4:
                System.out.println("Winter");
                break;
            default:
                System.out.println("SEASON");
                break;
        }
    }
}
