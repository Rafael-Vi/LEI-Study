public class MainTempo {
    public static void main(String[] args) {
        Tempo t1 = new Tempo(5,30,12);
        t1.printTempo();
        t1.add1Segundo();
        t1.printTempo();
        Tempo t2 = new Tempo(18, 5, 20);
        t2.printTempo();
        System.out.println(t2.maiorTempo(t1));
        System.out.println(t1.maiorTempo(new Tempo(23,7,4)));

        System.out.println(t1.calcularDiferencaEmSegundos(t2));
        System.out.println(t2.calcularDiferencaEmTempo(t1));
    }
}
