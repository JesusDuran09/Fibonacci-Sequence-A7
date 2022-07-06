import java.util.Scanner;


public class FibbSeq {

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
