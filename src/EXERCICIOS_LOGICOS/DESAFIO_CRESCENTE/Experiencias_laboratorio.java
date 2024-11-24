package EXERCICIOS_LOGICOS.DESAFIO_CRESCENTE;

import java.util.Scanner;

public class Experiencias_laboratorio {
    public static void main(String[] args) {
        /*
        * Maria acabou de iniciar seu curso de graduação na faculdade de medicina e precisa de sua ajuda para
organizar os experimentos de um laboratório do qual ela é responsável. Ela quer saber no final do ano,
quantas cobaias foram utilizadas no laboratório e o percentual de cada tipo de cobaia utilizada. Este
laboratório em especial utiliza três tipos de cobaias: sapos, ratos e coelhos. Para obter estas
informações, ela sabe exatamente o número de experimentos que foram realizados, o tipo de cobaia
utilizada e a quantidade de cobaias utilizadas em cada experimento. Faça um programa que leia um
valor inteiro N que indica os vários casos de teste que vem a seguir. Cada caso de teste contém um
inteiro que representa a quantidade de cobaias utilizadas e uma letra ('C', 'R' ou 'S'), indicando o tipo
de cobaia (R:Rato S:Sapo C:Coelho). Apresente o total de cobaias utilizadas, o total de cada tipo de
cobaia utilizada e o percentual de cada uma em relação ao total de cobaias utilizadas, sendo que o
percentual deve ser apresentado com dois dígitos após o ponto.
        * */

        Scanner sc=new Scanner(System.in);
        char tipoCobaia;
        int qtdCobaias = 0;


        System.out.println("Quantos casos de cobaias serão digitados ? ");
        int totalCasos=sc.nextInt();

        System.out.println("Quantidade de Cobaias :" + totalCasos);

        for (int i=1; i<= totalCasos; i++){
            System.out.println("Tipo de Cobaia :");
            tipoCobaia=isValidaString(sc.next().toUpperCase().charAt(0));

            System.out.println("Quantidade de Cobaias: ");
            qtdCobaias=sc.nextInt();
        }
        System.out.println("RELATÓRIO FINAL: ");
        System.out.println("TOTAL COBAIAS: " + qtdCobaias);

        sc.close();
    }

    public static Character isValidaString(char valor){
        try {
            switch (valor) {
                case 'C':
                    return valor;
                case 'R':
                    return valor;
                case 'S':
                    return valor;
            }
        }catch (Exception e){
            System.out.println("Erro ao selecionar valor : " + e.getMessage());
        }
        return valor;
    }
}
