import java.util.Scanner;
/**
 * Write a description of class FixeddepositNIB here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FixeddepositNIB
{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char continueCalculation = 'y';
    while (continueCalculation == 'y' || continueCalculation == 'Y') {
        System.out.print("Enter principal amount(minimum 1000): ");
        double P= input.nextDouble();
        System.out.print("Enter annual interest rate(8%-12%): ");
        double annualRate = input.nextDouble();
        System.out.print("Enter duration(maximum 5 years): "); 
        int years = input.nextInt();
        double monthlyRate = (annualRate/100)/12;
        int months = years*12;
        double A = P* Math.pow(1+monthlyRate,months);
        double feeRate = 0.005;
        double fee = A*feeRate;
        double finalAmount = A-fee;
    
        
        System.out.println("Principal amount: "+P);
        System.out.println("Annual interest rate:"+annualRate);
        System.out.println("Monthly interest rate: "+monthlyRate*100); 
        System.out.println("Duration: " +years);
        System.out.println("Maturity amount: "+A);
        System.out.println("Processing fee: "+fee);
        System.out.println();
        System.out.println("Do you wish to calculate another FD? (y/n): ");
        continueCalculation = input.next().charAt(0);
        System.out.println();
        
        System.out.println("Thanks for visiting");
        input.close();
        
        
    }
 }   
}