public class MainIRS {
    public static void main(String[] args) {
        // Criação de dois objetos de cada classe instanciável
        ContribuinteReformado reformado1 = new ContribuinteReformado("Reformado1", "Morada1", 20000);
        ContribuinteReformado reformado2 = new ContribuinteReformado("Reformado2", "Morada2", 30000);

        ContribuinteTProp tProp1 = new ContribuinteTProp("TProp1", "Morada1", 40000);
        ContribuinteTProp tProp2 = new ContribuinteTProp("TProp2", "Morada2", 60000);

        ContribuinteDesempregado desempregado1 = new ContribuinteDesempregado("Desempregado1", "Morada1", 10000);
        ContribuinteDesempregado desempregado2 = new ContribuinteDesempregado("Desempregado2", "Morada2", 15000);

        ContribuinteTOutr tOutr1 = new ContribuinteTOutr("TOutr1", "Morada1", 25000);
        ContribuinteTOutr tOutr2 = new ContribuinteTOutr("TOutr2", "Morada2", 35000);

        // b) Criação e preenchimento de um contentor do tipo array
        Contribuinte[] contribuintes = new Contribuinte[10];
        contribuintes[0] = reformado1;
        contribuintes[1] = reformado2;
        contribuintes[2] = tProp1;
        contribuintes[3] = tProp2;
        contribuintes[4] = desempregado1;
        contribuintes[5] = desempregado2;
        contribuintes[6] = tOutr1;
        contribuintes[7] = tOutr2;

        // c) Varrimento do contentor para apresentação de cada objeto e respetivo valor do imposto extraordinário
        for (Contribuinte contribuinte : contribuintes) {
            if (contribuinte != null) {
                System.out.println(contribuinte);
            }
        }

        // d) Varrimento do contentor para apresentação do nome e imposto extraordinário a pagar pelos contribuintes desempregados
        for (Contribuinte contribuinte : contribuintes) {
            if (contribuinte instanceof ContribuinteDesempregado) {
                System.out.println("Nome: " + contribuinte.getNome() + ", Imposto Extraordinário: " + contribuinte.getTaxasOR());
            }
        }

        // e) Altere o valor da taxa aplicar aos OR dos desempregados
        ContribuinteDesempregado.setTaxasORDesempregados(0.05);

        // f) Repita o varrimento da alínea d
        for (Contribuinte contribuinte : contribuintes) {
            if (contribuinte instanceof ContribuinteDesempregado) {
                System.out.println("Nome: " + contribuinte.getNome() + ", Imposto Extraordinário: " + contribuinte.getTaxasOR());
            }
        }
    }
}