public class InsuranceStrategyHigh extends InsuranceStrategy {
    @Override
    int getConstant() {
        return 76_500;
    }

    @Override
    double getWeight() {
        return 0.1;
    }

    @Override
    int getAdjustment() {
        return 30_000;
    }
}
