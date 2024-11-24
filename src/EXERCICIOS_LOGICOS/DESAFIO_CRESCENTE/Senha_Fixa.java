package EXERCICIOS_LOGICOS.DESAFIO_CRESCENTE;

import java.util.Scanner;

public class Senha_Fixa {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        final int SENHA_FIXA=1234;
        final String EMAIL="testeteste@gmail.com";

        System.out.println("Entre comseu e-mail : ");
        String email=sc.next();

        System.out.println("Entre com sua senha : ");
        int senha=sc.nextInt();

        while (senha != SENHA_FIXA || !email.equals(EMAIL)){
            System.out.println("ACESSO NEGADO , DADOS INCORRETOS TENTE NOVAMENTE : ");
            System.out.println("E-mail : ");
            email=sc.next();
            System.out.println("Senha: ");
            senha=sc.nextInt();

        }
        System.out.println("BEM VINDO " + email);

        sc.close();
    }
}
