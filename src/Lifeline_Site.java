public class Lifeline_Site extends Site {
    @Override
    public double getBillableAmount() {
        double base = _units * _rate;
        double tax = base * Site.TAX_RATE;
        return base + tax;
    }
}
