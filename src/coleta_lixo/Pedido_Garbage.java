package coleta_lixo;

public class Pedido_Garbage {
    private int id;
    private String descricao;

    public Pedido_Garbage(){};

    public Pedido_Garbage(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public void processar(){
        System.out.println("Processando pedido #" + id + " , " + descricao);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
