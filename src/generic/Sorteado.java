package generic;

import java.util.Random;

public class Sorteado {

    private static final Random RANDOM=new Random();


    /*
    *  /*ESTOU LIMITANDO , SE EU QUISESSE SORTEAR UM ARRAY DE STRING , NUMEROS... ETC
        NÃO TERIA COMO , POIS O MÉTODO SORTEAR ESTÁ LIMITADO PARA ACEITAR UM OBJETO CLIENTE
        * */
    public static Cliente sortear1(Cliente[] objetos){
        if(objetos.length == 0){
            throw new IllegalArgumentException("Objeto está vazio, favor verificar");
        }

        int posicao=RANDOM.nextInt(objetos.length);
        return objetos[posicao];
    }

    // ========================== VAMOS CRIAR UMA FUNÇÃO GENERICA ACEITANDO ALEM DE UM ÚNICO TIPO DE OBJETO==========

    /* <T> -> A LETRA NÃO IMPACTA PODE SER QUALQUER LETRA , ESSA FUNÇÃO DIZ:
    * QUE O QUE FOR PASSADO NO ARGUMENTO DELA INFLUENCIARÁ NO RETORNO DELA
    * OU SEJA SE VIM NO PARAMETRO UM ARRAY DE STRING O RETORNO SERÁ STRING
    * SE VIER ARRAY DE CLIENTE O RETORNO SERÁ CLIENTE POR ISSO O "<T> T"
    * E POR ISSO QUE NO ARGUMENTO COLOCAMOS T[] PORQUE UM IMPACTA NO OUTRO
    * TORNANDO UMA FUNÇÃO DINÂMICA*/
    public static <T> T sortear2(T[] objetos){
        if(objetos.length == 0){
            throw new IllegalArgumentException("Objeto está vazio, favor verificar");
        }

        int posicao=RANDOM.nextInt(objetos.length);
        return objetos[posicao];
    }
}
