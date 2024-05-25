package enums.explicacao2;

public class Pedido {
	
	private String nomeCliente;
	private StatusPedido pedido=StatusPedido.RASCUNHO;
	private OrigemPedido origemPedido=OrigemPedido.BALCAO;
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public StatusPedido getPedido() {
		return pedido;
	}
	public void setPedido(StatusPedido pedido) {
		this.pedido = pedido;
	}
	public OrigemPedido getOrigemPedido() {
		return origemPedido;
	}
	public void setOrigemPedido(OrigemPedido origemPedido) {
		this.origemPedido = origemPedido;
	}
	
	
}
