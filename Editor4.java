import java.awt.Color;

/**
 * Uses the morphing operation implemented in Runigram.java to morph an image
 * to its greyscale version.
 * The program receives two command line arguments, the first is a file name 
 * representing the PPM file, and the second an int n representing the steps 
 * taken to morph the image into its greyscale version.
 */
public class Editor4 {

	public static void main(String[] args) {
        String fileName = args[0];
        int n = Integer.parseInt(args[1]);
        Color[][] image = Runigram.read(fileName);
        Color[][] imageGS = Runigram.grayScaled(image);
        Runigram.setCanvas(image);
        Runigram.morph(image, imageGS, n);
	}
}
