public class MainVencimento {
    public static void main(String[] args) {
        TrabalhadorPeca trabalhadorP = new TrabalhadorPeca("Jorge Silva", 52, 62);
        TrabalhadorComissao trabalhadorC = new TrabalhadorComissao("Susana Ferreira", 650, 2741.50F, 4.25f);
        TrabalhadorHora trabalhadorH = new TrabalhadorHora("Carlos Miguel", 168, 4.50F);
        Trabalhador[] trabalhadores = new Trabalhador[10];
        trabalhadores[0] = trabalhadorP;
        trabalhadores[1] = trabalhadorC;
        trabalhadores[2] = trabalhadorH;
        System.out.println("Listagem de Trabalhadores:");
        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] != null) {
                System.out.println(trabalhadores[i]);
            }
            else {
                break;
            }
        }
        System.out.println("\nListagem de Trabalhadores Hora:");
        for (int i = 0; i < trabalhadores.length; i++) {
            if (trabalhadores[i] instanceof TrabalhadorHora) {
                System.out.println(trabalhadores[i]);
            }
        }
        System.out.println("\nListagem de Vencimentos:");
        for (int i = 0; i < trabalhadores.length; i++) {
            if(trabalhadores[i] != null) {
                System.out.println(trabalhadores[i].getNome());
                System.out.println(trabalhadores[i].calcularVencimento());
            }
        }
    }
}
