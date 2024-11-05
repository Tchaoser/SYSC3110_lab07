public abstract class Site {
    protected double _units;
    protected double _rate;
    public static final double TAX_RATE = 0.2;

    public double getBillableAmount() {
        return getBaseAmount() + getTaxAmount();
    }
    //final
    //abstracts added
    protected abstract double getBaseAmount();
    protected abstract double getTaxAmount();
}
