package entities;

public class OrdemItem {
	private Integer quantity; 
	private Double price; 
	
	private Product product;
	
	public OrdemItem() {}

	public OrdemItem(int quantity, Double price) {
		this.quantity = quantity;
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	public Double subTotal() {
		return price * quantity;
	}

	@Override
	public String toString() {
		return product.getName()+ ", "  + product.getPrice() + ", Quantity: "+
				quantity + ", Subtotal: $" + subTotal();
	}
	
	
}
