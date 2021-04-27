class Dog1 
{

	int age=5;
	public void setAge(){
		age=3;
	}
	public static void main(String[] args) 
	{
		Dog1 dg = new Dog1();
		//dg.age=3;
		dg.setAge();
		
		System.out.println(dg.age);
	}
}
