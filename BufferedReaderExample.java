import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.util.Arrays;

//@author: Ashika Ganesh
public class BufferedReaderExample {

	public static void printMatrix(double[][] m) {
		try {
			int rows = m.length;
			int columns = m[0].length;
			String str = "|\t";

			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					str += m[i][j] + "\t";
				}

				System.out.println(str + "|");
				str = "|\t";
			}

		} catch (Exception e) {
			System.out.println("Matrix is empty!!");
		}
	}

	public static void printArray(double matrix[][]) {
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {


		// uncomment this code to try the user input
		// ----------------------------------
		Scanner Scanscan = new Scanner(System. in );
		System.out.print("Input filename path such as /Users/NAME/documents/testing.txt ==> ");
		String filename = Scanscan.nextLine();
		File inputFile = new File(filename);
		System.out.println("The 2D Double matrix is now going to be filled =====> ");

		try {
			Scanner scan = new Scanner(inputFile);
			System.out.println("This is your file: " + filename);

			try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

				String sCurrentLine;
				int cols = 500;
				int rows = 500;
				double[][] finalArray = new double[cols][rows];

				while ((sCurrentLine = br.readLine()) != null) {
					sCurrentLine.charAt(0);

					int firstVal = Integer.parseInt("" + sCurrentLine.charAt(0));

					List < Integer > numbers = new ArrayList < Integer > ();
					List < Double > numbers1 = new ArrayList < Double > ();

					for (String number: sCurrentLine.substring(8, sCurrentLine.length() - 1).split("\\s+")) {
						double q = Double.parseDouble(number);
						int v = (int) q;

						numbers.add(v);
						numbers1.add(q);
					}

					int secondVal = numbers.get(0);
					finalArray[firstVal][secondVal] = numbers1.get(1);
				}
				System.out.println();
				double[][] array = new double[500][500];
				System.out.println(Arrays.deepToString(array));

				System.out.println("The 2D Double matrix is fully filled!!!! ");

			} catch (IOException e) {
				e.printStackTrace();
			}


		} catch (IOException e) {
			System.out.println("That Doesn't seem right... Try again?");
		}



		// Uncomment to try with manual file entry
		// -------------------------
		// 	try (BufferedReader br = new BufferedReader(new FileReader("/Users/AshikaGanesh/documents/testing.txt")))
		// 	{

		// 		String sCurrentLine;
		// 			int cols = 500;
		// 		int rows = 500;
		// 		double[][] finalArray = new double[cols][rows];

		// 		while ((sCurrentLine = br.readLine()) != null) {
		// 			sCurrentLine.charAt(0);

		// 			int firstVal = Integer.parseInt("" + sCurrentLine.charAt(0));

		// 			List <Integer> numbers = new ArrayList <Integer>();
		// 			List <Double> numbers1 = new ArrayList <Double>();

		// 			for (String number : sCurrentLine.substring(8, sCurrentLine.length()-1).split ("\\s+")) {
		// 			    double q = Double.parseDouble(number);
		// 			    int v = (int) q;

		// 			    numbers.add(v);
		// 			    numbers1.add(q);
		// 			}

		// 			int secondVal = numbers.get(0);
		// 			finalArray[firstVal][secondVal] = numbers1.get(1);
		// 		}


		// 	} catch (IOException e) {
		// 		e.printStackTrace();
		// 	} 


	}
}