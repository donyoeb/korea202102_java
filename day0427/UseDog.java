class UseDog
{
	public static void main(String[] args) 
	{
		String name = new Dog().getName();
		System.out.println("�������� �̸��� : "+ name);
		
		//�ڹٿͰ��� ��ü���� ���� �����ڰ� �ڷ����� �����Ҽ��ִ�..
		// �� ���Ǵ� Ŭ���� ������ �ۼ��Ҽ��ִ�. �׸��� �����ڰ� ������ �ڷ�����
		//����� ���� �ڷ����̶�� �Ѵ�.
		Dog dog = new Dog(); //Dog�̶�� Ŭ������ �����ߴٸ�, Dog���� ���Ӱ� ź����Ų��
		//�� �������ʹ� oop���� �ڷ����� �� 4����� �� �� �ִ�.
		System.out.println("�������� ���� �� ���̴� : " + dog.getAge());
		dog.age=3;
		System.out.println("�������� ����� ���̴� : " + dog.getAge());

		dog.name= "�ǹ�";
		System.out.println("�������� ����� �̸��� : " + dog.getName());


	}
}