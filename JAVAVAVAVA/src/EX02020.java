import java.util.Scanner;
public class EX02020 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int a,b;
		System.out.printf("A 수를 입력하시오");
		a = s.nextInt();
				
		System.out.printf("B 수를 입력하시오");
		b = s.nextInt();
		
		if(a > b){
			System.out.printf("A가 크다");
		}else
			System.out.println("B가 크다");
		
		
		
	}

}
