package b;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	void print(){
		System.out.println("채널은"+channel+"이고 볼륨은"+volume+"입니다");
	}

}

public class TelevisionTest {
	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		Television yourTv = new Television();
		yourTv.channel = 9;
		yourTv.volume = 12;
		yourTv.onOff = true;
		yourTv.print();
	}
}
