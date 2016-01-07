import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

class Mystart extends JPanel {
	private static final int EXIT_ON_CLOSE = 0;
	Image Start_img = Toolkit.getDefaultToolkit().getImage("mainBackground.png");
	Image Start_img_gif = Toolkit.getDefaultToolkit().getImage("snow.gif");
	Image i_start = Toolkit.getDefaultToolkit().getImage("게임시작.gif");
	Image i_end = Toolkit.getDefaultToolkit().getImage("게임종료.gif");
	public static boolean start = true;
	public static boolean end = false;

	public void paintComponent(Graphics g) {
		g.drawImage(Start_img, 0, 0, 933, 670, this);
		g.drawImage(Start_img_gif, 0, 0, 933, 670, this);
		draw_start(g);
		draw_end(g);
	}

	void draw_start(Graphics g) {
		if (start == false) {
			g.drawImage(i_start, 370, 200, 170, 40, this);
		} else {
			g.drawImage(i_start, 360, 190, 190, 60, this);
		}
	}

	void draw_end(Graphics g) {
		if (end == false) {
			g.drawImage(i_end, 370, 330, 170, 40, this);
		} else {
			g.drawImage(i_end, 360, 320, 190, 60, this);
		}
	}
}
