import java.awt.BorderLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JWindow;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class SplashScreen extends JWindow {

	private JPanel contentPane;
    Icon icon = new ImageIcon(SplashScreen.class.getResource("giphy.gif"));
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					SplashScreen frame = new SplashScreen();
					frame.setVisible(true);
				
	}

	/**
	 * Create the frame.
	 */
	public SplashScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(icon);
		lblNewLabel.setBounds(10, 11, 375, 259);
		contentPane.add(lblNewLabel);
	}

	private void setDefaultCloseOperation(int exitOnClose) {
		// TODO Auto-generated method stub
		
	}

}
