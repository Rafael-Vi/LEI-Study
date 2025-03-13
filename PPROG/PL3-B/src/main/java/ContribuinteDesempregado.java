public class ContribuinteDesempregado extends Contribuinte {
                    private static double TAXAS_RT_DESEMPREGADO = 0;
                    private static double TAXAS_OR_DESEMPREGADO = 0.02;

                    public ContribuinteDesempregado(String nome, String morada, double rendimento) {
                        super(nome, morada, rendimento);
                        calcularTaxas();
                    }

                    public ContribuinteDesempregado() {
                        super();
                        calcularTaxas();
                    }

                    public static void setTaxasORDesempregados(double taxas) {
                        TAXAS_OR_DESEMPREGADO = taxas;
                    }

                    @Override
                    public double getTaxasRT() {
                        return TAXAS_RT_DESEMPREGADO;
                    }

                    @Override
                    public double getTaxasOR() {
                        return TAXAS_OR_DESEMPREGADO;
                    }

                    @Override
                    protected void setTaxasOR(double taxasOR) {
                        // No-op, as taxasOR is static
                    }

                    @Override
                    protected void setTaxasRT(double taxasRT) {
                        // No-op, as taxasRT is static
                    }

                    public void calcularTaxas() {
                        // No-op, as taxas are static
                    }

                }