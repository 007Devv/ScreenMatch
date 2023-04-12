package jr.devv.screenmatch.calculos;
import jr.devv.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }

}
