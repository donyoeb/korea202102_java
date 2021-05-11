package app0510.layout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;  //ctrl + shift + o
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

public class Loginform {
	public static void main(String[] args) { //Ctrl + Space
		
		Frame frame = new Frame("로그인 폼 타입1"); //null조차 자동으로 초기화 되지않는다. 왜? 지역변수기 때문에.. 멤버변수만 관여
		//결론: 지역변수는 초기화하는 습관을 갖자
		
		//frame의 borderlayout의 한 방위(동서남북센터)는 컴포넌트들이 공존할수 없고,
		//크기또한 컨테이너까지 늘어나버린다.. (ex 대왕버튼)
		//컨테이너중 가장 많이 사용되는 패널사용하기!!
		Panel p_center = new Panel(); //패널은 디폴트 레이아웃은 flowlayout이다
		
		//패널에 적용된 배치방법을 바꿔보자!! 그리드로
		GridLayout grid = new GridLayout(2,2); //2행 2열
		p_center.setLayout(grid);
		
		////////조립//////
		
		//센터에 라벨 부착
		Label la_id = new Label("ID");
		p_center.add(la_id);
		
		//센터에 텍스트필드 얹히기
		TextField t_id = new TextField();
		p_center.add(t_id); //방위를 명시하지않으면 디폴트가 센터!

		//센터에 라벨 부착
		Label la_pass = new Label("PASS");
		p_center.add(la_pass);
		
		//센터에 텍스트필드 얹히기
		TextField t_pass = new TextField();
		p_center.add(t_pass); //방위를 명시하지않으면 디폴트가 센터!

		//라벨의 경계를 알기위해 배경색을 적용해보자!
		la_id.setBackground(Color.YELLOW);
		
		
		Panel p_south = new Panel(); //남쪽에 버튼들을 얹힐 패널
		
		Button bt_login = new Button("Login");
		Button bt_join = new Button("Join");
		p_south.add(bt_login);  
		p_south.add(bt_join);
		
		
		frame.add(p_center); //패널을 윈도우에 부착
		frame.add(p_south, BorderLayout.SOUTH); //남쪽에 버튼을 포함하고있는 패널 부착
		
		frame.setVisible(true);
		frame.setSize(300,120);
	}

}
