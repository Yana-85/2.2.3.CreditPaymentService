public class CreditPaymentService {
    public double calculate(double creditAmount, double interestRate, double creditTerm) {
        double monthlyInterestRate = interestRate/12/100;
        double coefficient_1 = 1 + monthlyInterestRate;
        double coefficient = Math.pow(coefficient_1, creditTerm);
        double coefficient_2 = ((monthlyInterestRate * coefficient)/(coefficient - 1));
        int monthlyPayment = (int) (creditAmount * coefficient_2);
        return monthlyPayment;
    }
}
