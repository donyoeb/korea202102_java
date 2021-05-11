package app0511.chat;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClientA extends JFrame{
	
	JButton bt_open;
	
	JTextArea area;
	JTextField t_input;
	JButton bt;
	JScrollPane scroll;
	
	public ChatClientA() {
		
		bt_open = new JButton("열기");
		//생성
		area = new JTextArea();
		t_input = new JTextField(20);
		bt = new JButton("전송");
		scroll = new JScrollPane(area);
		
		//스타일,레이아웃
		this.setLayout(new FlowLayout());
		area.setPreferredSize(new Dimension(280,280)); //플로우레이아웃이라 사이즈를 따로 입력해주기 
		area.setBackground(new Color(250,255,0));
		
		//조립
		add(bt_open);
		add(scroll);
		add(t_input);
		add(bt);
		
		//이벤트 리스너와의 연결
		ClientAEvent ce = new ClientAEvent(); //지역변수는 자동으로 초기화되지않으므로 반드시 개발자가 초기화하기!
		bt.addActionListener(ce);
		//ce에 t_input전달하기
		ce.setT_input(t_input); //콜 바이 레퍼런스
		ce.setArea(area);
		
		//텍스트필드와 리스너 연결
		t_input.addKeyListener(ce);
		
		
		//보여주기
		setBounds(300, 100, 300, 400); //x,y,w,h
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new ChatClientA();
	}

}
