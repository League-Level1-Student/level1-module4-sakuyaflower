package extra;

import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.auth.AccessToken;

public class Get_the_Latest_Tweet implements MouseListener {
	JFrame JF = new JFrame("The Amazing Tweet Retriever");
	JPanel JP = new JPanel();
	JButton JB = new JButton("Search the Twitterverse");
	JLabel JL = new JLabel();
	JTextField JTF = new JTextField();
	Dimension d = new Dimension(200, 40);
	Dimension r = new Dimension(300, 40);

	public static void main(String[] args) {
		Get_the_Latest_Tweet tweet = new Get_the_Latest_Tweet();
		tweet.setup();

	}

	void setup() {
		JF.setVisible(true);
		JF.add(JP);
		JP.add(JTF);
		JP.add(JB);
		JP.add(JL);
		JTF.setPreferredSize(r);
		JB.setPreferredSize(d);
		JB.addMouseListener(this);
		JF.pack();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton) e.getSource();

		if (clicked == JB) {
			System.out.println("Tweet, Tweet");
			String reply = JTF.getText();
			String r = getLatestTweet(reply);
			JL.setText(r);
			JF.pack();
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

	private String getLatestTweet(String searchingFor) {

		Twitter twitter = new TwitterFactory().getInstance();

		AccessToken accessToken = new AccessToken("2453751158-IVD2VGZsvwZiRKxNe3Gs2lMjg30nvSkV1xSuPFf",
				"vBa5PjKfuMTK1LLBG51nCUI9r5d6Ph5cAHrS73spg6Nvu");

		twitter.setOAuthConsumer("YqeZdD2hYxOKv4QOkmp0i2djN", "6XUB1r8KXBvd8Pk9HHW3NgphMxHvHWBLAr5TihnckMU0ttyGST");

		twitter.setOAuthAccessToken(accessToken);

		Query query = new Query(searchingFor);
		try {
			QueryResult result = twitter.search(query);
			return result.getTweets().get(0).getText();
		} catch (Exception e) {
			System.err.print(e.getMessage());
			return "What the heck is that?";
		}
	}

}
