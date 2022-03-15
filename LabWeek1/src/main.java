import java.util.Scanner;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class main {
	public static void main (String args[])
	{
		//input and declaring classes
		double weight,MarsWeight,marsweight;
		Scanner input = new Scanner(System.in);
		humanWeight humanweight = new humanWeight();
		
		System.out.println("Weight on earth:");
		weight = input.nextDouble();
		
		//convert weight on earth to weight on mars
		MarsWeight=humanweight.marsWeight(weight);
		
		//use only 2 decimal points
		BigDecimal bd2 = new BigDecimal(MarsWeight).setScale(2,RoundingMode.HALF_UP);
		marsweight = bd2.doubleValue();
		
		//print the output message together with the weight on mars
		System.out.println("The weight on mars is " + marsweight );
	}
}
