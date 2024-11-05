package generic;

public class Principal_03 {
    public static void main(String[] args) {
        // DELIMITANDO TIPO GENERICO

        Funcionario[] funcionarios={
                new Funcionario("João",23),
                new Funcionario("Lucas", 24),
                new Funcionario("Queiroz",25)
        };

        Cliente[] clientes={
                new Cliente("LTDA SOFTWARE",200.000),
                new Cliente("LTDA SOFT",200.000),
                new Cliente("LTD House",200.000),
        };

        Funcionario funcionarioEncontrado=Pesquisador.obterPorNome(funcionarios,"João");
        System.out.println(funcionarioEncontrado);

        // NÃO IREI CONSEGUIR ENCONTRAR UM CLIENTE POIS O MÉTODO "obterPorNome" FEITO ESPECIFICAMENTE PARA FUNCIONARIO

        /*Cliente clienteEncontrado=Pesquisador.obterPorNome(funcionarios,"LTDA SOFTWARE");
        System.out.println(clienteEncontrado);*/


        // ======================= APÓS FAZER NOMEAVEL COMO SUBTIPO AMBOS FUNCIONAM ============
        Funcionario funcionarioSEncontrado=Pesquisador.obterPorNome(funcionarios,"João");
        Cliente clienteEncontrado=Pesquisador.obterPorNome(clientes,"LTDA SOFTWARE");

        System.out.println(funcionarioSEncontrado);
        System.out.println(clienteEncontrado);
    }
}
