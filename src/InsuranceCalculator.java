public class InsuranceCalculator {

    public double calculateInsurance(double income) {
        if (income <= 10_000) {
            return income * 0.365;
        } else if (income <= 30_000) {
            return (income - 10_000) * 0.2 + 35_600;
        } else if (income <= 60000) {
            return (income - 30_000) * 0.1 + 76_500;
        } else {
            return calculateInsuranceVeryHigh(income);
        }
    }

    private double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    private int getConstant() {
        return 105_600;
    }

    private double getWeight() {
        return 0.02;
    }

    private int getAdjustment() {
        return 60_000;
    }

}
