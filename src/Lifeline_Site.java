public class Lifeline_Site extends Site {
    @Override
    public double getBaseAmount() {
        double base = _units * _rate;
        return base;
    }


    @Override
    public double getTaxAmount() {
        double tax = getBaseAmount() * Site.TAX_RATE;
        return tax;
    }

}
