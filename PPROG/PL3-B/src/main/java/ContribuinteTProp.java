public class ContribuinteTProp extends ContribuinteRendimento {
            private static final double TAXAS_OR_MIN = 0.02;
            private static final double TAXAS_OR_MAX = 0.05;
            private static final double TAXAS_RT_PROP = 0.03;
            private static final double VALOR_MAXIMO_OR = 50000;

            public ContribuinteTProp(String nome, String morada, double rendimento) {
                super(nome, morada, rendimento);
                calcularTaxas();
            }

            public ContribuinteTProp() {
                super();
                calcularTaxas();
            }

            @Override
            public void calcularTaxas() {
                if (this.getRendimento() > VALOR_MAXIMO_OR) {
                    setTaxasOR(TAXAS_OR_MAX);
                } else {
                    setTaxasOR(TAXAS_OR_MIN);
                }
                setTaxasRT(TAXAS_RT_PROP);
            }

        }