package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		
		// Flag of Dagestan
		
		//set canvas size
		StdDraw.setXscale(0,1);
		StdDraw.setYscale(0,1);
		
		//draw green rectangle (top stripe)
		StdDraw.setPenColor(0, 146, 63);
		StdDraw.filledRectangle(0.5, 5.0 / 6.0, 0.5, 1.0 / 6.0);
		
		//draw blue rectangle (middle stripe)
		StdDraw.setPenColor(0, 57, 166);
		StdDraw.filledRectangle(0.5, 3.0 / 6.0, 0.5, 1.0 / 6.0);
		
		//draw red rectangle (bottom stripe)
		StdDraw.setPenColor(216, 30, 5);
		StdDraw.filledRectangle(0.5, 1.0 / 6.0, 0.5, 1.0 / 6.0);
		
		
		
		
	}
}