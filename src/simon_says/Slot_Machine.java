package simon_says;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.util.Random;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Slot_Machine implements ActionListener {
	JFrame JF = new JFrame("Slot Machine");
	JPanel JP = new JPanel();
	JLabel JL = new JLabel();
	JLabel Jl = new JLabel();
	JLabel jl = new JLabel();
	JButton JB = new JButton("SPIN");

	public static void main(String[] args) throws MalformedURLException {
		Slot_Machine sl_m = new Slot_Machine();
		sl_m.test();
		
	}

	void test() throws MalformedURLException {
		JF.setVisible(true);
		JF.add(JP);
		JP.add(JB);
		JF.setSize(2500, 2500);
		JL = createLabelImage("download.jpg");
		Jl = createLabelImage("download-1.jpg");
		jl = createLabelImage("download-2.jpg");
		JP.add(JL);
		JP.add(Jl);
		JP.add(jl);
		JP.add(JB);
		JB.addActionListener(this);
		JF.pack();
	}

	private static JLabel loadImageFromComputer(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	private JLabel createLabelImage(String fileName) throws MalformedURLException {
		java.net.URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton pressed = (JButton) e.getSource();
		System.out.println("test");
		JF.remove(JP);
		JP = new JPanel();
		JF.add(JP);
		JL = spin();
		Jl = spin();
		jl = spin();
		JP.add(JL);
		JP.add(Jl);
		JP.add(jl);
		JP.add(JB);
		JF.pack();
	}

	JLabel spin() {
		JLabel i = new JLabel();
		
		Random r = new Random();
		int r1 = r.nextInt(3);
		if (r1 == 0) {
			try {
				i = createLabelImage("download.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} else if (r1 == 1) {
			try {
				i = createLabelImage("download-1.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		} else if (r1 == 2) {
			try {
				i = createLabelImage("download-2.jpg");
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
		}
return i;
	}

}
