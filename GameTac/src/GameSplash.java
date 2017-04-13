import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;

public class GameSplash extends JWindow{

	private JPanel contentPane;
	JProgressBar progressBar = new JProgressBar();
	int progressvalue = 0;
	Timer timer;
	boolean isvisible = true;
	JLabel lblNewLabel = new JLabel("Tic - Tac -Toe");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					GameSplash frame = new GameSplash();
					frame.setVisible(true);
					frame.doanimation();
				
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void doanimation(){
		timer = new Timer(50,new ActionListener(){
			Random r = new Random();

			@Override
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setVisible(isvisible);
			
				if(progressvalue>=100)
				{
					timer.stop();
     				GameSplash.this.setVisible(false);
					GameSplash.this.dispose();
				}
				
				lblNewLabel.setForeground(new Color(r.nextInt(255),r.nextInt(100),r.nextInt(155)));
		    progressvalue++;
		    progressBar.setValue(progressvalue);
		    isvisible = !isvisible;
			}
		}
	);
		timer.start();
	}
	public GameSplash() {
	//	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(91, 71, 223, 75);
		contentPane.add(lblNewLabel);
		
		
		progressBar.setStringPainted(true);
		progressBar.setBackground(Color.BLACK);
		progressBar.setForeground(Color.GREEN);
		progressBar.setBounds(10, 216, 414, 22);
		contentPane.add(progressBar);
	}
}
