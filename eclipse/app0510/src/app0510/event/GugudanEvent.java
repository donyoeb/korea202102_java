package app0510.event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

//버튼을 눌렀을때 해당 이벤트를 청취하는 ActionListener 재정의 
public class GugudanEvent implements ActionListener{
	JTextField t_input;
	int n;
	//생성자 
	public GugudanEvent(JTextField t_input) {
		System.out.println("이벤트 클래스 생성시 넘겨받은 t_input은"+t_input);
		this.t_input=t_input; //받아온 t_input값을 현재 클래스의 t_input값에 넣기
		
	}
	
	public void actionPerformed(ActionEvent e) {
		//나 아닌 다른 클래스에 존재하는 TextField 값에 무엇이 
		//들어있는지 알아맞추기!!
		//t_input값 가져오기~~;
		printDan();
		
	}
	
	public void printDan() {
		String dan = t_input.getText(); 
		System.out.println(dan+"단"); //현재 dan은 문자열
		
		int d = Integer.parseInt(dan); //문자열을 정수화
		
		for(int i=1;i<=9;i++) {
			System.out.println(d+"*"+i+"="+(d*i));
		}
	}
}
