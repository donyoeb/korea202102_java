class Dog 
{
	int age = 5;
	String color = "white";
	String name = "lee";
	/*�������� ���� �� �ִ� �Ӽ����� ������ �����غ���
      �ϳ��� Ŭ������ ������ �������� ������ ��ü�� �ݿ��� ����, �Ӽ��� ǥ���ߴٰ� �Ͽ�
      property��(�Ӽ�) �Ѵ�
    */
	 //�Լ� �� �޼��� ���� js �� �ణ �ٸ���
   //public  ���� ������, void = �� �޼��ٰ� ��ȯ���� ����
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;

	}

	public void getColor(){
		System.out.println(color);
	}


}

