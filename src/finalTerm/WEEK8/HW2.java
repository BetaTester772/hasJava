package finalTerm.WEEK8;

public class HW2 {

	public static void main(String[] args) {
		
		// 반복문 #1
		for (int i = 1; i <= 10; i++) {
			// 반복문 #2
			for (int j = 1; j <= 10; j++) {
				// 계산식 선언(정수)
				int cal = 4 * i + 5 * j;
				if (cal == 60) {
					System.out.printf("(%d, %d)\n", i, j);
				}
			}
		}
	}

}
