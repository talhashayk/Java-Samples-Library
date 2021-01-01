import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonWithText {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		JButton hiButton = new JButton("Hi");
		JButton byeButton = new JButton("Bye");
		JTextField textField = new JTextField(20);
		textField.setText("Click a Button");
		JLabel label = new JLabel();
		label.setText("Click a Button");
		frame.setLayout(new FlowLayout());
		frame.add(textField);
		frame.add(label);
		frame.add(hiButton);
		frame.add(byeButton);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
