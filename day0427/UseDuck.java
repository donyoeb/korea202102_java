/*현실의 사물을 표현하기위함이 아니라, 단지 실행부를 두기 위한 더비클래스*/
class UseDuck 
{
	public static void main(String[] args) 
	{
		//하드디스크에 컴파일 되어있는 기계오리를 메모리에 살아 숨쉬게 해보자!!
		//즉 실행해서 메모리에 올리자!!
		int x = 7;
		Duck duck = new Duck();
		//실행하는 순간 메모리에 올라간다
		
		System.out.println("duck이 담고있는 오리 인스턴스의 주소값은 "+duck);
		// @~ 자바 가상머신 힙영역에 생성된 오리 인스턴스의 메모리주소값
		
	}
}
