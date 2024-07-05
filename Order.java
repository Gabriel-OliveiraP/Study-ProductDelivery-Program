package productDelivery;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Order {
	SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	Date momment;
	OrderStatus status;
		
	public Order(Date momment, OrderStatus status) {
		this.momment = momment;
		this.status = status;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("ORDER SUMARY:" + "\n");
		sb.append("Order momment: " + fmt.format(momment) + "\n");
		sb.append("Order status: " + status);
		return sb.toString();
	}
}
