import java.util.Scanner; 


/**
 * @author jesus
 *We create the public class for the code
 *Import Scanner utility
 *Initiate new int seqLength, will be used later on
 *Create scanner object for input
 *Print out desired comment
 *Make scanner object equal to Fib length
 *Create an array of seqLength
 *Open for loop
 *Print out Statement
 */
public class FibbSeqUpdated {

	public static void main(String[] args) {
		int seqLength;

		Scanner userLength = new Scanner(System.in);
		
		System.out.println("Enter Desired Length: ");
		seqLength = userLength.nextInt();
		
		int[] num = new int [seqLength];
		
		num[0] = 0;
		num[1] = 1;
		
		for (int i = 2; i < seqLength; i++) {
			num[i] = num[i - 1] + num[i - 2];
			System.out.println(num[i] + " ");
		}
		System.out.println("When the desired Fibonacci length is " + seqLength + 
					" these are the results!");
	}

}
