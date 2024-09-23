import java.util.Scanner;
public class IT24101099Lab7QA1{
	public static void main(String[]args){
	int i, noOfSub = 4;
	double total = 0, average;

	//Create an object called input to the scanner class
	Scanner input = new Scanner(System.in);

	for(i=1; i<=noOfSub; i++){
		System.out.print("Enter Subject Mark" +" "+ i + ":");
		total += input.nextDouble();
	
	}
		
	//Calculation
	average = total/4;
	System.out.println("Average is : " + average);
	

	if(average >= 75){
		System.out.println("Overall Grade is : Distinction");
	
	}
	else if(average >= 50){
		System.out.println("Overall Grade is : Creadit");
	}
	else{
		System.out.println("Overall Grade is : Fail");

	}
		
}
}		
        		