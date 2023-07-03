package finalTerm.WEEK9;

public class HW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("정수를 입력하세요: ");
		int x = 3;
		System.out.println("입력된 정수 " + x + "의 절대값은 " + abs(x));
	}

	public static int abs(int n) {
		if (n < 0)
			n = -n;
		
		return n;
	}

}
