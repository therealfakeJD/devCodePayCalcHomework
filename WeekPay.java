import java.util.Scanner;
import java.text.DecimalFormat;



public class WeekPay {
	
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		
		double hours;
		double pay;
		double overtime;
		double extra;

		
		System.out.println("Number of hours worked?");
		hours = in.nextDouble();
		

		

		System.out.println("Rate of pay per hour?");
		pay = in.nextDouble();

		double weekPay = hours * pay;
	    extra = (hours - 40) * (pay * 1.5);
	    overtime = (40 * pay) + extra;

		DecimalFormat df = new DecimalFormat();
		df.setMinimumFractionDigits(2);
		df.setMaximumFractionDigits(2);


		//System.out.printf("Your weekly pay is $" + df.format(weekPay));
		if (hours <= 40) {
			System.out.println(" You worked a regular week this week");
			System.out.println(" Your weekly pay is $" + df.format(weekPay));
		} else {
			weekPay = 40 * pay;
			System.out.println(" You worked overtime this week");
			System.out.println(" Your weekly pay is $" + df.format(weekPay));
			System.out.println(" Your overtime pay is $" + df.format(extra));
			System.out.println(" Your total pay with overtime is $" + df.format(overtime));
		}



	}



}
