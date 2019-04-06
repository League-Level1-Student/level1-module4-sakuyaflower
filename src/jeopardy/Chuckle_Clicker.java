package jeopardy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Chuckle_Clicker implements ActionListener {
	 JButton JB = new JButton("Joke");
		JButton Jb = new JButton("PunchLine");
		JFrame JF = new JFrame();
		JPanel JP = new JPanel();
	public static void main(String[] args) {
	Chuckle_Clicker c = new Chuckle_Clicker();
	c.makeButtons();


	}
 void makeButtons() {
	
	JF.setTitle("Chuckle Clicker");
	JF.setVisible(true);
	JF.add(JP);
	JP.add(Jb);
	JP.add(JB);
	JF.pack();
JB.addActionListener(this); 
 Jb.addActionListener(this);

 }
 public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	 JButton pressed = (JButton) e.getSource();

	 if(JB == pressed) {
		 JOptionPane.showMessageDialog(null,"The joke is, we all have the same punchline");
	 }
	 else if(Jb == pressed) {
	JOptionPane.showMessageDialog(null, "But in the end I wanna thank you. Because you make me that much stronger.");
}
 }

}
