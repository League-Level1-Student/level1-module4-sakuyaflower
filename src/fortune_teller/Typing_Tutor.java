package fortune_teller;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Typing_Tutor implements KeyListener {
static JFrame JF = new JFrame("Type");
static JPanel JP = new JPanel();
static JLabel JL = new JLabel();
char currentLetter;
public static void main(String[] args) {
	Typing_Tutor tt = new Typing_Tutor();
	tt.createButtons();
}	

void createButtons() {
currentLetter = generateRandomLetter();
JF.setVisible(true);
JF.add(JP);
JL.setFont(JL.getFont().deriveFont(28.0f));
JL.setHorizontalAlignment(JL.CENTER);
JF.addKeyListener(this);
JL.setText(currentLetter +"");
JP.add(JL);
}

char generateRandomLetter() {
      Random r = new Random();
      return (char) (r.nextInt(26) + 'a');	
		
}

@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println(e.getKeyChar());
	if(e.getKeyChar() == currentLetter) {
		System.out.println("Correct :)");
		JP.setBackground(Color.green);
	}
	else {
		JP.setBackground(Color.RED);
	}
}

@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub
	currentLetter = generateRandomLetter();
	JL.setText(currentLetter +"");
}
}
