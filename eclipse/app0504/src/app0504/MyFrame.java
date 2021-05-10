package app0504;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

/*프레임은 윈도우기 때문에 다른 컴포넌트들을 올려놓을 수 있다.
 	이때 어떤 방식으로 올려놓을지에 대해서는 배치관리자라 불리는 클래스로 지원한다.
 	
 	배치 관리자의 종류
 	1. FlowLayout : 수평 또는 수직 방향으로 컴포넌트 배치, 윈도우 크기에 따라 내부 컴포넌트들이 흘러다님(유동적)
 	2. BorderLayout
 	3. GridLayout
 	4..5... 등등 ..보통 위의 세가지만 사용
 
 */
public class MyFrame {
	
	public static void main(String[] args) {
		Frame frame = new Frame();
		
		FlowLayout flow = new FlowLayout();
		frame.setLayout(flow);
		
		for(int i = 0; i<20; i++) {
			Button bt = new Button(i+" 번째 버튼");
			frame.add(bt);
		}

		frame.setSize(300,400);
		frame.setVisible(true);

	}
}
