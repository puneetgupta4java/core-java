
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class GameOverSplash extends JFrame {

	JLabel lblNewLabel;
	private JPanel contentPane;
	Timer timer;

	public static void main(String[] args) {
		
	}

	public GameOverSplash() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		lblNewLabel = new JLabel("game over");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(59, 73, 345, 50);
		contentPane.add(lblNewLabel);
	}

//	public void over(String a) {
//		if (a == "x") {
//			lblNewLabel = new JLabel("game over  player 1 wins");
//
//		} else if (a == "0") {
//			lblNewLabel = new JLabel("game over  player 2 wins");
//
//		} else {
//			lblNewLabel = new JLabel("their is a draw");
//		}
//
//	}

}
