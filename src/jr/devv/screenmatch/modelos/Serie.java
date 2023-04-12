package jr.devv.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private boolean serieEstaAtiva;
    private int duracaoPorEpisodio;

    public int getDuracaoPorEpisodio() {
        return duracaoPorEpisodio;
    }

    public void setDuracaoPorEpisodio(int duracaoPorEpisodio) {
        this.duracaoPorEpisodio = duracaoPorEpisodio;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isSerieEstaAtiva() {
        return serieEstaAtiva;
    }

    public void setSerieEstaAtiva(boolean serieEstaAtiva) {
        this.serieEstaAtiva = serieEstaAtiva;
    }

    public int getDuracaoEmMinutos(){
        return temporadas * getEpisodiosPorTemporada() * getEpisodiosPorTemporada() ;
    }
}
