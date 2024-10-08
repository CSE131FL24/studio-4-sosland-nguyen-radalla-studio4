package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
	String shapeType = in.next();
		
		//set pen color
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		
		//StdDraw.setPenColor (new Color(red, green, blue));
		
		boolean isFilled = in.nextBoolean();
		
		
		
			double x = in.nextDouble(); 
			double y = in.nextDouble();
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			
			if (isFilled) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			} else { 
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
			
		}
		//StdDraw.setPenColor(255, 0, 0);
		//StdDraw.filledRectangle(7.2, 8.3, 5.5, 10.0);
		
	}

