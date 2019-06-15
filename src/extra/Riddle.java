package extra;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Riddle implements ActionListener {
	static JFrame JF = new JFrame("Riddle");
	static JPanel JP = new JPanel();
	static JTextField JTF = new JTextField();
	static JButton JB = new JButton("Sumit");
	static JButton Jb = new JButton("Hint");
	static JLabel Jl = new JLabel("what is black and white and red/read all over?");
	Dimension d = new Dimension(70, 20);

	public static void main(String[] args) {
		Riddle r = new Riddle();
		r.setup();
	}

	void setup() {
		JF.setVisible(true);
		JF.add(JP);
		JP.add(JTF);
		JTF.setPreferredSize(d);
		JP.add(JB);
		JB.addActionListener(this);
		JP.add(Jb);
		Jb.addActionListener(this);
		JP.add(Jl);
		JF.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton) e.getSource();
		if(JB==clicked) {
			
		}
	}
}
