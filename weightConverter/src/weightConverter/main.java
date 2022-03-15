package weightConverter;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import List.weightOnMarsList;
import java.math.RoundingMode;
import java.math.BigDecimal;

public class main {
	public static void main (String args[])
	{
		//input and declaring classes and list
		double weight,MarsWeight,marsweight;
		Scanner input = new Scanner(System.in);
		humanWeight humanweight = new humanWeight();
		
		
		
		//input
		System.out.println("For excrcise 7: Enter the weight you want to convert");
		weight = input.nextDouble();
		
		//convert weight on earth to weight on mars
		MarsWeight=humanweight.marsWeight(weight);
		
		//use only 2 decimal points
		BigDecimal bd2 = new BigDecimal(MarsWeight).setScale(2,RoundingMode.HALF_UP);
		marsweight = bd2.doubleValue();
		
		
		//print the output message together with the weight on mars
		System.out.println("(Excercise 7)The weight on mars is " + marsweight );
		
		//declaration of weight list for excercise 8
		System.out.println("(Excercise 8)Enter the value in the list.");
		weightOnMarsList list = new weightOnMarsList();
		double[] weightList = list.returnArray();
		
		for (int i=0;i<weightList.length;i++)
		{
			System.out.println(i+1+". Data:" +weightList[i]);
			
		}
	}
}
