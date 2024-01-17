//Word Scapes Assignment
//By: Ethan Sadler
//This is the second level of the game, which gives you 6 letters to choose from to create 6 words including the mystery word

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;

public class Level2 extends JFrame {  //start of class

	private JPanel contentPane;
	private JTextField txtAnswer;
	String guess;  //new string to represent word inputted by user
	int score = 1;  //new integer to represent score

	String[] guess2 = new String[7];  //new string array which represents the correct word answers
	{

		guess2[0] = ("pen");  //first correct word
		guess2[1] = ("own");  //second correct word
		guess2[2] = ("owe");  //third correct word
		guess2[3] = ("how");  //fourth correct word
		guess2[4] = ("open");  //fifth correct word
		guess2[5] = ("when");  //sixth correct word
		guess2[6] = ("phone");  //mystery word
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Level2 frame = new Level2();
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
	public Level2() {  //beginning of level 2

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblLevel = new JLabel("LEVEL 2");
		lblLevel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblLevel.setBounds(305, 6, 162, 16);
		contentPane.add(lblLevel);

		JTextArea txtrThereAre = new JTextArea();
		txtrThereAre.setText(
				"There are 7 words that you can create \nusing these letters:  \nW\nP\nE\nO\nH\nN\n3 LETTERS: 4 words 4 LETTERS: 2 words \n5 LETTERS: Mystery Word\n\n");
		txtrThereAre.setBounds(6, 9, 248, 163);
		contentPane.add(txtrThereAre);

		JLabel lblWhatWordCan = new JLabel("What word can you create?");
		lblWhatWordCan.setBounds(266, 51, 178, 16);
		contentPane.add(lblWhatWordCan);

		txtAnswer = new JTextField();
		txtAnswer.setColumns(10);
		txtAnswer.setBounds(305, 79, 117, 26);
		contentPane.add(txtAnswer);

		JLabel lblWord = new JLabel("");
		lblWord.setBounds(6, 204, 61, 16);
		contentPane.add(lblWord);

		JLabel lblWord2 = new JLabel("");
		lblWord2.setBounds(79, 204, 61, 16);
		contentPane.add(lblWord2);

		JLabel lblWord3 = new JLabel("");
		lblWord3.setBounds(152, 204, 61, 16);
		contentPane.add(lblWord3);

		JLabel lblWord4 = new JLabel("");
		lblWord4.setBounds(229, 204, 61, 16);
		contentPane.add(lblWord4);

		JLabel lblWord5 = new JLabel("");
		lblWord5.setBounds(301, 204, 61, 16);
		contentPane.add(lblWord5);

		JLabel lblWord6 = new JLabel("");
		lblWord6.setBounds(383, 204, 61, 16);
		contentPane.add(lblWord6);

		JLabel lblMystery = new JLabel("MYSTERY WORD:");
		lblMystery.setBounds(132, 232, 230, 16);
		contentPane.add(lblMystery);

		JLabel lblScore = new JLabel("Score: 1");
		lblScore.setBounds(6, 260, 126, 16);
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

				if (score == 6480) {  //if the score is equal to 6480
					if (JOptionPane.showOptionDialog(null, "You have completed level 2!  Move on to level 3?", "LEVEL COMPLETED", JOptionPane.YES_NO_OPTION, 0, null, null, e)
							== JOptionPane.YES_OPTION) {
					Level2 lvl2 = new Level2();  //creates a new Level 2 form
					lvl2.dispose(); //closes the second level form
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.setVisible(true);  //lets the new Level 3 form be visible to the viewer
				
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
				
				}  //end of if statement
				
			}  //end of actionlistener

		});
		btnWord1.setBounds(6, 174, 61, 29);
		contentPane.add(btnWord1);

