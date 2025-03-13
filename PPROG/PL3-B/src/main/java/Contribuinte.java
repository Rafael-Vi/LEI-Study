public abstract class Contribuinte {
                    private String nome;
                    private String morada;
                    private double rendimento;

                    private static final String NOME_POR_OMISSAO = "sem nome";
                    private static final String MORADA_POR_OMISSAO = "sem morada";
                    private static final double RENDIMENTO_POR_OMISSAO = 0;

                    public Contribuinte(String nome, String morada, double rendimento) {
                        this.nome = nome;
                        this.morada = morada;
                        this.rendimento = rendimento;
                    }

                    public Contribuinte() {
                        this(NOME_POR_OMISSAO, MORADA_POR_OMISSAO, RENDIMENTO_POR_OMISSAO);
                    }

                    public String getNome() {
                        return nome;
                    }

                    public String getMorada() {
                        return morada;
                    }

                    public double getRendimento() {
                        return rendimento;
                    }

                    public abstract double getTaxasRT();

                    public abstract double getTaxasOR();

                    protected abstract void setTaxasOR(double taxasOR);

                    protected abstract void setTaxasRT(double taxasRT);

                    public void setNome(String nome) {
                        this.nome = nome;
                    }

                    public void setMorada(String morada) {
                        this.morada = morada;
                    }

                    public void setRendimento(double rendimento) {
                        this.rendimento = rendimento;
                    }

                    @Override
                    public String toString() {
                        return "Nome: " + nome + "\nMorada: " + morada + "\nRendimento: " + rendimento + "\nTaxas RT: " + getTaxasRT() + "\nTaxas OR: " + getTaxasOR();
                    }
                }