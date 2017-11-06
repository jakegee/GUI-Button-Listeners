import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;

/** 
* @author Jacob Smith
* Using an additional class to perform the action on the download button
*/

public class DownloadListener implements ActionListener {

	public HtmlReadGui hrg;

 	public DownloadListener(HtmlReadGui h) { // Constructor for the download action
 		this.hrg = h; // Giving the object h
 	}
	public void actionPerformed(ActionEvent arg0) { 
		try {
			URL url = new URL(hrg.tf1.getText());  // try statement to create URL with the text
			hrg.Download(url);
			
		}
		
		catch(IOException e) {// Catches input errors and prints in the console
			System.out.println("Input/Output Exceptions");
		}
		
		catch(IllegalArgumentException e) { // Catches illegal argument errors and prints in the console
			System.out.println("Illegal Arguments Exception");
		}
	}
}