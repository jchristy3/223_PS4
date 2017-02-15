import java.util.Random;
import java.util.Scanner;




public class ShellTest {

	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    System.out.println("Enter an array size: ");
	    int n = input.nextInt();
		Double[] a = new Double[n];
		for(int i = 0; i < n; i++){
			a[i] = randomFill() * n;
		}
	    Shell.sort(a);
	    int compsize = Shell.compares / n;
	    System.out.println("Compares/size: " + compsize);
	}

	public static double randomFill(){

	    Random rand = new Random();
	    double randomNum = rand.nextDouble();
	    return randomNum;
	    }
}