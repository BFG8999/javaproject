
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 500에서 1000까지의 홀수의 합
		int hap = 0;
		int a;

		for (a = 501; a <= 1000; a = a + 2) {
			hap += a;
		}
		System.out.printf("500~1000까지의 홀수의 합 : %d", hap);
	}

}
