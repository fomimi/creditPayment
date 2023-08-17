public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int annuityPaymentOne = service.calculate(1000000, 1, 9.99f);
        int annuityPaymentTwo = service.calculate(1000000, 2, 9.99f);
        int annuityPaymentThree = service.calculate(1000000, 3, 9.99f);
        System.out.println("Ежемесячный платёж при сроке кредита 1 год: " + annuityPaymentOne);
        System.out.println("Ежемесячный платёж при сроке кредита 2 года: " + annuityPaymentTwo);
        System.out.println("Ежемесячный платёж при сроке кредита 3 года: " + annuityPaymentThree);
    }
}