		JButton btnWord2 = new JButton("#2");
		btnWord2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener

				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[1])) {   //if the guess is equal to the second word in the array
					lblWord2.setText(guess2[1]);  //the label of the second word changes to the word in array
					score = Math.multiplyExact(score, 3);  //the score is equal to the score multiplied by 3
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 3

					btnWord2.setEnabled(false);  //disables the second button
				}  //end of if statement

				if (score == 6480) {  //if the score is equal to 6480
					if (JOptionPane.showOptionDialog(null, "You have completed level 2!  Move on to level 3?", "LEVEL COMPLETED", JOptionPane.YES_NO_OPTION, 0, null, null, e)
							== JOptionPane.YES_OPTION) {
					Level2 lvl2 = new Level2();  //creates a new Level 2 form
					lvl2.dispose(); //closes the second level form
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.setVisible(true);  //lets the new Level 3 form be visible to the viewer
				
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
				
				}  //end of if statement
				
			}  //end of actionlistener
		});
		btnWord2.setBounds(79, 174, 61, 29);
		contentPane.add(btnWord2);

		JButton btnWord3 = new JButton("#3");
		btnWord3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[2])) {   //if the guess is equal to the third word in the array
					lblWord3.setText(guess2[2]);  //the label of the third word changes to the word in array
					score = Math.multiplyExact(score, 3);  //the score is equal to the score multiplied by 3
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 3

					btnWord3.setEnabled(false);  //disables the third button
				}  //end of if statement

				if (score == 6480) {  //if the score is equal to 6480
					if (JOptionPane.showOptionDialog(null, "You have completed level 2!  Move on to level 3?", "LEVEL COMPLETED", JOptionPane.YES_NO_OPTION, 0, null, null, e)
							== JOptionPane.YES_OPTION);
					Level2 lvl2 = new Level2();  //creates a new Level 2 form
					lvl2.dispose(); //closes the second level form
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.setVisible(true);  //lets the new Level 3 form be visible to the viewer
				
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open

			}  //end of actionlistener
		});
		btnWord3.setBounds(152, 174, 61, 29);
		contentPane.add(btnWord3);

		JButton btnWord4 = new JButton("#4");
		btnWord4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[3])) {   //if the guess is equal to the fourth word in the array
					lblWord4.setText(guess2[3]);  //the label of the fourth word changes to the word in array
					score = Math.multiplyExact(score, 3);  //the score is equal to the score multiplied by 3
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 3

					btnWord4.setEnabled(false);  //disables the fourth button
				}  //end of if statement

				if (score == 6480) {  //if the score is equal to 6480
					if (JOptionPane.showOptionDialog(null, "You have completed level 2!  Move on to level 3?", "LEVEL COMPLETED", JOptionPane.YES_NO_OPTION, 0, null, null, e)
							== JOptionPane.YES_OPTION) {
					Level2 lvl2 = new Level2();  //creates a new Level 2 form
					lvl2.dispose(); //closes the second level form
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.setVisible(true);  //lets the new Level 3 form be visible to the viewer
				
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
				
				}  //end of if statement
				
			}  //end of actionlistener
		});
		btnWord4.setBounds(229, 174, 61, 29);
		contentPane.add(btnWord4);

		JButton btnWord5 = new JButton("#5");
		btnWord5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[4])) {   //if the guess is equal to the fifth word in the array
					lblWord5.setText(guess2[4]);  //the label of the fifth word changes to the word in array
					score = Math.multiplyExact(score, 4);  //the score is equal to the score multiplied by 4
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 4

					btnWord5.setEnabled(false);  //disables the fifth button
				}  //end of if statement

				if (score == 6480) {  //if the score is equal to 6480
					if (JOptionPane.showOptionDialog(null, "You have completed level 2!  Move on to level 3?", "LEVEL COMPLETED", JOptionPane.YES_NO_OPTION, 0, null, null, e)
							== JOptionPane.YES_OPTION) {
					Level2 lvl2 = new Level2();  //creates a new Level 2 form
					lvl2.dispose(); //closes the second level form
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.setVisible(true);  //lets the new Level 3 form be visible to the viewer
				
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
				
				}  //end of if statement
				
			}  //end of actionlistener
		});
		btnWord5.setBounds(301, 174, 61, 29);
		contentPane.add(btnWord5);

		JButton btnWord6 = new JButton("#6");
		btnWord6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[5])) {   //if the guess is equal to the sixth word in the array
					lblWord6.setText(guess2[5]);  //the label of the sixth word changes to the word in array
					score = Math.multiplyExact(score, 4);  //the score is equal to the score multiplied by 4
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 4

					btnWord6.setEnabled(false);  //disables the sixth button
				}  //end of if statement

				if (score == 6480) {  //if the score is equal to 6480
					if (JOptionPane.showOptionDialog(null, "You have completed level 2!  Move on to level 3?", "LEVEL COMPLETED", JOptionPane.YES_NO_OPTION, 0, null, null, e)
							== JOptionPane.YES_OPTION) {
					Level2 lvl2 = new Level2();  //creates a new Level 2 form
					lvl2.dispose(); //closes the second level form
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.setVisible(true);  //lets the new Level 3 form be visible to the viewer
				
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
				
				}  //end of if statement
				
			}  //end of actionlistener
		});
		btnWord6.setBounds(383, 174, 61, 29);
		contentPane.add(btnWord6);

		JButton btnMystery = new JButton("MYSTERY");
		btnMystery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[6])) {   //if the guess is equal to the mystery word in the array
					lblMystery.setText("MYSTERY: " + guess2[6]);  //the label of the mystery word changes to the word in array
					score = Math.multiplyExact(score, 5);  //the score is equal to the score multiplied by 5
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 5

					btnMystery.setEnabled(false);  //disables the mystery button
				}  //end of if statement

				if (score == 6480) {  //if the score is equal to 6480
					if (JOptionPane.showOptionDialog(null, "You have completed level 2!  Move on to level 3?", "LEVEL COMPLETED", JOptionPane.YES_NO_OPTION, 0, null, null, e)
							== JOptionPane.YES_OPTION) {
					Level2 lvl2 = new Level2();  //creates a new Level 2 form
					lvl2.dispose(); //closes the second level form
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.setVisible(true);  //lets the new Level 3 form be visible to the viewer
				
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
				
				}  //end of if statement
				
			}
		});
		btnMystery.setBounds(79, 255, 81, 29);
		contentPane.add(btnMystery);
		
		JButton btnGoBackTo = new JButton("GO BACK TO MAIN MENU");
		btnGoBackTo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Level2 lvl = new Level2();  //creates a new level 2 form
				lvl.dispose();  //disposes that level 2 form
				WordScapesAssignment.frame.setVisible(true);  //makes the Word Scapes Assignment main page visible to the user
			}
		});
		btnGoBackTo.setBounds(206, 255, 191, 29);
		contentPane.add(btnGoBackTo);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (JOptionPane.showOptionDialog(null, "Are you sure you want to exit??", "EXIT", JOptionPane.YES_NO_OPTION, 0, null, null, e)
						== JOptionPane.YES_OPTION)
								System.exit(0);}  //If exit button is selected, then there will be option to exit the program.  If clicked yes, then program will close
			
		});
		btnNewButton.setBounds(389, 255, 55, 29);
		contentPane.add(btnNewButton);

	}  //end of level2

}  //end of class