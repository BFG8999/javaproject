package a;

public class Televisio {
	int channel;
	int volume;
	boolean onOff;
	void print(){
		System.out.println("�ڷ������� ä����" + channel + "�̰� ������" + volume + "�Դϴ�");
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
		System.out.println("���� ä����" +ch+"�Դϴ�");
	}
}
