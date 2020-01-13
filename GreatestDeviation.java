import java.util.Scanner;

public class GreatestDeviation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double sum = 0;
		double mean = 0.0;
		//1 -2 4 -4 9 -6 16 -8 25 -10
		Scanner console = new Scanner(System.in);
		int count = console.nextInt();
		int[] myArry = new int[count];
		for(int i = 0;i<myArry.length; i++) {
			myArry[i] = console.nextInt();
			sum += myArry[i];
		}
		//System.out.println("sum:"+sum);
		mean = sum/myArry.length;
		double highestdff = 0.0;
		int higDiff = 0;
		for(int i = 0;i<myArry.length; i++) {
			double diff = Math.abs(mean - myArry[i]) ;
			 
			if(highestdff < diff) {
				highestdff = diff;
				higDiff = myArry[i];
			}
		}
		
		System.out.println(higDiff);
	
		
		console.close();
		
	}


}
