package condicional;

public class NegacoesSimples {
    public static void main(String[] args) {

        /* O operador ! inverte o valor de uma expressão booleana:*
            !true → false
            !false → true
         */

        boolean aprovado = false;

        if (!aprovado) {
            System.out.println("O aluno não foi aprovado.");
        }

    }
}
