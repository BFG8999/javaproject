import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int hap = 0;
		int a,b;
		
		System.out.printf("���� �Է��Ͻÿ�");
		a = s.nextInt();
		
		for(b = 1;b <= a; b++){
			hap += b;
		}
		System.out.println("��"+hap);

	}

}

