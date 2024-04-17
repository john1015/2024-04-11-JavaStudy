import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GameMain extends JFrame implements KeyListener{
	GameView gv = new GameView();
	public GameMain() {
		add("Center",gv);
		setSize(1000,700);
		setVisible(true);
		addKeyListener(this);
	}
	public static void main(String[] args) {
		new GameMain();
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getSource()==this) {
			if(e.getKeyCode()==KeyEvent.VK_LEFT) {
				gv.x-=5;
				if(gv.x<0) gv.x=500;
				
				gv.repaint();
			}
		}
		if(e.getSource()==this) {
			if(e.getKeyCode()==KeyEvent.VK_UP) {
				gv.y-=5;
				if(gv.y<0) gv.y=500;
				
				gv.repaint();
			}
		}
		if(e.getSource()==this) {
			if(e.getKeyCode()==KeyEvent.VK_DOWN) {
				gv.y+=5;
				if(gv.y<0) gv.y=500;
				
				gv.repaint();
			}
		}
		if(e.getSource()==this) {
			if(e.getKeyCode()==KeyEvent.VK_RIGHT) {
				gv.x+=5;
				if(gv.x<0) gv.x=500;
				
				gv.repaint();
			}
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		
	}

}
