// This program calculates the monthly car payment a user should expect to make after taking out a car loan.

public class CarLoan {
    public static void main(String[] args) {
        // Define variables for the loan details
        int carLoan = 10000;          // Total cost of the car loan in dollars
        int loanLength = 3;           // Loan duration in years
        int interestRate = 5;         // Annual interest rate as a percentage
        int downPayment = 2000;       // Initial payment made on the car loan

        // Check if the loan length or interest rate is zero or negative
        if (loanLength <= 0 || interestRate <= 0) {
            System.out.println("Error! You must take out a valid car loan.");
        } 
        // Check if the down payment is greater than or equal to the car loan amount
        else if (downPayment >= carLoan) {
            System.out.println("The car can be paid in full.");
        } 
        // Calculate the monthly payment if the loan conditions are valid
        else {
            // Calculate the remaining balance after the down payment
            int remainingBalance = carLoan - downPayment;
            // Convert the loan length from years to months
            int months = loanLength * 12;
            // Calculate the monthly balance before interest
            int monthlyBalance = remainingBalance / months;
            // Calculate the interest on the monthly balance
            int interest = monthlyBalance * interestRate / 100;
            // Calculate the total monthly payment including interest
            int monthlyPayment = monthlyBalance + interest;
            // Print the calculated monthly payment
            System.out.println(monthlyPayment);
        }
    } 
}
