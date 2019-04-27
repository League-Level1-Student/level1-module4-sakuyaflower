package extra;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements MouseListener {
	static JFrame JF = new JFrame("Simple Calculator");
	static JPanel JP = new JPanel();
	static JButton JB = new JButton("Add");
	static JButton Jb = new JButton("Subtract");
	static JButton Jbu = new JButton("Multiply");
	static JButton JBU = new JButton("Divide");
	static JLabel JL = new JLabel();
	static JTextField JTF = new JTextField();
	static JTextField JTf = new JTextField();
	Dimension d = new Dimension(200,40);
	Dimension di = new Dimension(100,40);

public static void main(String[] args) {
	
	Calculator c = new Calculator();
	c.setup();

	}
	void setup() {
		JF.setVisible(true);
		JF.add(JP);
		JP.add(JB);
		JP.add(JBU);
		JP.add(Jb);
		JP.add(Jbu);
		JB.setPreferredSize(di);
		Jb.setPreferredSize(di);
		JBU.setPreferredSize(di);
		Jbu.setPreferredSize(di);
		JTF.setPreferredSize(d);
		JTf.setPreferredSize(d);
		JP.add(JTF);
		JP.add(JTf);
		JB.addMouseListener(this);
		JBU.addMouseListener(this);
		Jb.addMouseListener(this);
		Jbu.addMouseListener(this);
		JP.add(JL);
		JF.pack();
	}
	
	
void add() {	
String Number1 = JTF.getText();
String Number2 = JTf.getText();
int one = Integer.parseInt(Number1); 
int two = Integer.parseInt(Number2);
int sum = one + two;
JL.setText(sum + "");
}
void multiply() {	
	String Number1 = JTF.getText();
	String Number2 = JTf.getText();
	int one = Integer.parseInt(Number1); 
	int two = Integer.parseInt(Number2);
	int sum = one * two;
	JL.setText(sum + "");
}
void subtract() {
	String Number1 = JTF.getText();
	String Number2 = JTf.getText();
	int one = Integer.parseInt(Number1); 
	int two = Integer.parseInt(Number2);
	int sum = one - two;
	JL.setText(sum + "");
}
void divide() {
	String Number1 = JTF.getText();
	String Number2 = JTf.getText();
	int one = Integer.parseInt(Number1); 
	int two = Integer.parseInt(Number2);
	int sum = one / two;
	JL.setText(sum + "");
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	JButton clicked = (JButton) e.getSource();
	if(clicked == JB) {
		add();
	}
	if(clicked == JBU) {
		divide();
	}
	if(clicked == Jb) {
		subtract();
	}
	if(clicked == Jbu) {
		multiply();
	}
JF.pack();
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
