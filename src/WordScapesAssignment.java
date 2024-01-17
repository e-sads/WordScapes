//Word Scapes Assignment
//By: Ethan Sadler
//This is the title and main page of the game, says the title of the game and level select, along with a link to the instructions page


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;



public class WordScapesAssignment {  //start of class

	public static JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WordScapesAssignment window = new WordScapesAssignment();
					WordScapesAssignment.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WordScapesAssignment() {  //start of WordScapesAssignment
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.LIGHT_GRAY);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnLevel = new JButton("Level 1");
		btnLevel.setBounds(16, 129, 117, 29);
		btnLevel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener
				
			frame.dispose();    //closes the Word Scapes Assignment frame
			Level1 lvl = new Level1();  //creates a new Level 1 form
			lvl.setVisible(true);  //lets the new Level 1 form be visible to the viewer
				
			}  //end of actionlistener
		});
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(btnLevel);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO WORDSCAPES!!!");
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBounds(87, 6, 318, 40);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblSelectWhichLevel = new JLabel("Select which level you want to do:");
		lblSelectWhichLevel.setBounds(121, 46, 213, 16);
		frame.getContentPane().add(lblSelectWhichLevel);
		
		JButton btnLevel_1 = new JButton("Level 2");
		btnLevel_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener
				
				frame.dispose();    //closes the Word Scapes Assignment frame
				Level2 lvl = new Level2();  //creates a new Level 2 form
				lvl.setVisible(true);  //lets the new Level 2 form be visible to the viewer
			}  //end of actionlistener
		});
		btnLevel_1.setBounds(161, 129, 117, 29);
		frame.getContentPane().add(btnLevel_1);
		
		JButton btnLevel_2 = new JButton("Level 3");
		btnLevel_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener
				
				frame.dispose();    //closes the Word Scapes Assignment frame
				Level3 lvl = new Level3();  //creates a new Level 3 form
				lvl.setVisible(true);  //lets the new Level 3 form be visible to the viewer
			}  //end of actionlistener
		});
		btnLevel_2.setBounds(304, 129, 117, 29);
		frame.getContentPane().add(btnLevel_2);
		
		JButton btnInstructions = new JButton("Instructions:");
		btnInstructions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener
				
				frame.dispose();    //closes the Word Scapes Assignment frame
				Instructions inst = new Instructions();  //creates a new Instructions form
				inst.setVisible(true);  //lets the new Instructions form be visible to the viewer
			}  //end of actionlistener
		});
		btnInstructions.setBounds(161, 243, 117, 29);
		frame.getContentPane().add(btnInstructions);
		
		JButton btnNewButton = new JButton("Select Random Level:");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {  //start of actionlistener
				
				int random = 1 + (int) (Math.random() * 3);  //generates random number between 1 and 3 (1 = level 1, 2 = level 2, 3 = level 3
				
			for (int i = 0;i<=5;i++) {  //for loop to make it repeat 5 times before opening one (making sure not the same levels everytime)
				switch (random) {  //switch statement for random number
				case (1):  //if the random number is 1
					frame.dispose();    //closes the Word Scapes Assignment frame
				Level1 lvl = new Level1();  //creates a new Level 1 form
				lvl.setVisible(true);  //lets the new Level 1 form be visible to the viewer
				break;
				case (2):  //if the random number is 2
					frame.dispose();    //closes the Word Scapes Assignment frame
				Level2 lvl2 = new Level2();  //creates a new Level 2 form
				lvl2.setVisible(true);  //lets the new Level 2 form be visible to the viewer
				break;
				case(3):  //if the random number is 3
					frame.dispose();    //closes the Word Scapes Assignment frame
				Level3 lvl3 = new Level3();  //creates a new Level 3 form
				lvl3.setVisible(true);  //lets the new Level 3 form be visible to the viewer
				break;
				}  //end of for loop
				
				}  //end of switch statement
				
				
				
			}  //end of actionlistener
		});
		btnNewButton.setBounds(133, 74, 199, 29);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("/Users/ethansadler/Downloads/Word Scapes.png"));
		label.setBounds(0, 0, 450, 278);
		frame.getContentPane().add(label);
		
	
	

	}  //end of initialize
	
	
		
		
		
		
	
}  //end of class
