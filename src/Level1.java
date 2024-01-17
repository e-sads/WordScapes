//Word Scapes Assignment
//By: Ethan Sadler
//This is the first level of the game, which gives you 5 letters to choose from to create 4 words including the mystery word


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.SystemColor;

public class Level1 extends JFrame {  //start of class

	private JPanel contentPane;
	private JTextField txtAnswer;

	
	String guess;  //new string to represent word inputted by user
	int score = 1;  //new integer to represent score
	String[] guess2 = new String[5];  //new string array which represents the correct word answers
	{

		guess2[0] = ("art");  //first correct word
		guess2[1] = ("bat");  //second correct word
		guess2[2] = ("bar");  //third correct word
		guess2[3] = ("at");  //fourth correct word
		guess2[4] = ("brat"); //Mystery word
	}


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Level1 frame = new Level1();
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
	public Level1() {  //beginning of level 1
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLevel = new JLabel("LEVEL 1");
		lblLevel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblLevel.setBounds(166, 6, 105, 16);
		contentPane.add(lblLevel);
		
		JTextArea txtrThereAre = new JTextArea();
		txtrThereAre.setText("There are 5 words that you can create \nusing these letters:  \nT, R, B, A, W\n2 LETTERS: 1 word 3 LETTERS: 3 words  \n4 LETTERS: MYSTERY");
		txtrThereAre.setBounds(6, 36, 250, 93);
		contentPane.add(txtrThereAre);
		
		JLabel lblWhatWordCan = new JLabel("What word can you create?");
		lblWhatWordCan.setBounds(268, 36, 176, 16);
		contentPane.add(lblWhatWordCan);
		
		txtAnswer = new JTextField();
		txtAnswer.setColumns(10);
		txtAnswer.setBounds(278, 64, 117, 26);
		contentPane.add(txtAnswer);
		
		JLabel lblWord = new JLabel("");
		lblWord.setBounds(6, 176, 69, 16);
		contentPane.add(lblWord);
		
		JLabel lblMystery = new JLabel("MYSTERY:");
		lblMystery.setBounds(121, 238, 176, 16);
		contentPane.add(lblMystery);
		
		JLabel lblWord2 = new JLabel("");
		lblWord2.setBounds(119, 176, 61, 16);
		contentPane.add(lblWord2);
		
		JLabel lblWord3 = new JLabel("");
		lblWord3.setBounds(229, 176, 61, 16);
		contentPane.add(lblWord3);
		
		JLabel lblWord4 = new JLabel("");
		lblWord4.setBounds(327, 176, 61, 16);
		contentPane.add(lblWord4);
		
		JLabel lblScore = new JLabel("Score: 1");
		lblScore.setBounds(14, 256, 166, 16);
		contentPane.add(lblScore);
		
		
		JButton btnWord1 = new JButton("#1");
		btnWord1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[0])) {   //if the guess is equal to the first word in the array
					lblWord.setText(guess2[0]);  //the label of the first word changes to the word in array
					score = Math.multiplyExact(score, 3);  //the score is equal to the score multiplied by 3
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 3

					btnWord1.setEnabled(false);  //disables the first button
				}  //end of if statement
			
				if (score >= 216) {
					if (JOptionPane.showOptionDialog(null, "You have completed level 1!  Move on to level 2?", "LEVEL COMPLETED", JOptionPane.YES_NO_OPTION, 0, null, null, e)
							== JOptionPane.YES_OPTION) {
					Level1 lvl1 = new Level1();  //creates a new Level 1 form
					lvl1.dispose(); //closes the first level form
					Level2 lvl2 = new Level2();  //creates a new Level 2 form
					lvl2.setVisible(true);  //lets the new Level 2 form be visible to the viewer
					}
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
						

					}  //end of if statement
		});
		btnWord1.setBounds(16, 141, 59, 29);
		contentPane.add(btnWord1);
		
		JButton btnWord2 = new JButton("#2");
		btnWord2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[1])) {   //if the guess is equal to the second word in the array
					lblWord2.setText(guess2[1]);  //the label of the second word changes to the word in array
					score = Math.multiplyExact(score, 3);  //the score is equal to the score multiplied by 3
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 3

					btnWord2.setEnabled(false);  //disables the second button
				}  //end of if statement
					

				if (score >= 216) {
					if (JOptionPane.showOptionDialog(null, "You have completed level 1!  Move on to level 2?", "LEVEL COMPLETED", JOptionPane.YES_NO_OPTION, 0, null, null, e)
							== JOptionPane.YES_OPTION) {
					Level1 lvl1 = new Level1();  //creates a new Level 1 form
					lvl1.dispose(); //closes the first level form
					Level2 lvl2 = new Level2();  //creates a new Level 2 form
					lvl2.setVisible(true);  //lets the new Level 2 form be visible to the viewer
					}
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
						

					}  //end of if statement
		});
		btnWord2.setBounds(121, 141, 59, 29);
		contentPane.add(btnWord2);
		
		
		JButton btnWord3 = new JButton("#3");
		btnWord3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[2])) {   //if the guess is equal to the third word in the array
					lblWord3.setText(guess2[2]);  //the label of the third word changes to the word in array
					score = Math.multiplyExact(score, 3);  //the score is equal to the score multiplied by 3
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 3

					btnWord3.setEnabled(false);  //disables the third button
				}  //end of if statement
					

				if (score >= 216) {
					if (JOptionPane.showOptionDialog(null, "You have completed level 1!  Move on to level 2?", "LEVEL COMPLETED", JOptionPane.YES_NO_OPTION, 0, null, null, e)
							== JOptionPane.YES_OPTION) {
					Level1 lvl1 = new Level1();  //creates a new Level 1 form
					lvl1.dispose(); //closes the first level form
					Level2 lvl2 = new Level2();  //creates a new Level 2 form
					lvl2.setVisible(true);  //lets the new Level 2 form be visible to the viewer
					}
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
						

					}  //end of if statement
		});
		btnWord3.setBounds(231, 141, 59, 29);
		contentPane.add(btnWord3);
		
		JButton btnWord4 = new JButton("#4");
		btnWord4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[3])) {   //if the guess is equal to the fourth word in the array
					lblWord4.setText(guess2[3]);  //the label of the fourth word changes to the word in array
					score = Math.multiplyExact(score, 2);  //the score is equal to the score multiplied by 2
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 2

					btnWord4.setEnabled(false);  //disables the fourth button
				}  //end of if statement
					

				if (score >= 216) {
					if (JOptionPane.showOptionDialog(null, "You have completed level 1!  Move on to level 2?", "LEVEL COMPLETED", JOptionPane.YES_NO_OPTION, 0, null, null, e)
							== JOptionPane.YES_OPTION) {
					Level1 lvl1 = new Level1();  //creates a new Level 1 form
					lvl1.dispose(); //closes the first level form
					Level2 lvl2 = new Level2();  //creates a new Level 2 form
					lvl2.setVisible(true);  //lets the new Level 2 form be visible to the viewer
					}
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
						

					}  //end of if statement
		});
		btnWord4.setBounds(327, 141, 59, 29);
		contentPane.add(btnWord4);
		
		JButton btnMystery2 = new JButton("MYSTERY");
		btnMystery2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[4])) {   //if the guess is equal to the mystery word in the array
					lblMystery.setText("MYSTERY: " + guess2[4]);  //the label of the mystery word changes to the word in array
					score = Math.multiplyExact(score, 4);  //the score is equal to the score multiplied by 4
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 4

					btnMystery2.setEnabled(false);  //disables the mystery button
				}  //end of if statement
					

				if (score >= 216) {
					if (JOptionPane.showOptionDialog(null, "You have completed level 1!  Move on to level 2?", "LEVEL COMPLETED", JOptionPane.YES_NO_OPTION, 0, null, null, e)
							== JOptionPane.YES_OPTION) {
					Level1 lvl1 = new Level1();  //creates a new Level 1 form
					lvl1.dispose(); //closes the first level form
					Level2 lvl2 = new Level2();  //creates a new Level 2 form
					lvl2.setVisible(true);  //lets the new Level 2 form be visible to the viewer
					}
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
						

					}  //end of if statement

				
	
			
		});
		btnMystery2.setBounds(23, 233, 97, 29);
		contentPane.add(btnMystery2);
		
		JButton btnGoBackTo = new JButton("GO BACK TO MAIN MENU");
		btnGoBackTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Level1 lvl = new Level1();  //creates a new level 1 form
				lvl.dispose();  //deletes the level 1 form
				WordScapesAssignment.frame.setVisible(true);  //shows the Word Scapes Assignment title page form
			}
		});
		btnGoBackTo.setBounds(166, 251, 184, 29);
		contentPane.add(btnGoBackTo);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (JOptionPane.showOptionDialog(null, "Are you sure you want to exit??", "EXIT", JOptionPane.YES_NO_OPTION, 0, null, null, e)
						== JOptionPane.YES_OPTION)
								System.exit(0);}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
			
		});
		btnNewButton.setBounds(361, 251, 89, 29);
		contentPane.add(btnNewButton);
		
		
		
		
		
	}  //end of Level 1

}  //end of class