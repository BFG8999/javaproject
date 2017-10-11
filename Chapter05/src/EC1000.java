import java.util.Scanner;
public class EC1000 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("a를 입력하시오");
		a = s.nextInt();
		
		System.out.println("b를 입력하시오");
		b = s.nextInt();
		
		c = a+b;
		
		System.out.printf("답은" + c);
		

	}

}
