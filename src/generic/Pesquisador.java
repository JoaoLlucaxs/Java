package generic;

public class Pesquisador {

    /*Esse <T extends Nomeavel > não é uma herança e sim querendo dizer que:
    * É como se o T que é um objeto que o superior é Nomeavel um supertipo
    * Então quando fui em Cliente e dei um "implements" e em Funcionário também
    * quer dizer que aqui vai aceitar ambos por serem um SUPERTIPO de Nomeavel*/
    public static <T extends Nomeavel> T obterPorNome(T[] itens, String nome){
        for(T item: itens){
            if(item.getNome().equals(nome)){
                return item;
            }
        }

        throw new RuntimeException("Não encontrado");
    }
}
