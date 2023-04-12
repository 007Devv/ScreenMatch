package jr.devv.screenmatch.calculos;

public class Recomendacao {
    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os favoritos");
        }else if(classificavel.getClassificacao() >= 2){
            System.out.println("Muito bom!");
        }else{
            System.out.println("Coloque na lista para assistir depois");
        }
    }
}
