/*GUI 프로그래밍은 무조건 윈도우가 있어야 한다..
따라서 자바 언어에서 GUI관련된 패키지는 awt/swing에서 지원 
javaFX ( 안드로이드와 많이 비슷 )
*/
package gui;
import java.awt.Frame;

public class MyWin{
	//자바에서 윈도우는 실제적으로 Frame이라는 클래스가 담당	
	public static void main(String[] args){
		Frame frame; //객체의 인스턴스 없다. 따라서 frame에는 초기화되어 있지 않다!!

		/*Frame이라는 클래스는 쓰라고 제공해준것인데, 문제는 어떻게 사용해야할지 난감함..
		왜?? 우리가 정의한 클래스가 아니므로..즉 남이 제공해준것이므로...
		[ 남에게 제공받은 객체 사용하는 Tip ]
			1) 해당 클래스가 도데체 뭔지? 용도가 뭔지? 사용목적이 뭔데?
			
			2) 쓰기위해서는 메모리에 올려야 한다
			    메모리에 올리려면, 이 객체가 일반인지, 추상인지, 인터페이스 인지부터 조사!!
				- 일반클래스인 경우: new 하면 된다!!
				- 추상클래스인 경우: 자식으로 완성 후, 자식을 new하면 됨 
				- 인터페이스인 경우: 자식으로 완성 후, 자식을 new하면 됨 
			
			3) 객체의 유형이 결정되었다면
				- 일반클래스의 경우엔 new 다음에 와야 하는 생성자를 조사
		*/
		frame = new Frame(); //프레임은 기본적으로 눈에 보이지 않도록 속성이 지정되어 있다..
		
		//따라서 개발자가 원하는 타임에, 눈에 보일수 있도록 속성을 변경하는 메서드를 호출해보자!!
		//api document 에서 찾아보자!
		frame.setVisible(true);

		//크기도 명시하지 않으면, 원하는 크기로 윈도우가 보이지 않음 
		frame.setSize(300,400);
	}
 
}
