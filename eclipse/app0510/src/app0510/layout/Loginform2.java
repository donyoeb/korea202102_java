package app0510.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;


//로그인폼 예제에서는 메인메서드 안에 변수를 몰아넣고, 즉 지역변수로 객체들을 처리하고있다.
//이번엔 oop언어의 is-a, has-a관계를 활용하여 객체를 정의해본다

								  // is-a
public class Loginform2 extends Frame {
	
	Label la_id;  //has-a
	Label la_pass;  //null값들로 초기화 되어있다.
	TextField t_id;
	TextField t_pass;
	Button bt_login;
	Button bt_join;
	
	Panel p_center;
	Panel p_south;
	
	//이 윈도인 즉 로그인폼이 메모리에 생성될때, 해당 부품들도 같이 생성시키려면 생성자메서드를 적극 활용해야한다
	public Loginform2() { //부품 생성자
		
		la_id= new Label("ID");
		la_pass =new Label("PASS");
		t_id = new TextField(20); //20자 너비 크기를 가짐(20자만 넣는건 아님)
		t_pass = new TextField(20);
		bt_login = new Button("login");
		bt_join = new Button("join");
		
		p_center=new Panel();
		p_south=new Panel();
	
		//스타일 설정
		la_id.setPreferredSize(new Dimension(110,35));
		t_id.setPreferredSize(new Dimension(110,35));
		la_pass.setPreferredSize(new Dimension(110,35));
		t_pass.setPreferredSize(new Dimension(110,35));
		
		//조립
		p_center.add(la_id);
		p_center.add(t_id);
		p_center.add(la_pass);
		p_center.add(t_pass);
		
		p_south.add(bt_login);
		p_south.add(bt_join);
		
		//패널을 윈도우에 부착
		this.add(p_center);
		this.add(p_south, BorderLayout.SOUTH);
		
		//윈도우 크기설정
		this.setSize(300,120); 
		//현재 클래스가 프레임을 상속받은 자식이므로 프레임이 보유한 메서드를 내껏처럼 쓸수있따
		//내가 윈도우니까 this .. 생략해도된다 
		//setSize(300,120);
		
		//윈도우 보이게
		this.setVisible(true);
		
		//윈도우 제목 -방법1 부모의 일반 메서드 이용
		this.setTitle("로그인 폼 스타일2");
		//방법2 부모의 생성자 이용
		//super("로그인폼 스타일2"); //대신 이건 생성자 맨 위에 존재해야함 public loginfrom2(){
			//바로 아래
		//}
	}
	
}
