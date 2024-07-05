package productDelivery;


public class OrderItem {
	// para os dados do Pedido do produto//
	
	Integer quantity;
	double price;
	Product product = new Product();
	
	public OrderItem() {}
	public OrderItem( String name, Integer quantity, double price) {
		this.quantity = quantity;
		this.price = price;
		product.setName(name);
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName()+ ", ");
		sb.append(String.format("R$%.2f", price) + ", ");
		sb.append("Quantity: " + quantity);
		sb.append(" Subtotal: ");
		sb.append(String.format("R$%.2f", subTotal(quantity, price)));
		sb.append("\n");
		return sb.toString();
	}
	
	public double subTotal(Integer quantity, double price) {
		return quantity * price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
