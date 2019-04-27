package extra;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Get_the_Latest_Tweet implements MouseListener {
	JFrame JF = new JFrame("The Amazing Tweet Retriever");
	JPanel JP = new JPanel();
	JButton JB = new JButton("Search the Twitterverse");
	JTextField JTF = new JTextField();
	Dimension d = new Dimension(200,40);
	Dimension r = new Dimension(300,40);
public static void main(String[] args) {
	Get_the_Latest_Tweet tweet = new Get_the_Latest_Tweet();
tweet.setup();

}
void setup() {
	JF.setVisible(true);
	JF.add(JP);
	JP.add(JTF);
	JP.add(JB);
	JTF.setPreferredSize(r);
	JB.setPreferredSize(d);
	JF.pack();
	JB.addMouseListener(this);
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	JButton clicked = (JButton) e.getSource();
	if(clicked == JB) {
System.out.println("Tweet, Tweet");
	}
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}



}





	
