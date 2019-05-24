import java.util.*;
public class praccC {
	
	public static void main (String[] args) {
		Random m = new Random();
		System.out.println("Give me your favorite smallest integer?");
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		// Moved gathering int y to after asking for largest.
		System.out.println("Give me your favorite largest integer?");
		int y = in.nextInt();
		// Edited the calculation of the random number
		System.out.println("Now selecting a random number from " + x + " to " + y + " : " + ( (int) (Math.random() * ( Math.max( x,  y ) - Math.min( x,  y ) ) + Math.min( x,y ) ) ) ); 
	}

}