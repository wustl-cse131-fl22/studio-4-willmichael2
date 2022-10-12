package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.red);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.25);
		StdDraw.setPenColor(Color.black);
		StdDraw.setPenRadius(0.01);
		StdDraw.rectangle(0.5, 0.5, 0.4, 0.25);
		
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledRectangle(0.50, 0.45,0.3, 0.085);
		
		StdDraw.setPenColor(Color.black);
		StdDraw.rectangle(0.50, 0.45,0.3, 0.085);
		
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(0.25, .35, 0.085);
		
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(Color.black);
		StdDraw.circle(0.25, .35, 0.085);
		
		StdDraw.setPenRadius(0.001);
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(0.25, .55, 0.085);
		
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(Color.black);
		StdDraw.circle(0.25, .55, 0.085);
		
		
	}
}