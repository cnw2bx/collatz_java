//cnw2bx		Cameron Woodward
import java.util.*;


public class Collatz {
	
	public static int collatz(int i) {
		int counter = 0;
		while(i > 1) {
			if(i%2 == 1) {
				i = (3*i) + 1;
				counter++;
				System.out.println(i);
			}
			
			else {
				i = i/2;
				counter++;
				System.out.println(i);
			}
		
		}
		return counter;
	}

	public static void main(String[] args) {
		System.out.println("Enter a number to Collatz: ");
		Scanner input = new Scanner(System.in);
		int j = input.nextInt();
		input.close();
		System.out.println("It took " + collatz(j) + " steps to reach 1.");

	}

}
