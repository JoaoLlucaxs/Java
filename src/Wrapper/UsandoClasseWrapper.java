package Wrapper;

public class UsandoClasseWrapper {
    public static void main(String[] args) {

        /*
         * Em java quase tudo é objeto, menos os tipos PRIMITIVOS
         *  - int
         * - long
         * - float
         * - double
         * - char
         * - boolean
         *
         *
         * QUANDO NÃO USAR ? -> Saiba que primitivos não aceita null
         * */

        UsandoClasseWrapper_2 testeWrapper=new UsandoClasseWrapper_2();

        testeWrapper.idade=Integer.valueOf(20);
        System.out.println(testeWrapper.idade);
    }



}
