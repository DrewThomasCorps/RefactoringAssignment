public class InsuranceStrategyVeryHigh {
    public InsuranceStrategyVeryHigh() {
    }

    double calculateInsuranceVeryHigh(double income) {
        return (income - getAdjustment()) * getWeight() + getConstant();
    }

    int getConstant() {
        return 105_600;
    }

    double getWeight() {
        return 0.02;
    }

    int getAdjustment() {
        return 60_000;
    }
}