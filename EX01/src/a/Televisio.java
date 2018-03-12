package a;

public class Televisio {
	int channel;
	int volume;
	boolean onOff;
	void print(){
		System.out.println("텔레비전의 채널은" + channel + "이고 볼륨은" + volume + "입니다");
	}
	int getChannel(){
		return channel;
	}

}

public class TelevisonTest {
	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		int ch = myTv.getChannel();
		System.out.println("현재 채널은" +ch+"입니다");
	}
}
