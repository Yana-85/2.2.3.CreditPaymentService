public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        double creditAmount = 1_000_000;
        double creditTerm = 12;
        double interestRate = 9.99;
        int monthlyPayment = (int) service.calculate(1_000_000, 9.99, 12);
        System.out.println(" Ежемесячный платеж: " + monthlyPayment + " р.");
     }
}
