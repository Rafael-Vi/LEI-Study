import java.util.Scanner;

public class MainPessoa {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insira o seu nome: ");
        String nome = sc.next();
        System.out.print("Insira a sua idade: ");
        int idade = sc.nextInt();

        Pessoa pessoa = new Pessoa();

        pessoa.getName();
        pessoa.getIdade();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        System.out.println(pessoa);

    }
}
