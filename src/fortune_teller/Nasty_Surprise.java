package fortune_teller;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Nasty_Surprise implements ActionListener {
	JButton JB = new JButton();
	JButton Jb = new JButton(); 
	public static void main(String[] args) {
	Nasty_Surprise NS = new Nasty_Surprise();
	NS.setup();
}

private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
void setup() {
	
	JFrame JF = new JFrame();
	JPanel JP = new JPanel();
	JF.setVisible(true);
	JF.setSize(250, 250);	
	JB.setText("Trick");
	Jb.setText("Treat");
	JP.add(JB);
	JP.add(Jb);
	JF.add(JP);
	JF.pack();	
	JB.addActionListener(this);
	Jb.addActionListener(this);
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	JButton pressed = (JButton) e.getSource();
	
	if(Jb == pressed) {
		showPictureFromTheInternet("https://media.tenor.com/images/7dce6b8a8a705efa26db43985c5f014c/tenor.gif");
		
	}
}
}
