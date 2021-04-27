class Car 
{
	String name = "º¥Ã÷";
	int price = 9000;
	String color = "silver";

	public void setPrice(int price){
		this.price = price;
	}

	public static void main(String[] args){
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = c2;
	}
}
