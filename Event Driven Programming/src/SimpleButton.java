import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SimpleButton {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		JButton hiButton = new JButton("Hi");
		JButton byeButton = new JButton("Bye");
		frame.setLayout(new FlowLayout());
		frame.add(hiButton);
		frame.add(byeButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
