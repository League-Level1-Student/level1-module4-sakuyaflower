package simon_says;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.sun.media.jfxmedia.AudioClip;

public class Whack_A_Mole implements ActionListener {
	int t = 0;
	JFrame JF = new JFrame("Whack a Button");
	JPanel JP = new JPanel();
	JLabel JL = new JLabel();
	static Date d = new Date();
	void setup() {
		JF.setVisible(true);
		JF.add(JP);
		JP.add(JL);
		JL.setVisible(true);
		JF.setPreferredSize(new Dimension(370, 300));
		makeButtons();
		JF.pack();

	}

	public static void main(String[] args) {
		Whack_A_Mole mole = new Whack_A_Mole();
		mole.setup();
	

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	void makeButtons() {
		Random r = new Random();
		int t = r.nextInt(24); 
		for (int i = 0; i < 24; i++) {
			JButton JB = new JButton();
			JP.add(JB);
			JB.addActionListener(this);
			if(t == i) {
				JB.setText("MOLE!");
			}
			
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		if(pressed.getText().equals("MOLE!")) {
			JF.dispose();
			JF= new JFrame();
			JF.setVisible(true);
			JP = new JPanel();
			JF.add(JP);
			JP.add(JL);
			makeButtons();
			JF.setPreferredSize(new Dimension(370, 300));
			
			
			
		}
		else {
			t++;
			speak("You missed");
			if(t>=5) {
				endGame(d, 10);
				
			}
			
		}
		JF.pack();
		}
	
	private void endGame(Date timeAtStart, int molesWhacked) {
	     Date timeAtEnd = new Date();
	     JOptionPane.showMessageDialog(null, "Your whack rate is "
	          + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
	          + " moles per second.");
	     System.exit(0); 
	}
	private void playSound(String fileName) {
	     java.applet.AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	     sound.play();
	}
}
