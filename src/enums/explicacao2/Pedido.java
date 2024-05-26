package enums.explicacao2;

public class Pedido {
	
	private String nomeCliente;
	private Double valor;
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
	
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	
	public int tempoEntregaEmHoras() {
		return pedido.getTempoEntregaEmHoras();
	}
	
	public void marcarComoEntregue() {
		pedido=StatusPedido.ENTREGUE;
	}
	
	public void emitir() {
		pedido=StatusPedido.EMITIDO;
	}
	
	public void cancelar() {
		if(getPedido().podeMudarParaCancelado(getValor())) { // regra de negocio no próprio enum
			pedido=StatusPedido.CANCELADO;
		}else {
			throw new IllegalStateException("Pedido não pode ser cancelado");
		}
		
	}
}
