import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 * 
 * @author Jacob Smith
 * Exercise that creates and displays Christmas trees using the paint component method
 */

public class Trees extends JPanel {
	
	public void paintComponent(Graphics g) { // Paint component method used to illustrate a graphic
		super.paintComponent(g); 
		int[] xTrees = {20, 50, 80}; // Positions 3 points at 3 positions on an x axis
		int[] yTrees = {120, 50, 120}; // Positions 3 points at 3 positions based on the y axis 
									   // that corresponds with the x axis
		int scaleTrees = 3;	 // 3 points for a 3 sided triangle
		
		g.setColor(new Color(35,190,35)); // Using RGB, a nice color green is chosen
		g.fillPolygon(xTrees,yTrees,scaleTrees); // Creates a filled in with color polygon using the points
												 // position above
		g.setColor(new Color(210,140,120)); // Using RGB to choose a nice brown for the tree trunk
		g.fillRect(45, 120, 10, 10); // Places a filled in with color rectangle for the tree trunk
									 // at the specified x, y coordinates and then a width and height
		
		int[] xTrees2 = {80, 110, 140}; // Creates a 2nd tree using the same method explained above
		int[] yTrees2 = {120, 50, 120};
		
		g.setColor(new Color(35,190,35));
		g.fillPolygon(xTrees2,yTrees2,scaleTrees);
		g.setColor(new Color(210,140,120));
		g.fillRect(105, 120, 10, 10);
		
		int[] xTrees3 = {140, 170, 200}; // Creates 3rd tree
		int[] yTrees3 = {120, 50, 120};
		
		g.setColor(new Color(35,190,35));
		g.fillPolygon(xTrees3,yTrees3,scaleTrees);
		g.setColor(new Color(210,140,120));
		g.fillRect(165, 120, 10, 10);
		
		int[] xTrees4 = {200, 230, 260}; // Creates 4th tree at a different position
		int[] yTrees4 = {420, 350, 420};
		
		g.setColor(new Color(35,190,35));
		g.fillPolygon(xTrees4,yTrees4,scaleTrees);
		g.setColor(new Color(210,140,120));
		g.fillRect(225, 420, 10, 10);
		
		int[] xTrees5 = {360, 390, 420}; // Creates 5th tree
		int[] yTrees5 = {120, 50, 120};
		
		g.setColor(new Color(35,190,35));
		g.fillPolygon(xTrees5,yTrees5,scaleTrees);
		g.setColor(new Color(210,140,120));
		g.fillRect(385, 120, 10, 10);
	}
	
	
	
	public static void main(String[] args) {
		javax.swing.JFrame frame = new JFrame(); // Frame built to display the trees
		frame.getContentPane().add(new Trees()); // Adds the graphic above to the frame
		frame.setSize(500,500); // Sets a pixel size
		frame.setVisible(true); // Makes it display
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE); // Closes the GUI when exited
	}
}
