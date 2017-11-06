import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Jacob Smith
 * Exercise that allows you to input a link into a text box, assign it a filename
 * then using a button to download the link into a physical file utilising
 * separate classes
 */

public class HtmlReadGui extends JPanel {

	public JButton buttonDownload; // GUI download button declared
	public JTextField tf1,tf2; // Text fields for link and filename declared	
	
	public HtmlReadGui() { // Constructor to build the GUI
		setUp();
	}
	
	private void setUp() {
			
		GridLayout layout = new GridLayout(0,1); // Assigns one column for the GUI
		
		this.tf1 = new JTextField("Please enter URL"); // Editable textbox for URLs
		tf1.setEditable(true);

		this.tf2 = new JTextField("Please enter filename"); // Editable textbox for filename
		tf2.setEditable(true);

		add(tf1); // Adds to the GUI frame
		add(tf2);
		
		this.buttonDownload = new JButton("DOWNLOAD"); // Creates the labeled Download button and adds it
		add(buttonDownload);
		
		DownloadListener listener = new DownloadListener(this); // Using an additional class to perform the download function
		buttonDownload.addActionListener(listener);
			
		
				
				

		
		setLayout(layout); // Creates the layout
	}

	public void Download(URL url){
		try{
			/**
			 * Using the buffered reader and writer function we're able to read in the text
			 * that is entered in the filename box to write that name to a new file that is 
			 * created in our java directory
			 */
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			BufferedWriter writer = new BufferedWriter(new FileWriter(tf2.getText()));
			String line;
			
			while((line = reader.readLine()) != null){
				writer.write(line);
				writer.newLine();
			}
			reader.close(); // Once the action is completed the read and writers are closed
			writer.close();
			System.out.println("Done"); // Message to show successful completion
		}
		
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception"); // Catches null argument errors and prints in the console
		}
		
		catch(IOException e) {
			System.out.println("Input/Output Exception"); // Catches input errors and prints in the console
		}
		

		catch(IllegalArgumentException e) {
			System.out.println("Illegal Argument Exception"); // Catches illegal argument errors and prints in the console
		}
	}
	
	public static void main(String[] args) {
			
		HtmlReadGui htmlgui = new HtmlReadGui();
		JFrame frame = new JFrame("Read HTML file"); // Puts a title on the frame
		frame.add(htmlgui); // Adds the above GUI to the frame
		frame.setVisible(true); // Frame can be seen
	
		frame.setSize(400, 400); // Pixel size of the frame
		frame.setLocationRelativeTo(null); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the GUI frame
	}
}