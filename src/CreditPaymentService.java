public class CreditPaymentService {
    public int calculate(int creditAmount, int creditPeriod, float annualRate) {
        int paymentAmount = creditPeriod * 12;
        float interestRate = annualRate / (12 * 100);
        float var = (float) Math.pow((1 + interestRate), paymentAmount);
        return (int) (creditAmount * (interestRate * var / (var - 1)));
    }
}
