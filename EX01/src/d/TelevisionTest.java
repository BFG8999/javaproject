package d;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television();
		myTv.setChannel(11);
		int ch = myTv.getChannel();
		System.out.println("현재 채널은"+ch+"입니다");
	}

}
