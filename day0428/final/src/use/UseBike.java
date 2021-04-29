package use;

import traffic.Bike;//트레픽 이전 디렉토리 경로는 클래스패스에서 참조한다.

class UseBike 
{
	public static void main(String[] args) 
	{
		Bike b = new Bike(); // 환경변수 import를 선언해줘야 찾을수있음
		b.run();
	}
}
