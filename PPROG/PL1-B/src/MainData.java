public class MainData {
public static void main(String[] args){
    Data data1 = new Data(2025,2,27);
    System.out.println(data1.toString());
    Data data2 = new Data(1974,4,25);
    System.out.println(data2.toAnoMesDiaString());
    System.out.println("Data1 é maior que Data2? " + data1.isMaior(data2));
    System.out.println("Diferença em dias entre Data1 e Data2: " + data1.calcularDiferenca(data2));
    System.out.println("Diferença em dias entre Data1 e 2025/12/27: " + data1.calcularDiferenca(2025,12,27));
    System.out.println("O dia " + data2.toAnoMesDiaString() + " foi num/a " + data2.determinarDiaDaSemana());
    System.out.println("O ano " + data2.getAno() + " foi um ano bissexto? " + Data.isAnoBissexto(data2.getAno()));
    }
}
