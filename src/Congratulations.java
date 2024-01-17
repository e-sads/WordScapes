//Word Scapes Assignment
//By: Ethan Sadler
//This is the "Congratulations" page of the game, where when the user beats the final level of the game it takes them to this screen as a congratulations message

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Congratulations extends JFrame {  //start of congratulations

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Congratulations frame = new Congratulations();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Congratulations() {  //beginning of congratulations
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnGoBack = new JButton("Go back");
		btnGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener
				Congratulations congrat = new Congratulations();  //new congratulations page
				congrat.dispose();  //disposed the congratulations page created
				WordScapesAssignment.frame.setVisible(true);  //makes the Word Scapes Assignment visible to the user
				
			}
		});
		btnGoBack.setBounds(6, 243, 117, 29);
		contentPane.add(btnGoBack);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Users/ethansadler/Downloads/rsz_5dfc443db77ba.png"));
	
		label.setBounds(0, 0, 450, 278);
		contentPane.add(label);
	}

}