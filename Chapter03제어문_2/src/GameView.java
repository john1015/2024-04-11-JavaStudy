//이미지 및 gif는 따로 다운 받기

import java.awt.*;
import javax.swing.*;

public class GameView extends JPanel {
	Image back,horse;
	int x=750;
	int y=250;
	public GameView() {
		//변수의 초기화 => 생성자
		back = Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\a.jpg");
		horse = Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\ss.gif");
	}
	@Override
	public void paint(Graphics g) {
		
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		g.drawImage(horse,x,y,120,80,this);
	}
	
	
}
