public class ContribuinteTOutr extends ContribuinteRendimento {
                    private static final double TAXAS_RT_MIN = 0.01;
                    private static final double TAXAS_RT_MAX = 0.02;
                    private static final double TAXAS_OR_TOUTR = 0.03;
                    private static final double VALOR_MAXIMO_RT = 30000;

                    public ContribuinteTOutr(String nome, String morada, double rendimento) {
                        super(nome, morada, rendimento);
                        calcularTaxas();
                    }

                    public ContribuinteTOutr() {
                        super();
                        calcularTaxas();
                    }

                    @Override
                    public void calcularTaxas() {
                        if (this.getRendimento() > VALOR_MAXIMO_RT) {
                            setTaxasRT(TAXAS_RT_MAX);
                        } else {
                            setTaxasRT(TAXAS_RT_MIN);
                        }
                        setTaxasOR(TAXAS_OR_TOUTR);
                    }

                }