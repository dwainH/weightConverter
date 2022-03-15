package List;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import weightConverter.humanWeight;


public class weightOnMarsList {
	double[] weightonMars = new double[10];
	public weightOnMarsList(){
		
		
		Scanner input = new Scanner(System.in);
		humanWeight convert = new humanWeight();
		
		for (int i=0;i<weightonMars.length;i++)
		{
			System.out.println("Enter the weight to convert:");
			double weight = input.nextDouble();
			double weightOnMars = convert.marsWeight(weight);
			
			BigDecimal bd = new BigDecimal(weightOnMars).setScale(2,RoundingMode.HALF_UP);
			double WeightOnMars = bd.doubleValue();
			weightonMars[i]=WeightOnMars;
		}
		
		
	}
	
	public double[] returnArray()
	{
		return weightonMars.clone();
	}
}