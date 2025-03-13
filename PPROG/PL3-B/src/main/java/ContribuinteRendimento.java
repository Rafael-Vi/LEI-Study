public abstract class ContribuinteRendimento extends Contribuinte {
    private double taxasRT;
    private double taxasOR;

    public ContribuinteRendimento(String nome, String morada, double rendimento) {
        super(nome, morada, rendimento);
    }

    public ContribuinteRendimento() {
        super();
    }

    @Override
    public double getTaxasRT() {
        return taxasRT;
    }

    @Override
    public double getTaxasOR() {
        return taxasOR;
    }

    @Override
    protected void setTaxasOR(double taxasOR) {
        this.taxasOR = taxasOR;
    }

    @Override
    protected void setTaxasRT(double taxasRT) {
        this.taxasRT = taxasRT;
    }

    public abstract void calcularTaxas();
}