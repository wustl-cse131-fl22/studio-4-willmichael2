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
		
		double x;
		double y;
		double halfWidth;
		double halfHeight;
		String shapeType = in.next();
		int redComponent =in.nextInt();
		int greenComponent=in.nextInt();
		int blueComponent=in.nextInt();
		boolean isFilled=in.nextBoolean();
		double parameterOne=in.nextDouble();
		double parameterTwo=in.nextDouble();
		double parameterThree=in.nextDouble();

		System.out.println(shapeType);
		System.out.println(parameterThree);
		StdDraw.setPenColor(redComponent,greenComponent,blueComponent);
		
		if(shapeType.equals("rectangle")) {
			if(isFilled==true) {
				StdDraw.filledRectangle(parameterOne, parameterTwo, parameterThree, parameterThree);
			}
			else {
				StdDraw.rectangle(parameterOne, parameterTwo, parameterThree, parameterThree);
			}
		}
		
		if(shapeType.equals("ellipse")) {
			if(isFilled==true) {
				StdDraw.filledEllipse(parameterOne, parameterTwo, parameterThree, parameterThree);
			}
			else {
				StdDraw.ellipse(parameterOne, parameterTwo, parameterThree, parameterThree);
			}
		}
		
		if(shapeType.equals("triangle")) {
			double parameterFour=in.nextDouble();
			double parameterFive=in.nextDouble();
			double parameterSix=in.nextDouble();
			
			double[] xValues = {parameterOne, parameterThree, parameterFive};
			double[] yValues = {parameterTwo, parameterFour, parameterSix};
			if(isFilled==true) {
				StdDraw.filledPolygon(xValues,yValues);
			}
			else {
				StdDraw.filledPolygon(xValues,yValues);
			}
		}

	}
}
