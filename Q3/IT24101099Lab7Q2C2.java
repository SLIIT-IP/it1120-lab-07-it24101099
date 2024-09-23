import java.util.Scanner;
public class IT24101099Lab7Q2C2{
	public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char paymentMode;
        double billAmount, discount = 0, finalAmount;

        // Start processing multiple customers
        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);

            // Input the total bill amount
            System.out.print("Enter total bill amount: ");
            billAmount = input.nextDouble();

            // Input and validate the mode of payment
            System.out.print("Enter mode of payment (C for cash, O for other): ");
            paymentMode = input.next().charAt(0);

            // Convert input to uppercase for consistency in validation
            paymentMode = Character.toUpperCase(paymentMode);

            // Process the payment mode
            if (paymentMode == 'C') {
                // Cash payment, apply a 5% discount
                discount = billAmount * 0.05;
                finalAmount = billAmount - discount;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + finalAmount);
            } else if (paymentMode == 'O') {
                // Other payment, no discount
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + billAmount);
            } else {
                // Invalid payment mode
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();
        }
    }
}
	