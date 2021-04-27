class Phone 
{
	int price = 5000;
	String name = "G21";
	static String company = "Samsung"; 	//static인 '고정적인' 이란 뜻으로 수정자라고 불린다
	// static으로 선언된 변수, 메서드는 new할때 해당 인스턴스에 소속되지않는다. 따라서 원본클래스에 존재한다
	// 따라서 static으로 선언된 멤버면수를 특히나 클래스 변수라 한다.
	
	public void ring(){
		System.out.println("벨이 울려요");
	}

	public static void main(String[] args){
		String c = company; //클래스가 보유한 클래스 변수(static) 는 이렇게 접근! 
		
		//메인이 클래스안에 있지않고 외부에있다면	
		//	String c = Phone.company; 
		//라고해야한다
		Phone p1 = new Phone(); //p1같은 변수를 레퍼런스변수라고 한다
		p1.company = "LG";

		company="motor";

		Phone p2 = new Phone();
		p2.company="sambo";

		System.out.println(p1.company); //결과는 sambo => 전역변수느낌으로 company에 다 들어가버림

	
	}
}
