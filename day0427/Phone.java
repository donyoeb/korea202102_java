class Phone 
{
	int price = 5000;
	String name = "G21";
	static String company = "Samsung"; 	//static�� '��������' �̶� ������ �����ڶ�� �Ҹ���
	// static���� ����� ����, �޼���� new�Ҷ� �ش� �ν��Ͻ��� �Ҽӵ����ʴ´�. ���� ����Ŭ������ �����Ѵ�
	// ���� static���� ����� �������� Ư���� Ŭ���� ������ �Ѵ�.
	
	public void ring(){
		System.out.println("���� �����");
	}

	public static void main(String[] args){
		String c = company; //Ŭ������ ������ Ŭ���� ����(static) �� �̷��� ����! 
		
		//������ Ŭ�����ȿ� �����ʰ� �ܺο��ִٸ�	
		//	String c = Phone.company; 
		//����ؾ��Ѵ�
		Phone p1 = new Phone(); //p1���� ������ ���۷���������� �Ѵ�
		p1.company = "LG";

		company="motor";

		Phone p2 = new Phone();
		p2.company="sambo";

		System.out.println(p1.company); //����� sambo => ���������������� company�� �� ������

	
	}
}