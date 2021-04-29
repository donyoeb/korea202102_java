package use;

import animal.Bird;
class UseBird{
// 실행하는 클래스는 public 하지않아도 됨
//누군가 이걸쓰는게 아니기때문에.

	public static void main(String[] args) 
	{
		Bird b = new Bird();
		b.fly();
	}
}
