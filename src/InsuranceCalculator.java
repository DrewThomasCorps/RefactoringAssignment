public class InsuranceCalculator {

    private InsuranceStrategyVeryHigh strategy;

    public double calculateInsurance(double income) {
        if (income <= 10_000) {
            return income * 0.365;
        } else if (income <= 30_000) {
            return (income - 10_000) * 0.2 + 35_600;
        } else if (income <= 60000) {
            return (income - 30_000) * 0.1 + 76_500;
        } else {
            strategy = new InsuranceStrategyVeryHigh();
            return strategy.calculateInsuranceVeryHigh(income);
        }
    }

}
