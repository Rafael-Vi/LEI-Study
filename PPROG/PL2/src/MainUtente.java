import java.util.Objects;

public class MainUtente {
    public static void main(String[] args) {
        Utente[] arrayDeUtentes = new Utente[3];
        arrayDeUtentes[0] = new Utente("Ana", "Feminino", 20, 1.70, 60);
        arrayDeUtentes[1] = new Utente("João", "Masculino", 25, 1.80, 80);
        arrayDeUtentes[2] = new Utente("Maria", "Feminino", 30, 1.60, 50);
        for (Utente utente : arrayDeUtentes) {
            System.out.println(utente);
        }
        for (Utente utente : arrayDeUtentes) {
           System.out.println( utente.getNome());
           utente.calcularIMC();
        }

        for (Utente utente : arrayDeUtentes) {
            if(!Objects.equals(utente.getIMCRange(), "Normal")){
              System.out.println(utente.getNome());
              System.out.println(utente.getIMCRange());
            }
        }


    }
}
