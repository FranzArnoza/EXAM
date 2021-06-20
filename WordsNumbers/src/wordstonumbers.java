import java.awt.EventQueue;
import java.util.HashMap;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JFormattedTextField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.JSpinner;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class wordstonumbers {

	private JFrame frame;
	private JTextField fr;
	private JTextField fd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					wordstonumbers window = new wordstonumbers();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public wordstonumbers() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setForeground(Color.YELLOW);
		frame.getContentPane().setForeground(Color.GREEN);
		frame.setBounds(100, 100, 664, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("INPUT");
		lblNewLabel.setForeground(Color.PINK);
		lblNewLabel.setBackground(Color.YELLOW);
		lblNewLabel.setBounds(10, 26, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ANSWER");
		lblNewLabel_1.setForeground(Color.PINK);
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 70, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		fr = new JTextField();
		fr.setBounds(81, 23, 368, 20);
		frame.getContentPane().add(fr);
		fr.setColumns(10);
		
		fd = new JTextField();
		fd.setBounds(81, 67, 368, 20);
		frame.getContentPane().add(fd);
		fd.setColumns(10);
		
		JButton btnNewButton = new JButton("Clear");
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fr.setText("");
				fd.setText("");
			}
		});
		btnNewButton.setBounds(483, 44, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("a");
		btnNewButton_1.setForeground(Color.MAGENTA);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +1 + " ");
				fr.setText(fr.getText() +"a" );
			}
		});
		btnNewButton_1.setBounds(43, 123, 46, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_1_26 = new JButton("SPACE");
		btnNewButton_1_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +0 + " ");
				fr.setText(fr.getText() +" " );
			}
		});
		btnNewButton_1_26.setForeground(Color.MAGENTA);
		btnNewButton_1_26.setBounds(43, 221, 382, 23);
		frame.getContentPane().add(btnNewButton_1_26);
		
		JButton btnNewButton_1_1 = new JButton("b");
		btnNewButton_1_1.setForeground(Color.MAGENTA);
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +2 + " ");
				fr.setText(fr.getText() +"b" );
			}
		});
		btnNewButton_1_1.setBounds(92, 123, 46, 23);
		frame.getContentPane().add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("c");
		btnNewButton_1_2.setForeground(Color.MAGENTA);
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +3 + " ");
				fr.setText(fr.getText() +"c" );
			}
		});
		btnNewButton_1_2.setBounds(141, 123, 46, 23);
		frame.getContentPane().add(btnNewButton_1_2);
		
		JButton btnNewButton_1_3 = new JButton("d");
		btnNewButton_1_3.setForeground(Color.MAGENTA);
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +4 + " ");
				fr.setText(fr.getText() +"d" );
			}
		});
		btnNewButton_1_3.setBounds(190, 123, 46, 23);
		frame.getContentPane().add(btnNewButton_1_3);
		
		JButton btnNewButton_1_4 = new JButton("e");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +5 + " ");
				fr.setText(fr.getText() +"e" );
			}
		});
		btnNewButton_1_4.setForeground(Color.MAGENTA);
		btnNewButton_1_4.setBounds(239, 123, 46, 23);
		frame.getContentPane().add(btnNewButton_1_4);
		
		JButton btnNewButton_1_5 = new JButton("f");
		btnNewButton_1_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +6 + " ");
				fr.setText(fr.getText() +"f" );
			}
		});
		btnNewButton_1_5.setForeground(Color.MAGENTA);
		btnNewButton_1_5.setBounds(288, 123, 46, 23);
		frame.getContentPane().add(btnNewButton_1_5);
		
		JButton btnNewButton_1_6 = new JButton("g");
		btnNewButton_1_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +7 + " ");
				fr.setText(fr.getText() +"g" );
			}
		});
		btnNewButton_1_6.setForeground(Color.MAGENTA);
		btnNewButton_1_6.setBounds(337, 123, 46, 23);
		frame.getContentPane().add(btnNewButton_1_6);
		
		JButton btnNewButton_1_7 = new JButton("h");
		btnNewButton_1_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +8 + " ");
				fr.setText(fr.getText() +"h" );
			}
		});
		btnNewButton_1_7.setForeground(Color.MAGENTA);
		btnNewButton_1_7.setBounds(386, 123, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7);
		
		JButton btnNewButton_1_7_1 = new JButton("i");
		btnNewButton_1_7_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +9 + " ");
				fr.setText(fr.getText() +"i" );
			}
		});
		btnNewButton_1_7_1.setForeground(Color.MAGENTA);
		btnNewButton_1_7_1.setBounds(435, 123, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_1);
		
		JButton btnNewButton_1_7_2 = new JButton("j");
		btnNewButton_1_7_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +10 + " ");
				fr.setText(fr.getText() +"j" );
			}
		});
		btnNewButton_1_7_2.setForeground(Color.MAGENTA);
		btnNewButton_1_7_2.setBounds(483, 123, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_2);
		
		JButton btnNewButton_1_7_3 = new JButton("l");
		btnNewButton_1_7_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +12 + " ");
				fr.setText(fr.getText() +"l" );
			}
		});
		btnNewButton_1_7_3.setForeground(Color.MAGENTA);
		btnNewButton_1_7_3.setBounds(70, 157, 39, 23);
		frame.getContentPane().add(btnNewButton_1_7_3);
		
		JButton btnNewButton_1_7_4 = new JButton("m");
		btnNewButton_1_7_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +13 + " ");
				fr.setText(fr.getText() +"m" );
			}
		});
		btnNewButton_1_7_4.setForeground(Color.MAGENTA);
		btnNewButton_1_7_4.setBounds(119, 157, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_4);
		
		JButton btnNewButton_1_7_5 = new JButton("n");
		btnNewButton_1_7_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +14 + " ");
				fr.setText(fr.getText() +"n" );
			}
		});
		btnNewButton_1_7_5.setForeground(Color.MAGENTA);
		btnNewButton_1_7_5.setBounds(168, 157, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_5);
		
		JButton btnNewButton_1_7_6 = new JButton("o");
		btnNewButton_1_7_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +15 + " ");
				fr.setText(fr.getText() +"o" );
			}
		});
		btnNewButton_1_7_6.setForeground(Color.MAGENTA);
		btnNewButton_1_7_6.setBounds(217, 157, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_6);
		
		JButton btnNewButton_1_7_7 = new JButton("p");
		btnNewButton_1_7_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +16 + " ");
				fr.setText(fr.getText() +"p" );
			}
		});
		btnNewButton_1_7_7.setForeground(Color.MAGENTA);
		btnNewButton_1_7_7.setBounds(266, 157, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_7);
		
		JButton btnNewButton_1_7_8 = new JButton("q");
		btnNewButton_1_7_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +17 + " ");
				fr.setText(fr.getText() +"q" );
			}
		});
		btnNewButton_1_7_8.setForeground(Color.MAGENTA);
		btnNewButton_1_7_8.setBounds(315, 157, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_8);
		
		JButton btnNewButton_1_7_9 = new JButton("r");
		btnNewButton_1_7_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +18 + " ");
				fr.setText(fr.getText() +"r" );
			}
		});
		btnNewButton_1_7_9.setForeground(Color.MAGENTA);
		btnNewButton_1_7_9.setBounds(364, 157, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_9);
		
		JButton btnNewButton_1_7_10 = new JButton("s");
		btnNewButton_1_7_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +19 + " ");
				fr.setText(fr.getText() +"s" );
			}
		});
		btnNewButton_1_7_10.setForeground(Color.MAGENTA);
		btnNewButton_1_7_10.setBounds(413, 157, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_10);
		
		JButton btnNewButton_1_7_11 = new JButton("t");
		btnNewButton_1_7_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +20 + " ");
				fr.setText(fr.getText() +"t" );
			}
		});
		btnNewButton_1_7_11.setForeground(Color.MAGENTA);
		btnNewButton_1_7_11.setBounds(462, 157, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_11);
		
		JButton btnNewButton_1_7_12 = new JButton("v");
		btnNewButton_1_7_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +22 + " ");
				fr.setText(fr.getText() +"v" );
			}
		});
		btnNewButton_1_7_12.setForeground(Color.MAGENTA);
		btnNewButton_1_7_12.setBounds(92, 187, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_12);
		
		JButton btnNewButton_1_7_13 = new JButton("w");
		btnNewButton_1_7_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +23 + " ");
				fr.setText(fr.getText() +"w" );
			}
		});
		btnNewButton_1_7_13.setForeground(Color.MAGENTA);
		btnNewButton_1_7_13.setBounds(141, 187, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_13);
		
		JButton btnNewButton_1_7_13_1 = new JButton("x");
		btnNewButton_1_7_13_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +24 + " ");
				fr.setText(fr.getText() +"x" );
			}
		});
		btnNewButton_1_7_13_1.setForeground(Color.MAGENTA);
		btnNewButton_1_7_13_1.setBounds(190, 187, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_13_1);
		
		JButton btnNewButton_1_7_13_2 = new JButton("y");
		btnNewButton_1_7_13_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +25 + " ");
				fr.setText(fr.getText() +"y" );
			}
		});
		btnNewButton_1_7_13_2.setForeground(Color.MAGENTA);
		btnNewButton_1_7_13_2.setBounds(239, 187, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_13_2);
		
		JButton btnNewButton_1_7_13_3 = new JButton("z");
		btnNewButton_1_7_13_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +26 + " ");
				fr.setText(fr.getText() +"z" );
			}
		});
		btnNewButton_1_7_13_3.setForeground(Color.MAGENTA);
		btnNewButton_1_7_13_3.setBounds(288, 187, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_13_3);
		
		JButton btnNewButton_1_7_13_4 = new JButton(",");
		btnNewButton_1_7_13_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +30 + " ");
				fr.setText(fr.getText() +"," );
			}
		});
		btnNewButton_1_7_13_4.setForeground(Color.MAGENTA);
		btnNewButton_1_7_13_4.setBounds(337, 187, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_13_4);
		
		JButton btnNewButton_1_7_13_5 = new JButton(".");
		btnNewButton_1_7_13_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +40 + " ");
				fr.setText(fr.getText() +"." );
			}
		});
		btnNewButton_1_7_13_5.setForeground(Color.MAGENTA);
		btnNewButton_1_7_13_5.setBounds(386, 187, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_13_5);
		
		JButton btnNewButton_1_7_13_5_1 = new JButton("!");
		btnNewButton_1_7_13_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +50 + " ");
				fr.setText(fr.getText() +"1" );
			}
		});
		btnNewButton_1_7_13_5_1.setForeground(Color.MAGENTA);
		btnNewButton_1_7_13_5_1.setBounds(435, 187, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_13_5_1);
		
		JButton btnNewButton_1_7_13_5_2 = new JButton("?");
		btnNewButton_1_7_13_5_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +60 + " ");
				fr.setText(fr.getText() +"?" );
			}
		});
		btnNewButton_1_7_13_5_2.setForeground(Color.MAGENTA);
		btnNewButton_1_7_13_5_2.setBounds(483, 187, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_13_5_2);
		
		JButton btnNewButton_1_7_13_5_3 = new JButton("(");
		btnNewButton_1_7_13_5_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +70 + " ");
				fr.setText(fr.getText() +"(" );
			}
		});
		btnNewButton_1_7_13_5_3.setForeground(Color.MAGENTA);
		btnNewButton_1_7_13_5_3.setBounds(435, 221, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_13_5_3);
		
		JButton btnNewButton_1_7_13_5_4 = new JButton(")");
		btnNewButton_1_7_13_5_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +80 + " ");
				fr.setText(fr.getText() +")" );
			}
		});
		btnNewButton_1_7_13_5_4.setForeground(Color.MAGENTA);
		btnNewButton_1_7_13_5_4.setBounds(483, 221, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_13_5_4);
		
		JButton btnNewButton_1_7_13_5_5 = new JButton("u");
		btnNewButton_1_7_13_5_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +21 + " ");
				fr.setText(fr.getText() +"u" );
			}
		});
		btnNewButton_1_7_13_5_5.setForeground(Color.MAGENTA);
		btnNewButton_1_7_13_5_5.setBounds(511, 157, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_13_5_5);
		
		JButton btnNewButton_1_7_13_5_6 = new JButton("k");
		btnNewButton_1_7_13_5_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fd.setText(fd.getText() +11 + " ");
				fr.setText(fr.getText() +"k" );
			}
		});
		btnNewButton_1_7_13_5_6.setForeground(Color.MAGENTA);
		btnNewButton_1_7_13_5_6.setBounds(532, 123, 46, 23);
		frame.getContentPane().add(btnNewButton_1_7_13_5_6);
	}
}
