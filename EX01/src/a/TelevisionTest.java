package a;

public class TelevisionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 10;
		myTv.onOff = true;
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		
		System.out.println("나의 텔레비전의 채널" + myTv.channel + "이고 불륨은" +myTv.volume + "입니다");
		System.out.println("나의 텔레비전의 채널" + yourTv.channel + "이고 불륨은" +yourTv.volume + "입니다");
	}

}
