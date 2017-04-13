import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe extends JFrame {

	private JPanel contentPane;
	JButton one = new JButton("");
	JButton two = new JButton("");
	JButton three = new JButton("");
	JButton four = new JButton("");
	JButton five = new JButton("");
	JButton six = new JButton("");
	JButton seven = new JButton("");
	JButton eight = new JButton("");
	JButton nine = new JButton("");
	boolean text = true;
	int count = 0;
//	GameOverSplash gos = new GameOverSplash();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		TicTacToe frame = new TicTacToe();
		frame.setVisible(true);

	}

	/**
	 * Create the frame.
	 */
	public TicTacToe() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 493, 358);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		one.setBounds(33, 39, 100, 30);
		contentPane.add(one);
		one.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				printxorzero(one);
			}
		});

		two.setBounds(183, 39, 100, 30);
		contentPane.add(two);
		two.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				printxorzero(two);
			}
		});

		three.setBounds(325, 39, 100, 30);
		contentPane.add(three);
		three.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				printxorzero(three);

			}
		});

		four.setBounds(33, 137, 100, 30);
		contentPane.add(four);
		four.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				printxorzero(four);
			}
		});

		five.setBounds(183, 137, 100, 30);
		contentPane.add(five);
		five.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				printxorzero(five);
			}
		});

		six.setBounds(325, 137, 100, 30);
		contentPane.add(six);
		six.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				printxorzero(six);
			}
		});

		seven.setBounds(33, 235, 100, 30);
		contentPane.add(seven);
		seven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				printxorzero(seven);
			}
		});

		eight.setBounds(183, 235, 100, 30);
		contentPane.add(eight);
		eight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				printxorzero(eight);
			}
		});

		nine.setBounds(325, 235, 100, 30);
		contentPane.add(nine);
		nine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				printxorzero(nine);
			}
		});

	}

	protected void printxorzero(JButton button) {
		if (button.getText().trim().length() == 0) {
			if (text == true) {
				button.setText("x");
			} else {
				button.setText("0");
			}
			text = !text;
			count = count + 1;
			if (count >= 5) {
				checker();
			}
		}
	}

	private void checker() {

		String a1 = "one";
		String a2 = "two";
		String a3 = "three";
		String a4 = "four";
		String a5 = "five";
		String a6 = "six";
		String a7 = "seven";
		String a8 = "eight";
		String a9 = "nine";
		if(one.getText().trim().length()!=0) {
			a1=one.getText();
		}
		if(two.getText().trim().length()!=0) {
			a2=two.getText();
		}
		if(three.getText().trim().length()!=0) {
			a3=three.getText();
		}
		if(four.getText().trim().length()!=0) {
			a4=four.getText();
		}
		if(five.getText().trim().length()!=0) {
			a5=five.getText();
		}
		if(six.getText().trim().length()!=0) {
			a6=six.getText();
		}
		if(seven.getText().trim().length()!=0) {
			a7=seven.getText();
		}
		if(eight.getText().trim().length()!=0) {
			a8=eight.getText();
		}
		if(nine.getText().trim().length()!=0) {
			a9=nine.getText();
		}
			

		if (a1.equals(a2) && a1.equals(a3) && a2.equals(a3)) {
			TicTacToe.this.setVisible(false);
			TicTacToe.this.dispose();
			//gos.setVisible(true);
			//gos.over(a1);
		}  if (a1.equals(a4) && a1.equals(a7) && a4.equals(a7)) {
			TicTacToe.this.setVisible(false);
			TicTacToe.this.dispose();
			//gos.setVisible(true);
			//gos.over(a1);
		} if (a1.equals(a5) && a5.equals(a9) && a9.equals(a1)) {
			TicTacToe.this.setVisible(false);
			TicTacToe.this.dispose();
			//gos.setVisible(true);
			//gos.over(a1);
		}  if (a3.equals(a6) && a3.equals(a9) && a6.equals(a9)) {
			TicTacToe.this.setVisible(false);
			TicTacToe.this.dispose();
			//gos.setVisible(true);
			//gos.over(a3);
		}  if (a3.equals(a5) && a3.equals(a7) && a5.equals(a7)) {
			TicTacToe.this.setVisible(false);
			TicTacToe.this.dispose();
			//gos.setVisible(true);
			//gos.over(a3);
		} if (a7.equals(a8) && a8.equals(a9) && a7.equals(a9)) {
			TicTacToe.this.setVisible(false);
			TicTacToe.this.dispose();
		//	gos.setVisible(true);
			//gos.over(a7);
		}
//		if (count == 9) {
//			TicTacToe.this.setVisible(false);
//			TicTacToe.this.dispose();
//			gos.setVisible(true);
//			gos.over(null);
//		}

	}
}
