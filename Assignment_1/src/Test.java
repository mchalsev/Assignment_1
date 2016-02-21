/*
 * author: Maria Chalsev
 * Course: BIF812
 * Instructor: Marek Laskowski
 * Date of submission: 02.19.16
 * Declaration: I declare that the attached assignment is wholly my own work
 * in accordance with Seneca Academic Policy.  No part of this
 * assignment has been copied manually or electronically from any
 * other source (including web sites) or distributed to other students. 
 * Maria Chalsev 035231141 
 */
public class Test {

	public static void main(String[] args) {
		//instantiate (create a new instance of) the MiniGenBankSeq class. 
		MiniGenBankSeq test = new MiniGenBankSeq();
		//run new instance through testConcatenate method using the filepath and concatenation times input. Returns time it took to concatenate in nanoseconds. 
		long nanoseconds1 = test.testConcatenate("C:\\Users\\MariaChalsev\\Desktop\\Java\\Assignment1\\Testdata\\1k.txt", 100000);
		long nanoseconds2 = test.testConcatenate("C:\\Users\\MariaChalsev\\Desktop\\Java\\Assignment1\\Testdata\\10k.txt", 10000);
		long nanoseconds3 = test.testConcatenate("C:\\Users\\MariaChalsev\\Desktop\\Java\\Assignment1\\Testdata\\100k.txt", 1000);
		long nanoseconds4 = test.testConcatenate("C:\\Users\\MariaChalsev\\Desktop\\Java\\Assignment1\\Testdata\\1M.txt", 100);
		long nanoseconds5 = test.testConcatenate("C:\\Users\\MariaChalsev\\Desktop\\Java\\Assignment1\\Testdata\\10M.txt", 10);

		//print out results of testConcatenate for each file&times combination, converted into seconds.  
		System.out.println("\nResults of using standard concatenation method: \n" 
		+ "1k concatenation 100000 times took:\t " + nanoseconds1 / (double)1000000000 + " seconds\n" 
		+ "10k concatenation 10000 times took:\t " + nanoseconds2 / (double)1000000000 + " seconds\n" 
		+ "100k concatenation 1000 times took:\t " + nanoseconds3 / (double)1000000000 +  " seconds\n" 
		+ "1M concatenation 100 times took:\t " + nanoseconds4 / (double)1000000000 + " seconds\n"  
		+ "10M concatenation 10 times took:\t " + nanoseconds5 / (double)1000000000 + " seconds\n");

	}
}