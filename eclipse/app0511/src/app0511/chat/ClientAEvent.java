package app0511.chat;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;


public class ClientAEvent implements ActionListener, KeyListener{
	
	private JTextField t_input;  
	private JTextArea area;
	
	@Override
	public void actionPerformed(ActionEvent e) { //이벤트가 일어날때~
			
			//System.out.println("사용자에 의해 생성된 이벤트정보 : "+e);
			showText();
	}
	
	//setter 정의
	public void setT_input(JTextField t_input) {
		this.t_input = t_input;
		
	}
	public void setArea(JTextArea area) {	
		this.area = area; 
	}
	//채팅창에 반영하기
	public void showText() {
		//텍스트필드 값 얻기!
		String msg = t_input.getText();
		
		//텍스트에리아에 값 누적시키기!
		//area.setText(msg); 이건 대체하는것!
		area.append(msg+"\n"); //누적!
		
		//모든입력값 초기화
		t_input.setText("");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {
		//키 이벤트 객체가 매개변수로 전달되면 개발잔 원하는 정보를 추출하여 프로그램에서 사용하면 된다
		int key = e.getKeyCode(); //키 코드 가져오기
		//엔터 키 코드는 10이다. 하지만 상수 이용하기!
		if(key==KeyEvent.VK_ENTER) { //상수를 이용하면 직관성이 있다!
			showText();
		}
			
	}
	
}
