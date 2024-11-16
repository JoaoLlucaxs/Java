package coleta_lixo;

import java.util.ArrayList;
import java.util.List;

public class SistemaPedido_Garbage {
    public static void main(String[] args) {

        List<Pedido_Garbage> pedidos=new ArrayList();

        for (int i=1; i <= 1000; i++){
            Pedido_Garbage pedido=new Pedido_Garbage(i , " descrição do pedido" + i);
            pedido.processar();

            // Após o processamento, não precisamos mais do objeto
            pedidos.add(pedido);
        }
        // Após essa linha, os objetos pedidos podem ser coletados pelo Garbage Collector,
        // pois não temos mais referência para eles.
        pedidos.clear(); //Isso remove todas as referências aos objetos Pedido.

        System.out.println("Pedidos processados e lista liberada.");

        // Solicitando manualmente uma coleta (não garantida)
        System.gc();

        System.out.println("Finalizando o sistema.");
    }
}
