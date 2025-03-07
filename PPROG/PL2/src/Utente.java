public class Utente {
    private String nome;
    private String genero;
    private int idade;
    private double altura;
    private double peso;
    private double imc;
    private String imcRange;
    protected static int numeroUtentes = 0;

    private static final String NOME_POR_OMISSAO = "Sem nome";
    private static final String GENERO_POR_OMISSAO = "Sem genero";
    private static final int IDADE_POR_OMISSAO = 0;
    private static final double ALTURA_POR_OMISSAO = 0;
    private static final double PESO_POR_OMISSAO = 0;

    private static double IMC_BAIXO_IMC = 18;
    private static double IMC_ALTO_IMC = 25;
    public Utente(String nome, String genero, int idade, double altura, double peso) {
        this.nome = nome;
        this.genero = genero;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        imc = calcularIMC();
        numeroUtentes++;
    }

    public Utente(){
        nome = NOME_POR_OMISSAO;
        genero = GENERO_POR_OMISSAO;
        idade = IDADE_POR_OMISSAO;
        altura = ALTURA_POR_OMISSAO;
        peso = PESO_POR_OMISSAO;
        imc = calcularIMC();
        numeroUtentes++;
    }

    public Utente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        genero = GENERO_POR_OMISSAO;
        altura = ALTURA_POR_OMISSAO;
        peso = PESO_POR_OMISSAO;
        imc = calcularIMC();
        numeroUtentes++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void getUtente(){
        System.out.println("Nome: " + nome);
        System.out.println("Genero: " + genero);
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Genero: " + genero + ", Idade: " + idade + ", Altura: " + altura + ", Peso: " + peso;
    }

    public int calcularDiferencaIdades(Utente utente, Utente utente2){
        return Math.max(utente.getIdade(),utente2.getIdade()) - Math.min(utente.getIdade(),utente2.getIdade());
    }

    public double calcularIMC(){
        imc = peso / (altura * altura);
        return imc;
    }

    public String calculateIMCRange(){
        imc = calcularIMC();

        if(imc < IMC_BAIXO_IMC){
            imcRange = "Magro";
        }else if(imc >= IMC_BAIXO_IMC && imc < IMC_ALTO_IMC){
            imcRange = "Normal";
        }else{
            imcRange = "Obeso";
        }

        return imcRange;
    }

    public String getIMCRange(){
        return imcRange;
    }

    public static int getNumeroUtentes(){
        return numeroUtentes;
    }

    public void setMinIMC(double newMinIMC){
        IMC_BAIXO_IMC = newMinIMC;
    }
    public void setMaxIMC(double newMaxIMC){
        IMC_ALTO_IMC = newMaxIMC;
    }
}
