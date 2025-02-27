public class Pessoa {
    private String nome;
    private int idade;
    private static String NOME_DEFAULT = "Ricardo";
    private static int IDADE_DEFAULT = 0;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    public Pessoa(){
        this.nome = NOME_DEFAULT;
        this.idade = IDADE_DEFAULT;
    }

    public void setNome(String novoNome){
        nome = novoNome;
    }
    public void setIdade(int novaIdade){
        idade = novaIdade;
    }

    public void getName(){
        System.out.printf("Nome: " + nome);
        System.out.println();
    }
    public void getIdade(){
        System.out.printf("Idade: %d", idade);
        System.out.println();
    }

    public String toString(){
        return "Olá eu sou o/a " + nome + " e tenho " + idade + " anos";
    }

}
