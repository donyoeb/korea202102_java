package animal; //컴파일시, 이 bird의 .class를 animal이란 패키지를 
//자동 생성하여, 넣어준다.. javac -d 옵션에 의해..

//패키지에 넣어둔 클래스는 아무도 접근을 못하므로, 공개해야 한다.
//공개를 결정짓는 키워드인 public 접근제어자 - 


public class Bird 
{
	String name ="제비";
	public void fly(){
		System.out.println(name+"가 날아갑니다");
	}
}
