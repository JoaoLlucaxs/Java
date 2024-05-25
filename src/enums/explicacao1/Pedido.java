package enums.explicacao1;

import java.util.Date;

public class Pedido {
	
	private int id;
	private Date moment;
	private OrderStatus orderStatus;
	
	public Pedido() {}

	public Pedido(int id, Date moment, OrderStatus orderStatus) {
		this.id = id;
		this.moment = moment;
		this.orderStatus = orderStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", moment=" + moment + ", orderStatus=" + orderStatus + "]";
	};
	
	
}
