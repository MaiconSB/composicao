package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.Enum.OrderStatus;

public class Order {
	private LocalDateTime moment;
	private OrderStatus status; 
	
	private List<OrdemItem> listItem = new ArrayList<>();
	private Client cliente;
	
	public Order() {}
	
	public Order(LocalDateTime moment, OrderStatus status, Client cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public List<OrdemItem> getListItem() {
		return listItem;
	}


	public Client getCliente() {
		return cliente;
	}

	public void setCliente(Client cliente) {
		this.cliente = cliente;
	}
	
	public void addItem(OrdemItem item) {
		listItem.add(item);
	}
	
	public void removeItem(OrdemItem item) {
		listItem.remove(item);
	}
	
	
	public Double total( ) {
		
		double total = 0.0;
		for(OrdemItem item : listItem) {
			total += item.subTotal();
		}
		return total;
	}

	@Override
	public String toString() {
		return  "Total price: $" + total();
	}
	
	
}
