import java.util.Scanner;

public class Exponents {

	public static void main(String[] args) {

		// Initialize
		Scanner scan = new Scanner(System.in);
		String vCont = "y";

		// Title Line
		System.out.println("Learn your squares and cubes!");
		System.out.println();

		// Loop for Continue Prompt
		do {
			scan.reset();
			System.out.println("Please enter an integer: ");
			int vNum = scan.nextInt();

			// Use StringBuilder to format the output line
			int vSquare = (vNum * vNum);
			String vSquareS = String.valueOf(vSquare);
			int vSquareL = vSquareS.length();
			int vCube = (vNum * vNum * vNum);
			String vCubeS = String.valueOf(vCube);
			int vCubeL = vCubeS.length();
					
			StringBuilder vDisplay = new StringBuilder("                    ");
			vDisplay.insert(0, vNum);
			vDisplay.insert(9, vSquare);
			vDisplay.insert(19, vCube);
			
			System.out.println("Number     Squared    Cubed   ");
			System.out.println("======     =======    =====   ");
			System.out.println(vDisplay);
			//System.out.println(vNum + "       " + (vNum * vNum) + "    " + (vNum * vNum * vNum));

			scan.reset();
			System.out.println();
			System.out.println("Do you want to continue? (y/n)");
			vCont = scan.next();
			
		} while (vCont.equalsIgnoreCase("y"));

		// Clean up
		scan.close();
	} // main

} // class
