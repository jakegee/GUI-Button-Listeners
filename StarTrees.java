import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/** 
 * @author Jacob Smith
 * Exercise that instead of extending Trees.java, I've chosen to create the stars utilising
 * the same code from Trees
 */

public class StarTrees extends JPanel {
	
	int starVertices = 11; // 11 points per star
	int stepSize = 4; // 4 actions taken between each star
	
	int[] starPointsx = new int[11]; // 11 point array
	int[] starPointsy = new int[11]; 
	int[] drawPointsx = new int[11]; // 11 point array
	int[] drawPointsy = new int[11];
	
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
		
		int x = xTrees[1]; // x coordinate
		int y = yTrees[1]-60 ; // y coordinate
		int scale = 10; // Adjustable scale size for star
		
		for (int i = 0; i < 1; i++) { // For loops to create the coordinates for dawing the lines and points
			for (int j = 0; j < 11; j++) {

				/**
				 * Calculation that's used in order to create the locations of each star vertice
				 */
				starPointsx[j]	= x+(int)Math.round(scale*Math.sin(2*j*Math.PI/starVertices));
				starPointsy[j]	= y+6*scale+(int)Math.round(scale*Math.cos(2*j*Math.PI/starVertices));
			}
			
			for (int j = 0; j < starVertices; j++) {
				drawPointsx[j] = starPointsx[(j*stepSize)%starVertices]; // Draws the stars and ensure 
																		 // no common divisor is used
				drawPointsy[j] = starPointsy[(j*stepSize)%starVertices];

			}
				
			g.setColor(Color.BLACK);
			g.drawPolygon(drawPointsx, drawPointsy, starVertices);
			
		}
		
		int[] xTrees2 = {80, 110, 140}; // Creates a 2nd tree using the same method explained above
		int[] yTrees2 = {120, 50, 120};
		
		g.setColor(new Color(35,190,35));
		g.fillPolygon(xTrees2,yTrees2,scaleTrees);
		g.setColor(new Color(210,140,120));
		g.fillRect(105, 120, 10, 10);
		
		x = xTrees2[1]; // x
		y = yTrees2[1]-60 ; // 
		scale = 10; // Adjustable scale size for star
		
		for (int i = 0; i < 1; i++) { 
			
			for (int j = 0; j < 11; j++) {
				starPointsx[j]	= x+(int)Math.round(scale*Math.sin(2*j*Math.PI/starVertices)); 
				starPointsy[j]	= y+6*scale+(int)Math.round(scale*Math.cos(2*j*Math.PI/starVertices));
			}
			
			for (int j = 0; j < starVertices; j++) {
				drawPointsx[j] = starPointsx[(j*stepSize)%starVertices]; // Draws the stars and ensure 
																		 // no common divisor is used
				drawPointsy[j] = starPointsy[(j*stepSize)%starVertices];

			}
				
			g.setColor(Color.BLACK);
			g.drawPolygon(drawPointsx, drawPointsy, starVertices);
			
		}
		
		int[] xTrees3 = {140, 170, 200}; // Creates 3rd tree
		int[] yTrees3 = {120, 50, 120};
		
		g.setColor(new Color(35,190,35));
		g.fillPolygon(xTrees3,yTrees3,scaleTrees);
		g.setColor(new Color(210,140,120));
		g.fillRect(165, 120, 10, 10);
		
		x = xTrees3[1]; // x
		y = yTrees3[1]-60; // 
		scale = 10; // Adjustable scale size for star
		
		for (int i = 0; i < 1; i++) { 
			
			for (int j = 0; j < 11; j++) {
				starPointsx[j]	= x+(int)Math.round(scale*Math.sin(2*j*Math.PI/starVertices)); 
				starPointsy[j]	= y+6*scale+(int)Math.round(scale*Math.cos(2*j*Math.PI/starVertices));
			}
			
			for (int j = 0; j < starVertices; j++) {
				drawPointsx[j] = starPointsx[(j*stepSize)%starVertices]; // Draws the stars and ensure 
																		 // no common divisor is used
				drawPointsy[j] = starPointsy[(j*stepSize)%starVertices];

			}
				
			g.setColor(Color.BLACK);
			g.drawPolygon(drawPointsx, drawPointsy, starVertices);
			
		}
		
		int[] xTrees4 = {200, 230, 260}; // Creates 4th tree at a different position
		int[] yTrees4 = {420, 350, 420};
		
		g.setColor(new Color(35,190,35));
		g.fillPolygon(xTrees4,yTrees4,scaleTrees);
		g.setColor(new Color(210,140,120));
		g.fillRect(225, 420, 10, 10);
		
		x = xTrees4[1]; // x
		y = yTrees4[1]-60 ; // 
		scale = 10; // Adjustable scale size for star
		
		for (int i = 0; i < 1; i++) { 
			
			for (int j = 0; j < 11; j++) {
				starPointsx[j]	= x+(int)Math.round(scale*Math.sin(2*j*Math.PI/starVertices)); 
				starPointsy[j]	= y+6*scale+(int)Math.round(scale*Math.cos(2*j*Math.PI/starVertices));
			}
			
			for (int j = 0; j < starVertices; j++) {
				drawPointsx[j] = starPointsx[(j*stepSize)%starVertices]; // Draws the stars and ensure 
																		 // no common divisor is used
				drawPointsy[j] = starPointsy[(j*stepSize)%starVertices];

			}
				
			g.setColor(Color.BLACK);
			g.drawPolygon(drawPointsx, drawPointsy, starVertices);
			
		}
		
		int[] xTrees5 = {360, 390, 420}; // Creates 5th tree
		int[] yTrees5 = {120, 50, 120};
		
		g.setColor(new Color(35,190,35));
		g.fillPolygon(xTrees5,yTrees5,scaleTrees);
		g.setColor(new Color(210,140,120));
		g.fillRect(385, 120, 10, 10);
		
		x = xTrees5[1]; // x
		y = yTrees5[1]-60; // 
		scale = 10; // Adjustable scale size for star
		
		for (int i = 0; i < 1; i++) { 
			
			for (int j = 0; j < 11; j++) {
				starPointsx[j]	= x+(int)Math.round(scale*Math.sin(2*j*Math.PI/starVertices)); 
				starPointsy[j]	=  y+6*scale+(int)Math.round(scale*Math.cos(2*j*Math.PI/starVertices));
			}
			
			for (int j = 0; j < starVertices; j++) {
				drawPointsx[j] = starPointsx[(j*stepSize)%starVertices]; // Draws the stars and ensure 
																		 // no common divisor is used
				drawPointsy[j] = starPointsy[(j*stepSize)%starVertices];

			}
				
			g.setColor(Color.BLACK);
			g.drawPolygon(drawPointsx, drawPointsy, starVertices);
			
		}
	
	}
	
	public static void main(String[] args) {
		javax.swing.JFrame frame = new JFrame(); // Frame built to display the trees
		frame.getContentPane().add(new StarTrees()); // Adds the graphic above to the frame
		frame.setSize(500,500); // Sets a pixel size
		frame.setVisible(true); // Makes it display
		frame.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE); // Closes the GUI when exited
	}
}
