package game;
import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame {
	Image ball =Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image table=Toolkit.getDefaultToolkit().getImage("images/table.jpg");
	
	double x=100;
	double y=100;
	
	double degree = 3.14/3;
	
	public void paint(Graphics g) {
		System.out.println("���f�Q�e�F�@��");
		g.drawImage(table,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		x = x+10*Math.cos(degree);
		y = y+10*Math.sin(degree);
		if(y>500-70||y<40+40){
			degree = -degree;
		}
		if(x<40||x>856-40-30) {
			degree =3.14-degree;
		}
	}
			
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		System.out.println("�w��");
		BallGame game = new BallGame();
		game.launchFrame();
	}
}
