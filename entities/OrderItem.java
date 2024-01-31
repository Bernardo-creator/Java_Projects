package entities;

public class OrderItem {
	private Double price;
	private Integer quantity;
	
	OrderItem() {
		
	}

	public OrderItem(Double price, Integer quantity) {
		this.price = price;
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
	public Double subTotal() {
		return quantity * price;
	}
	
}
