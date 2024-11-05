public class Residental_Site extends Site {

    @Override
    public double getBaseAmount() {
        double base = _units * _rate * 0.5;
        return base;
    }
    //final

    @Override
    public double getTaxAmount() {
        double tax = getBaseAmount() * Site.TAX_RATE * 0.2;
        return tax;
    }
}

