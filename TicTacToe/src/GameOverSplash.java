import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

@SuppressWarnings("serial")
public class GameOverSplash extends JFrame {

	JLabel lblNewLabel;
	private JPanel contentPane;

	public static void main(String[] args) {
	}

	public GameOverSplash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(59, 73, 345, 50);
		contentPane.add(lblNewLabel);
	}

	public void over(String a) {
		if (a == "x") {
			lblNewLabel = new JLabel("game over  player 1 wins");

		} else if (a == "0") {
			lblNewLabel = new JLabel("game over  player 2 wins");

		} else {
			lblNewLabel = new JLabel("their is a draw");
		}

	}

}
