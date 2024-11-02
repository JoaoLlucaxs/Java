package generic;

public class Principal_02 {
    public static void main(String[] args) {

        Cliente[] clientes={
                new Cliente("Supermercado",600.00),
                new Cliente("Supermercado",600.00),
                new Cliente("Supermercado",600.00)
        };

        String[] nomes={"João" , "Lucas" , "Queiroz"};

        System.out.println(clientes.length);

        Cliente clienteSorteado=Sorteado.sortear1(clientes);
        System.out.println(clienteSorteado);

        // ======================= E SE FOSSE ALÉM DE ARRAY DE CLIENTES ? ================

        /*ESTOU LIMITANDO , SE EU QUISESSE SORTEAR UM ARRAY DE STRING , NUMEROS... ETC
        NÃO TERIA COMO , POIS O MÉTODO SORTEAR ESTÁ LIMITADO PARA ACEITAR UM OBJETO CLIENTE
        * */

        // AGORA AO CHAMAR O METODO PASSAMOS .<> "O TIPO QUE VAI LEVAR" , OU NEM PRECISA CASO NÃO QUEIRA
        Cliente clienteSorteado_2=Sorteado.<Cliente>sortear2(clientes);
        String sorteaNome=Sorteado.<String>sortear2(nomes);
    }

}
