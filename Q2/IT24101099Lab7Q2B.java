import java.util.Scanner;
public class IT24101099Lab7Q2B{
	public static void main(String[]args){
	int i, j;

	for(j=1; j<=5; j++){//outerloop
		System.out.print(j + "-");
			for(i=1; i<=j; i++){//inner loop
				System.out.print("*");
			}
			System.out.print("\n");
	}
	}
}

	
	