public class Tempo {
    private int hora;
    private int minutos;
    private int segundos;

    private static final int HORA_POR_OMISSAO = 0;
    private static final int MINUTOS_POR_OMISSAO = 0;
    private static final int SEGUNDOS_POR_OMISSAO = 0;
    private static final int DIVISAO_TEMPO_MIN_SEC = 60;
    private static final int DIVISAO_TEMPO_HORA = 24;
    private static final int MEIO_DIA = 43200;

    public Tempo() {
       hora = HORA_POR_OMISSAO;
       minutos = MINUTOS_POR_OMISSAO;
       segundos = SEGUNDOS_POR_OMISSAO;
    }

    public Tempo(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getHora() {
        return hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getSegundos() {
        return segundos;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minutos, segundos);
    }

    public void printTempo(){
        if (calcularTempoEmSegundos()> MEIO_DIA){
            System.out.println(toString() + " PM");
        } else {
            System.out.println(toString() + " AM");
        }
    }


    public void add1Segundo() {
        segundos++;
        if (segundos==DIVISAO_TEMPO_MIN_SEC) {
            segundos = 0;
            minutos++;
            if (minutos==DIVISAO_TEMPO_MIN_SEC){
                minutos = 0;
                hora++;
                if (hora==DIVISAO_TEMPO_HORA){
                    hora = 0;
                }
            }
        }
    }

    public double calcularTempoEmSegundos() {
        return hora * 3600 + minutos * DIVISAO_TEMPO_MIN_SEC + segundos;
    }

    public int calcularDiferencaEmSegundos(Tempo outroTempo) {
        return (int) (Math.max(calcularTempoEmSegundos(), outroTempo.calcularTempoEmSegundos()) - Math.min(calcularTempoEmSegundos(), outroTempo.calcularTempoEmSegundos()));
    }

    public Tempo calcularDiferencaEmTempo(Tempo outroTempo){

        int diferencaSegundos = calcularDiferencaEmSegundos(outroTempo);
        int tempoHoras = diferencaSegundos / 3600;
        int tempoMinutos = (diferencaSegundos % 3600) / DIVISAO_TEMPO_MIN_SEC;
        int tempoSegundos = (diferencaSegundos % 3600) % DIVISAO_TEMPO_HORA;

        return new Tempo(tempoHoras, tempoMinutos, tempoSegundos);
    }

    public Tempo maiorTempo(Tempo outroTempo){
        if (calcularTempoEmSegundos() > outroTempo.calcularTempoEmSegundos()){
            return new Tempo(hora, minutos, segundos);
        }
        return new Tempo(outroTempo.hora, outroTempo.minutos, outroTempo.segundos);
    }
}
