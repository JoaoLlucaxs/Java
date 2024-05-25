package enums.explicacao1;


/*• É um tipo especial que serve para especificar de forma literal um 
conjunto de constantes relacionadas
• Palavra chave em Java: enum
• Vantagem: melhor semântica, código mais legível e auxiliado pelo 
compilador
 * 
 * 
 * */

public enum OrderStatus {
	
	PAGAMENTO_PENDENTE("Pendente"),
	PROCESSANDO("Processando"),
	ENVIADO("Enviado"),
	ENTREGUE("Entregue");
	
	private String descricao;
	
	OrderStatus(String descricao) {
		// TODO Auto-generated constructor stub
		this.descricao=descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
	 @Override
	    public String toString() {
	        return descricao;
	    }
}
