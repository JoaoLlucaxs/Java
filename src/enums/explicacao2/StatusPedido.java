package enums.explicacao2;

public enum StatusPedido {
	//lista finita de constante que representa status finito
	
	RASCUNHO(),
	EMITIDO(12),
	FATURADO(10),
	DESPACHADO(6),
	ENTREGUE(),
	CANCELADO();
	
	private  Integer tempoEntregaEmHoras;
	
	StatusPedido() {}
	
	// Não pode public em enum , pois só quem instancia o enum é o proprio enum
	StatusPedido(int tempoEntregaEmHoras){
		this.tempoEntregaEmHoras=tempoEntregaEmHoras;
	}

	public Integer getTempoEntregaEmHoras() {
		return tempoEntregaEmHoras;
	}
	
	public boolean podeMudarParaCancelado(double valor) {
		return StatusPedido.RASCUNHO.equals(this) || StatusPedido.EMITIDO.equals(this)
		&& valor < 100;
	}
}
