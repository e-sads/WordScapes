//Word Scapes Assignment
//By: Ethan Sadler
//This is the instructions page for the game, where you can read how to play the game

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Instructions extends JFrame {  //start of instructions

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {  //start of main
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Instructions frame = new Instructions();
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
	public Instructions() {  //beginning of instructions
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInstructions = new JLabel("INSTRUCTIONS");
		lblInstructions.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblInstructions.setBounds(149, 6, 170, 16);
		contentPane.add(lblInstructions);
		
		JTextArea txtrTheGameWill = new JTextArea();
		txtrTheGameWill.setText("The game will give you a select amount of words and tells you how \nmany letters are in the word.  You will be given a select amount of \nletters (4-8 letters) and you will have to create a select amount of \nwords with these letters.  You will be given the letters and will \nhave to type in the words.  If you guess the word then it will be \nshown on the screen.  Once you find all the words, you will move \non to the next level.  There will be 3 levels, the last one being the \nmost difficult.\n");
		txtrTheGameWill.setBounds(16, 26, 428, 130);
		contentPane.add(txtrTheGameWill);
		
		JButton btnBackToMain = new JButton("Back to Main Menu");
		btnBackToMain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener
				
				Instructions inst = new Instructions();  //new instructions page created
				inst.dispose();  //disposed that instructions page
				WordScapesAssignment.frame.setVisible(true);  //opens the Word Scapes Assignment page and makes it visible to user
			}
		});
		btnBackToMain.setBounds(-11, 243, 170, 29);
		contentPane.add(btnBackToMain);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Type in words", "Guess Different Words", "Keep track of Score", "Find out when you win"}));
		comboBox.setToolTipText("");
		comboBox.setBounds(115, 157, 170, 27);
		contentPane.add(comboBox);
		
		JLabel lblHowTo = new JLabel("How to...");
		lblHowTo.setFont(new Font("Lucida Grande", Font.ITALIC, 16));
		lblHowTo.setBounds(26, 160, 85, 16);
		contentPane.add(lblHowTo);
		
		JTextArea txtAnswer = new JTextArea();
		txtAnswer.setBounds(171, 182, 279, 96);
		contentPane.add(txtAnswer);
		
		JButton btnFindOut = new JButton("Find out!!");
		btnFindOut.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener
				String type = (String) comboBox.getSelectedItem();  //variable for whatever is inside of the combobox
				
				if (type == "Type in words") {  //if the option chose is type in words
				if (JOptionPane.showOptionDialog(null, "Are you sure you want to choose the type in words option?", "Are you sure??", JOptionPane.OK_OPTION, 0, null, null, e) 
						== JOptionPane.YES_OPTION) {  //if the yes option is selected in the confirm window
					txtAnswer.setText("you type in words by going into the \ntextbox on the question, and then typing \nin your guess for the word.");  //explains how to type in words
					
				} //end of JOptionPane statement
				} else if (type == "Guess Different Words") {  //if the option chose is guess different words
					if (JOptionPane.showOptionDialog(null, "Are you sure you want to choose the guess different words option?", "Are you sure??", JOptionPane.OK_OPTION, 0, null, null, e) 
							== JOptionPane.YES_OPTION) { //if the yes option is selected in the confirm window
					txtAnswer.setText("You can guess different words by clicking\n the buttons with the # markers to the left \nof it with the word guessed inside of it, \nthen if you get the guess correct, you will \nget points and the word will show \nunderneath that button.");  //explains how to guess different words
					
				} //end of JOptionPane statement
				} else if (type == "Keep track of Score") {  //if the option chose is keep track of score
					if (JOptionPane.showOptionDialog(null, "Are you sure you want to choose the keep track of score option?", "Are you sure??", JOptionPane.OK_OPTION, 0, null, null, e)  
							== JOptionPane.YES_OPTION) {  //if the yes option is selected in the confirm window
						txtAnswer.setText("You can keep track of score since the score \nalways multiplies by the amount of letters \nin the word.  For example, in the word that, \nthe score will multiply by 4 since there is 4 \nletters in that.");  //explains how the score is kept track of
						
					} //end of JOptionPane statement
				} else if (type == "Find out when you win") {  //if the option chose is to find out when you win
					if (JOptionPane.showOptionDialog(null, "Are you sure you want to choose the find out when you win option?", "Are you sure??", JOptionPane.OK_OPTION, 0, null, null, e)  
							== JOptionPane.YES_OPTION) {  //if the yes option is selected in the confirm window
						txtAnswer.setText("You can find out when you win when you \ntype in all of the words during that level.  \nFor example, if there is 5 words in the level, \nyou have to guess all 5 of the words in \norder to complete that level.");  //explains how you can find out when you win
						
					} //end of JOptionPane statement
				}  //end of if else statement
			}  //end of actionlistener
		});
		btnFindOut.setBounds(297, 156, 117, 29);
		contentPane.add(btnFindOut);
		
	
	}  //end of instructions
}  //end of class