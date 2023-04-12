import jr.devv.screenmatch.calculos.CalculadoraDeTempo;
import jr.devv.screenmatch.calculos.Recomendacao;
import jr.devv.screenmatch.modelos.Episodio;
import jr.devv.screenmatch.modelos.Filme;
import jr.devv.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme primeiroFilme = new Filme();
        primeiroFilme.setNome("Batman");
        primeiroFilme.setAnoDeLancamento(2008);
        primeiroFilme.setDuracaoEmMinutos(135);
        primeiroFilme.setIncluidoNoPlano(true);

        primeiroFilme.exibeFichaTecnica();

        primeiroFilme.avalia(8);
        primeiroFilme.avalia(7.5);
        primeiroFilme.avalia(10);

        System.out.println("A média de avaliações do filme: "+primeiroFilme.getNome()+" é de "+primeiroFilme.mediaAvaliacoes());

        //criando objeto(Serie Supernatural)
        //Atribuindo valores aos atributos do objeto
        Serie supernatural = new Serie();
        supernatural.setNome("Supernatural");
        supernatural.setAnoDeLancamento(2005);
        supernatural.setTemporadas(17);
        supernatural.setDuracaoPorEpisodio(40);
        supernatural.setSerieEstaAtiva(false);
        supernatural.setEpisodiosPorTemporada(13);

        //avaliações
        supernatural.avalia(7.5);
        supernatural.avalia(6.8);
        supernatural.avalia(8);

        //Mostrar catálogo do filme para o usuário
        System.out.println(String.format("""
                Nome: %s
                Ano de lançamento: %d
                Temporadas: %d
                Duração por ep: %d
                Avaliação: %f
                Tempo em minutos para maratonar: %d
                """,supernatural.getNome(),supernatural.getAnoDeLancamento(),supernatural.getTemporadas(),supernatural.getDuracaoPorEpisodio(),supernatural.mediaAvaliacoes(),supernatural.getDuracaoEmMinutos()));

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(primeiroFilme);
        calculadora.inclui(supernatural);
        System.out.println(calculadora.getTempoTotal());

        Recomendacao filtro = new Recomendacao();
        filtro.filtra(primeiroFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(supernatural);
        episodio.setTotalDeVisualizacoes(350);
        filtro.filtra(episodio);

    }
}
