package generic;

import java.util.ArrayList;
import java.util.Objects;

public class Principal {
    public static void main(String[] args) {
        ArrayList clientes= new ArrayList();

        clientes.add(new Cliente("Supermercado Pague e Leve",800.00));
        clientes.add(new Cliente("Posto de gasolina",900.000));
        clientes.add("por ser arraylist aceita qualquer objeto , tipo eu aqui junto com o objeto Cliente");

        System.out.println(clientes);

        double totalFaturamento=0.0;

        /*No ARRAYLIST NA FORMA ACIMA PODEMOS ADICIONAR QUALQUER TIPO DE OBJETO
        * OU SEJA ELE RETORNA UM OBJECT POR ISSO O FOR ESTÁ COMO OBJECT
        * */
        for (Object objeto : clientes){
            Cliente cliente= (Cliente) objeto;

            totalFaturamento+=cliente.getFaturamentoMensal();
        }
        System.out.println(totalFaturamento);

        // ================================ PORQUE GENERIC =======================

        /*VEJA O CODIGO ACIMA , O ARRAYLIST ELE PERMITE QUALQUER TIPO DE OBJETO
        * NOTE QUE ESTOU INSTANCIANDO UM OBJETO DO TIPO CLIENTE
        * MAS SE EU INSIRO UM OBJETO DO TIPO STRING , AO CHEGAR NO LOOP
        * ELE DARÁ EXCEÇÃO POIS ESTOU FAZENDO UM CASTING DO OBJETO CLIENTE MAS EM ALGUM MOMENTO
        * FIZ "clientes.add("um objeto string")" <- ISSO NÃO É UM OBJETO CLIENTE LOGO
        * DARÁ ERRO*/

        /*GENERICS ENTRA PARA LIMITAR OS TIPOS DE OBJETOS QUE PODEMOS ADICIONAR*/

        ArrayList<Cliente> cliente_Generic= new ArrayList<Cliente>();
        cliente_Generic.add(new Cliente("Supermercado Pague e Leve",800.00));
        cliente_Generic.add(new Cliente("Posto de gasolina",900.000));

        System.out.println(cliente_Generic);

        double totalFaturamentos=0.0;
        for (Cliente client_obj:cliente_Generic){
            totalFaturamentos+=client_obj.getFaturamentoMensal();
        }
        System.out.println("Com casting " + totalFaturamentos);
    }
}
