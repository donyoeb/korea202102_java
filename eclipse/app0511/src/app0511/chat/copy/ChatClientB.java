package app0511.chat.copy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientB extends JFrame implements KeyListener{
	JTextArea area;
	JScrollPane scroll;
	JTextField t_input;
	
	private JTextArea area2;
	
	//setter말고 생성자도 메서드이기떄문에 생성자를통해 매개변수 전달이 가능함!!
	public ChatClientB(JTextArea area2) { ////chatclientA chatA처럼 통째로 가져올수도있다.
		this.area2 = area2;
		
		//생성
		area = new JTextArea();
		scroll = new JScrollPane(area);
		t_input = new JTextField(24);
		
		//스타일, 레이아웃
		setLayout(new FlowLayout());
		scroll.setPreferredSize(new Dimension(280, 280));
		area.setBackground(Color.CYAN);
		
		//조립 
		add(scroll);
		add(t_input);
		
		//이벤트연결
		t_input.addKeyListener(this);
		
		//보여주기
		setBounds(600, 100, 300, 400);
		setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {	}

	@Override
	public void keyPressed(KeyEvent e) {}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_ENTER) {
			showText();
		}
		
	}
	
	//setter
	public void setArea2(JTextArea area) {
		area2 = area;
	}
	
	public void showText() {
		String msg = t_input.getText();//(1) TextField 값 가져오기
		area.append(msg+"\n");//(2) TextArea에 누적
		t_input.setText("");//(3)기존 입력값 초기화 
		
		area2.append(msg+"\n");
	}
	
}

