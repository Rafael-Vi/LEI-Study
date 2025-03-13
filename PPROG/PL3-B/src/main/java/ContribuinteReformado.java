public class ContribuinteReformado extends ContribuinteRendimento {
    private static final double TAXAS_RT_REFORMADO = 0.01;
    private static final double TAXAS_OR_REFORMADO = 0.03;

    public ContribuinteReformado(String nome, String morada, double rendimento) {
        super(nome, morada, rendimento);
        calcularTaxas();
    }

    public ContribuinteReformado() {
        super();
        calcularTaxas();
    }

    @Override
    public void calcularTaxas() {
        setTaxasRT(TAXAS_RT_REFORMADO);
        setTaxasOR(TAXAS_OR_REFORMADO);
    }

}