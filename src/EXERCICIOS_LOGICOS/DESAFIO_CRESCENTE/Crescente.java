package EXERCICIOS_LOGICOS.DESAFIO_CRESCENTE;

import java.io.BufferedReader;
import java.util.Scanner;

public class Crescente {

    /*
    *Leia uma quantidade indeterminada de duplas de valores inteiros X e Y. Escreva para cada X e Y uma
    mensagem que indique se estes valores foram digitados em ordem crescente ou decrescente. O
    programa deve finalizar quando forem digitados dois valores iguai
    * */

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Informe um número : ");
        int num1=sc.nextInt();
        System.out.println("Informe um número : ");
        int num2=sc.nextInt();

       while (num1 != num2){
           if (num1 > num2){
               System.out.println("DECRESCENTE");
               num1=sc.nextInt();
               num2=sc.nextInt();
           }else {
               System.out.println("CRESCENTE");
               num1=sc.nextInt();
               num2=sc.nextInt();
           }
       }
        System.out.println("IGUAIS");

       // FORMATO PLENO :


        sc.close();
    }
}
