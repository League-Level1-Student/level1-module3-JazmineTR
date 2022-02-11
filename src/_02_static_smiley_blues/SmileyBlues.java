package _02_static_smiley_blues;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SmileyBlues {
	void start() {
		// 1. Make a new JFrame and set it to be visible
 JFrame pan = new JFrame();
 pan.setVisible(true);
 pan.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2. Set your frame's default close operation to JFrame.EXIT_ON_CLOSE
JPanel nel = new JPanel();
		// 3. Make a new JPanel
pan.add(nel);
		// 4. Add your panel to your frame

		// 8. DO THIS LAST: 
		// Set the Smiley class's color variable to Smiley.YELLOW (NOT a specific smiley object's!)
		// Using a specific object for a static variable works, but is not usually recommended.
		// Run it again; are your Smileys all yellow now? Also try changing them to red or green!
Smiley.setColor(Smiley.BLUE);
		// 5. Make three Smiley objects and add them to your panel
Smiley simile = new Smiley();
nel.add(simile);
Smiley simple = new Smiley();
nel.add(simple);
Smiley smell = new Smiley();
nel.add(smell);
		// 6. Pack your frame
pan.pack();
		// 7. RUN THE PROGRAM and make sure you see three blue Smileys!
	}
}
