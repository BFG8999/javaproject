package fdff;

public class Ex02 {
	int year;//2002
	int month;//2
	int day;//4
	int star;
	int time;
	String director;
	String a; //Adventure, Drama, Fantasy 
	String name;
	
	void print3(){
		System.out.println("영화제목은"+name+"이고 주제는"+a+"감독은"+director+"입니다"+year+"년"+month+"월"+day+"일에 한국에 상영했고 총 별점은"+star+"이고 상영시간은"+time+"분입니다");
	}
}
