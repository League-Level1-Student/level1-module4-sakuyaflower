package simon_says;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.awt.Component;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.io.IOException;

public class SimonSays extends KeyAdapter {
	int s = 0;
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private boolean simonSays = false;
	Date timeAtStart;

	// Complete steps 1 - 7 before you test
	// 1. Declare a JFrame variable
JFrame JF = new JFrame();
	public void run() {
		// 2. Add the four images that match keyboard keys like this:
images.put(new Integer(KeyEvent.VK_UP), "up.jpg");
images.put(new Integer(KeyEvent.VK_DOWN), "down.jpg");
images.put(new Integer(KeyEvent. VK_LEFT), "left.jpg");
images.put(new Integer(KeyEvent. VK_RIGHT), "right.jpg");
JOptionPane.showMessageDialog(null, "Press the matching key when Simon says. Otherwise press a different key");
showImage();
// 3. Use a JOptionPane to tell the user the rules: "Press the matching
		// key when
		// 'Simon says' otherwise press a different key"

		// 4. Call the showImage method to show an image

	}
public static void main(String[] args) {
	SimonSays ss = new SimonSays();
	ss.run();
}
	
public void keyPressed(KeyEvent e) {
		// 15. Make a points variable to track the score.


		// 16. If the keyCode matches the imageIndex and "Simon says"
if(e.getKeyCode() == imageIndex) {
	s++;
	speak("You are correct!");
	
}
if(e.getKeyCode() != imageIndex) {
	s++;
	speak("YAY! U are correct.");
}
tries++;
if(tries > 10) {
	JOptionPane.showMessageDialog(null, "Your score is" + s);
	System.exit(0);
}
		// 17. Increase the value of score
	
		// 18. Use the speak method to tell the user they were correct

		// 19. If the keyCode doesn't match the imageIndex and "Simon didn't
		// say..."

		// 20. Increase the value of score

		// 21. Use the speak method to tell the user they were correct

		// 22. Increment tries by 1

		// 25. If tries is greater than 9 (or however many you want)...

		// 26. Tell the user their score

		// 27. Exit the program

		// 23. Dispose of the frame
JF.dispose();
		// 24. Call the showImage method to show a new image
showImage();
	}
	private void showImage() {
		// 5. Initialize your frame to a new JFrame()
JFrame JF = new JFrame();
		// 6. Set the frame to visible
JF.setVisible(true);
		// 7. Uncomment the following line to add a random image to your frame
		// frame.add(getNextRandomImage());
JF.add(getNextRandomImage());
		// 8. Set the name of your frame
JF.setName("Simon Says");
		// 9. Pack the frame
JF.pack();
		// 10. Set the defaultCloseOperation of your from to
		// JFrame.EXIT_ON_CLOSE
 JF.setDefaultCloseOperation(JF.EXIT_ON_CLOSE);
		// 11. Add a key listener to the frame
JF.addKeyListener(this);
		// 12. Create a new instance of Random
Random r = new Random();
int t = r.nextInt(2); 

		// 13. Use the Random and the speak method to either say
		// "Simon says press this key" or "Press this key"
if(t == 0) {
	speak("Simon says press this key.");
	simonSays = true;
}
if(t == 1 ) {
	speak("Press this key.");
	simonSays = false;
}
		// 14. Above, set the value of simonSays to true/false appropriately

	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

/*
 * BONUS! Add a timer : ~~~ where the code starts running ~~~ timeAtStart =
 * newDate();
 *
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 */
