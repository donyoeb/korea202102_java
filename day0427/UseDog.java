class UseDog
{
	public static void main(String[] args) 
	{
		String name = new Dog().getName();
		System.out.println("강아지의 이름은 : "+ name);
		
		//자바와같은 객체지향 언어에서 개발자가 자료형을 정의할수있다..
		// 이 정의는 클래스 단위로 작성할수있다. 그리고 개발자가 정의한 자료형을
		//사용자 정의 자료형이라고 한다.
		Dog dog = new Dog(); //Dog이라는 클래스를 정의했다면, Dog형을 새롭게 탄생시킨것
		//이 시점부터는 oop언어에서 자료형이 총 4개라고 할 수 있다.
		System.out.println("강아지의 변경 전 나이는 : " + dog.getAge());
		dog.age=3;
		System.out.println("강아지의 변경된 나이는 : " + dog.getAge());

		dog.name= "뽀미";
		System.out.println("강아지의 변경된 이름은 : " + dog.getName());


	}
}
