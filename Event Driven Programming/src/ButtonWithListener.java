import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ButtonWithListener {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Talha");
		frame.setSize(400,400);
		JButton hiButton = new JButton("Hi");
		JButton byeButton = new JButton("Bye");
		final JTextField textField = new JTextField(20);
		textField.setText("Click a Button");
		final JLabel label = new JLabel();
		label.setText("Click a Button");
		
		hiButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				textField.setText("Wagwan?");
				label.setText("Wagwan?");
			}
		});
		
		byeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				textField.setText("Hold it");
				label.setText("Hold it");
			}
		});
		
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
