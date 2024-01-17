//Word Scapes Assignment
//By: Ethan Sadler
//This is the third and final level of the game, which gives you 8 letters to choose from to create 10 words including the mystery word

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Level3 extends JFrame {  //start of level3

	
	private JPanel contentPane;
	private JTextField txtAnswer;

	String guess;  //new string to represent word inputted by user
	int score = 1;  //new integer to represent score

	String[] guess2 = new String[11];  //new string array which represents the correct word answers
	{

		guess2[0] = ("rim");  //first word
		guess2[1] = ("rug");  //second word
		guess2[2] = ("ram");  //third word
		guess2[3] = ("arm");  //fourth word
		guess2[4] = ("gum");  //fifth word
		guess2[5] = ("game");  //sixth word
		guess2[6] = ("mega");  //seventh word
		guess2[7] = ("argue");  //eighth word
		guess2[8] = ("image");  //ninth word
		guess2[9] = ("mirage"); //tenth word
		guess2[10] = ("quagmire");  //mystery word
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Level3 frame = new Level3();
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
	public Level3() {  //beginning of level3
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("Level 3");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(120, 3, 234, 16);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		contentPane.add(lblNewLabel);

		JTextArea txtrThereAre = new JTextArea();
		txtrThereAre.setBounds(17, 34, 274, 99);
		txtrThereAre.setText(
				"There are 8 words that you can create \nusing these letters:  \nM, E, I, G, U, A, R, Q\n3 LETTERS: 5 words 4 LETTERS: 2 words\n 5 LETTERS: 2 words 6 LETTERS: 1 word \n 8 LETTERS: MYSTERY\n\n");
		contentPane.add(txtrThereAre);

		JLabel lblWhatWordCan = new JLabel("What word can you create?");
		lblWhatWordCan.setForeground(Color.WHITE);
		lblWhatWordCan.setBounds(278, 6, 166, 16);
		contentPane.add(lblWhatWordCan);

		txtAnswer = new JTextField();
		txtAnswer.setBounds(303, 29, 117, 26);
		txtAnswer.setColumns(10);
		contentPane.add(txtAnswer);

		

		JLabel lblWord = new JLabel("");
		lblWord.setBounds(18, 158, 61, 16);
		contentPane.add(lblWord);

		JLabel lblWord2 = new JLabel("");
		lblWord2.setBounds(104, 158, 61, 16);
		contentPane.add(lblWord2);

		JLabel lblWord3 = new JLabel("");
		lblWord3.setBounds(184, 158, 61, 16);
		contentPane.add(lblWord3);

		JLabel lblWord4 = new JLabel("");
		lblWord4.setBounds(260, 158, 61, 16);
		contentPane.add(lblWord4);

		JLabel lblWord5 = new JLabel("");
		lblWord5.setBounds(337, 158, 61, 16);
		contentPane.add(lblWord5);

		JLabel lblWord6 = new JLabel("");
		lblWord6.setBounds(17, 208, 61, 16);
		contentPane.add(lblWord6);

		JLabel lblWord7 = new JLabel("");
		lblWord7.setBounds(104, 208, 61, 16);
		contentPane.add(lblWord7);

		JLabel lblWord8 = new JLabel("");
		lblWord8.setBounds(184, 208, 61, 16);
		contentPane.add(lblWord8);

		JLabel lblWord9 = new JLabel("");
		lblWord9.setBounds(260, 208, 61, 16);
		contentPane.add(lblWord9);

		JLabel lblWord10 = new JLabel("");
		lblWord10.setBounds(337, 208, 61, 16);
		contentPane.add(lblWord10);

		JLabel lblMystery = new JLabel("MYSTERY WORD:");
		lblMystery.setForeground(Color.WHITE);
		lblMystery.setBounds(104, 230, 187, 16);
		contentPane.add(lblMystery);

		JLabel lblScore = new JLabel("Score:");
		lblScore.setFont(new Font("Lucida Grande", Font.BOLD, 13));
		lblScore.setForeground(Color.WHITE);
		lblScore.setBounds(0, 256, 159, 16);
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

				if (score == 4665600) {  //if the score is equal to 4665600
					if (JOptionPane.showOptionDialog(null, "You have completed level 3!  YOU HAVE BEAT THE GAME!", "GAME COMPLETED", JOptionPane.OK_OPTION, 0, null, null, e)
							== JOptionPane.OK_OPTION) {  //if the ok option is pressed
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.dispose(); //closes the third level form
					Congratulations congrat = new Congratulations();  //creates a new congratulations form
					congrat.setVisible(true);  //makes the congratulations form visible
				
					}  //end of if statement
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
			}  //end of actionlistener
		});
		btnWord1.setBounds(17, 132, 55, 29);
		contentPane.add(btnWord1);

		JButton btnWord2 = new JButton("#2");
		btnWord2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //start of actionlistener
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[1])) {   //if the guess is equal to the second word in the array
					lblWord2.setText(guess2[1]);  //the label of the second word changes to the word in array
					score = Math.multiplyExact(score, 3);  //the score is equal to the score multiplied by 3
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 3

					btnWord2.setEnabled(false);  //disables the second button
				}  //end of if statement

				if (score == 4665600) {  //if the score is equal to 4665600
					if (JOptionPane.showOptionDialog(null, "You have completed level 3!  YOU HAVE BEAT THE GAME!", "GAME COMPLETED", JOptionPane.OK_OPTION, 0, null, null, e)
							== JOptionPane.OK_OPTION) {  //if the ok option is pressed
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.dispose(); //closes the third level form
					Congratulations congrat = new Congratulations();  //creates a new congratulations form
					congrat.setVisible(true);  //makes the congratulations form visible
				
					} //end of if statement
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
			}  //end of actionlistener
		});
		btnWord2.setBounds(104, 132, 55, 29);
		contentPane.add(btnWord2);

		JButton btnWord3 = new JButton("#3");
		btnWord3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //start of actionlistener
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[2])) {   //if the guess is equal to the third word in the array
					lblWord3.setText(guess2[2]);  //the label of the third word changes to the word in array
					score = Math.multiplyExact(score, 3);  //the score is equal to the score multiplied by 3
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 3

					btnWord3.setEnabled(false);  //disables the third button
				}  //end of if statement

				if (score == 4665600) {  //if the score is equal to 4665600
					if (JOptionPane.showOptionDialog(null, "You have completed level 3!  YOU HAVE BEAT THE GAME!", "GAME COMPLETED", JOptionPane.OK_OPTION, 0, null, null, e)
							== JOptionPane.OK_OPTION) {  //if the ok option is pressed
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.dispose(); //closes the third level form
					Congratulations congrat = new Congratulations();  //creates a new congratulations form
					congrat.setVisible(true);  //makes the congratulations form visible
				
					} //end of if statement
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
			}  //end of actionlistener
		});
		btnWord3.setBounds(184, 132, 55, 29);
		contentPane.add(btnWord3);

		JButton btnWord4 = new JButton("#4");
		btnWord4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //start of actionlistener
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[3])) {   //if the guess is equal to the fourth word in the array
					lblWord4.setText(guess2[3]);  //the label of the fourth word changes to the word in array
					score = Math.multiplyExact(score, 3);  //the score is equal to the score multiplied by 3
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 3

					btnWord4.setEnabled(false);  //disables the fourth button
				}  //end of if statement

				if (score == 4665600) {  //if the score is equal to 4665600
					if (JOptionPane.showOptionDialog(null, "You have completed level 3!  YOU HAVE BEAT THE GAME!", "GAME COMPLETED", JOptionPane.OK_OPTION, 0, null, null, e)
							== JOptionPane.OK_OPTION) {  //if the ok option is pressed
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.dispose(); //closes the third level form
					Congratulations congrat = new Congratulations();  //creates a new congratulations form
					congrat.setVisible(true);  //makes the congratulations form visible
				
					} //end of if statement
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
			}  //end of actionlistener
		});
		btnWord4.setBounds(266, 132, 55, 29);
		contentPane.add(btnWord4);

		JButton btnWord5 = new JButton("#5");
		btnWord5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //start of actionlistener
				
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[4])) {   //if the guess is equal to the fifth word in the array
					lblWord5.setText(guess2[4]);  //the label of the fifth word changes to the word in array
					score = Math.multiplyExact(score, 3);  //the score is equal to the score multiplied by 3
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 3

					btnWord5.setEnabled(false);  //disables the fifth button
				}  //end of if statement

				if (score == 4665600) {  //if the score is equal to 4665600
					if (JOptionPane.showOptionDialog(null, "You have completed level 3!  YOU HAVE BEAT THE GAME!", "GAME COMPLETED", JOptionPane.OK_OPTION, 0, null, null, e)
							== JOptionPane.OK_OPTION) { //if the ok option is pressed
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.dispose(); //closes the third level form
					Congratulations congrat = new Congratulations();  //creates a new congratulations form
					congrat.setVisible(true);  //makes the congratulations form visible
					} //end of if statement
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
			}  //end of actionlistener
		});
		btnWord5.setBounds(347, 132, 55, 29);
		contentPane.add(btnWord5);

		JButton btnWord6 = new JButton("#6");
		btnWord6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //start of actionlistener
				
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[5])) {   //if the guess is equal to the sixth word in the array
					lblWord6.setText(guess2[5]);  //the label of the sixth word changes to the word in array
					score = Math.multiplyExact(score, 4);  //the score is equal to the score multiplied by 4
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 4

					btnWord6.setEnabled(false);  //disables the sixth button
				}  //end of if statement

				if (score == 4665600) {  //if the score is equal to 4665600
					if (JOptionPane.showOptionDialog(null, "You have completed level 3!  YOU HAVE BEAT THE GAME!", "GAME COMPLETED", JOptionPane.OK_OPTION, 0, null, null, e)
							== JOptionPane.OK_OPTION) { //if the ok option is pressed
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.dispose(); //closes the third level form
					Congratulations congrat = new Congratulations();  //creates a new congratulations form
					congrat.setVisible(true);  //makes the congratulations form visible
				
					} //end of if statement
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
			}  //end of actionlistener
		});
		btnWord6.setBounds(17, 182, 55, 29);
		contentPane.add(btnWord6);

		JButton btnWord7 = new JButton("#7");
		btnWord7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //start of actionlistener
				
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[6])) {   //if the guess is equal to the seventh word in the array
					lblWord7.setText(guess2[6]);  //the label of the seventh word changes to the word in array
					score = Math.multiplyExact(score, 4);  //the score is equal to the score multiplied by 4
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 4

					btnWord7.setEnabled(false);  //disables the seventh button
				}  //end of if statement

				if (score == 4665600) {  //if the score is equal to 4665600
					if (JOptionPane.showOptionDialog(null, "You have completed level 3!  YOU HAVE BEAT THE GAME!", "GAME COMPLETED", JOptionPane.OK_OPTION, 0, null, null, e)
							== JOptionPane.OK_OPTION) {  //if the ok option is pressed
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.dispose(); //closes the third level form
					Congratulations congrat = new Congratulations();  //creates a new congratulations form
					congrat.setVisible(true);  //makes the congratulations form visible
				
					} //end of if statement
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
			}  //end of actionlistener
		});
		btnWord7.setBounds(104, 182, 55, 29);
		contentPane.add(btnWord7);

		JButton btnWord8 = new JButton("#8");
		btnWord8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //start of actionlistener
				
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[7])) {   //if the guess is equal to the eighth word in the array
					lblWord8.setText(guess2[7]);  //the label of the eighth word changes to the word in array
					score = Math.multiplyExact(score, 5);  //the score is equal to the score multiplied by 5
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 5

					btnWord8.setEnabled(false);  //disables the eighth button
				}  //end of if statement

				if (score == 4665600) {  //if the score is equal to 4665600
					if (JOptionPane.showOptionDialog(null, "You have completed level 3!  YOU HAVE BEAT THE GAME!", "GAME COMPLETED", JOptionPane.OK_OPTION, 0, null, null, e)
							== JOptionPane.OK_OPTION) {  //if the ok option is pressed
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.dispose(); //closes the third level form
					Congratulations congrat = new Congratulations();  //creates a new congratulations form
					congrat.setVisible(true);  //makes the congratulations form visible
				
					} //end of if statement
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
			}  //end of actionlistener
		});
		btnWord8.setBounds(184, 182, 55, 29);
		contentPane.add(btnWord8);

		JButton btnWord9 = new JButton("#9");
		btnWord9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //start of actionlistener
				
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[8])) {   //if the guess is equal to the ninth word in the array
					lblWord9.setText(guess2[8]);  //the label of the ninth word changes to the word in array
					score = Math.multiplyExact(score, 5);  //the score is equal to the score multiplied by 5
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 5

					btnWord9.setEnabled(false);  //disables the ninth button
				}  //end of if statement

				if (score == 4665600) {  //if the score is equal to 4665600
					if (JOptionPane.showOptionDialog(null, "You have completed level 3!  YOU HAVE BEAT THE GAME!", "GAME COMPLETED", JOptionPane.OK_OPTION, 0, null, null, e)
							== JOptionPane.OK_OPTION) {  //if the ok option is pressed
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.dispose(); //closes the third level form
					Congratulations congrat = new Congratulations();  //creates a new congratulations form
					congrat.setVisible(true);  //makes the congratulations form visible
					} //end of if statement
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
			}  //end of actionlistener
			
		});
		btnWord9.setBounds(266, 182, 55, 29);
		contentPane.add(btnWord9);

		JButton btnWord10 = new JButton("#10");
		btnWord10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //start of actionlistener
				
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[9])) {   //if the guess is equal to the tenth word in the array
					lblWord10.setText(guess2[9]);  //the label of the tenth word changes to the word in array
					score = Math.multiplyExact(score, 6);  //the score is equal to the score multiplied by 6
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 6

					btnWord10.setEnabled(false);  //disables the tenth button
				}  //end of if statement

				if (score == 4665600) {  //if the score is equal to 4665600
					if (JOptionPane.showOptionDialog(null, "You have completed level 3!  YOU HAVE BEAT THE GAME!", "GAME COMPLETED", JOptionPane.OK_OPTION, 0, null, null, e)
							== JOptionPane.OK_OPTION) {  //if the ok option is pressed
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.dispose(); //closes the third level form
					Congratulations congrat = new Congratulations();  //creates a new congratulations form
					congrat.setVisible(true);  //makes the congratulations form visible
					} //end of if statement
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
			}  //end of actionlistener
		});
		btnWord10.setBounds(347, 182, 55, 29);
		contentPane.add(btnWord10);

		JButton btnMystery = new JButton("MYSTERY");
		btnMystery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //start of actionlistener
				 
				guess = txtAnswer.getText();  //shows the guess represents word inputted by user

				if (guess.equalsIgnoreCase(guess2[10])) {   //if the guess is equal to the mystery word in the array
					lblMystery.setText("MYSTERY: " + guess2[10]);  //the label of the mystery word changes to the word in array
					score = Math.multiplyExact(score, 8);  //the score is equal to the score multiplied by 8
					lblScore.setText("Score: " + score);  //change the score label to be the original score multiplied by 8

					btnMystery.setEnabled(false);  //disables the eighth button
				}  //end of if statement

				if (score == 4665600) {  //if the score is equal to 4665600
					if (JOptionPane.showOptionDialog(null, "You have completed level 3!  YOU HAVE BEAT THE GAME!", "GAME COMPLETED", JOptionPane.OK_OPTION, 0, null, null, e)
							== JOptionPane.OK_OPTION) {  //if the ok option is pressed
					Level3 lvl3 = new Level3();  //creates a new Level 3 form
					lvl3.dispose(); //closes the third level form
					Congratulations congrat = new Congratulations();  //creates a new congratulations form
					congrat.setVisible(true);  //makes the congratulations form visible
					}  // end of if statement
				
				}  //If exit button is selected, then there will be option to move on to the next level.  If clicked yes, then program will close and the next level will open
			}  //end of actionlistener
		});
		btnMystery.setBounds(104, 251, 92, 29);
		contentPane.add(btnMystery);
		
		JButton btnNewButton = new JButton("EXIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //start of actionlistener
				
				if (JOptionPane.showOptionDialog(null, "Are you sure you want to exit??", "EXIT", JOptionPane.YES_NO_OPTION, 0, null, null, e)
						== JOptionPane.YES_OPTION)
								System.exit(0);}  //If exit button is selected, then there will be option to exit the program.  If clicked yes, then program will close
			
		});
		btnNewButton.setBounds(381, 251, 73, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("GO BACK TO MAIN MENU");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { //start of actionlistener
				
				Level3 lvl = new Level3();
				lvl.dispose();
				WordScapesAssignment.frame.setVisible(true);
			} //end of actionlistener
		});
		btnNewButton_1.setBounds(193, 251, 187, 29);
		contentPane.add(btnNewButton_1);
	}  //end of level3

}  //end of class