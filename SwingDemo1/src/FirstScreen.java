import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstScreen extends JFrame {

	public static void main(String[] args) {

		FirstScreen frame = new FirstScreen();
		frame.setVisible(true);

	}

	public FirstScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);

		JButton btnOk = new JButton("ok");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnOk.setBounds(10, 34, 98, 30);
		getContentPane().add(btnOk);

		JButton btnCancel = new JButton("cancel");
		btnCancel.setBounds(172, 34, 105, 30);
		getContentPane().add(btnCancel);

		JButton button = new JButton("ok");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBounds(10, 95, 98, 30);
		getContentPane().add(button);

		JButton button_1 = new JButton("ok");
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBounds(177, 95, 98, 30);
		getContentPane().add(button_1);

		JButton button_2 = new JButton("ok");
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_2.setBounds(326, 34, 98, 30);
		getContentPane().add(button_2);

		JButton button_3 = new JButton("ok");
		button_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_3.setBounds(326, 95, 98, 30);
		getContentPane().add(button_3);
	}
}
