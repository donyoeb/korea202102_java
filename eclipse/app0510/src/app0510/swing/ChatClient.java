package app5010.swing;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame{ //챗 클라이언트는 곧 프레임이다
	JTextArea area;
	JPanel p_south;
	JTextField t_input;
	JButton bt_send;
	
	public ChatClient() {
		area = new JTextArea();
		p_south = new JPanel();
		t_input = new JTextField(20);
		bt_send = new JButton("전송");
		
		//스타일적용
		area.setBackground(Color.GRAY);
		
		//조립
		add(area);
		p_south.add(t_input);
		p_south.add(bt_send);
		add(p_south, BorderLayout.SOUTH);
		
		
		//보여주기 
		setSize(300,400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE); //윈도우 창 닫을때 프로세스도 종료
	}
	public static void main(String[] args) {
		new ChatClient();
	}
}
