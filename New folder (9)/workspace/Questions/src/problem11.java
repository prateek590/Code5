import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class problem11 {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Welcome\nto\nJava");

		String name = JOptionPane.showInputDialog("What is your name?");

		String message = String.format("Welcome, %s, to Java Programming!", name);

		JOptionPane.showMessageDialog(null, message);
		
		DrawPanel panel = new DrawPanel();
		
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		application.add( panel );
		
		application.setSize( 250, 250 ); 

		application.setVisible( true );

	}

}

class DrawPanel extends JPanel {
	public void PaintComponent(Graphics g) {
		super.paintComponent(g);
		
		int width = getWidth();
		int height = getHeight();
		
		g.drawLine( 0, 0, width, height );		
		g.drawLine( 0, height, width, 0 );	
	}
}
