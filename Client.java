package productDelivery;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {
	String name;
	String email;
	Date birthDate;
	SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyy");
	
	public Client() {}
	
	public Client(String name, String email, Date birthDate) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Client: " + name);
		sb.append(" ("+fmt.format(birthDate) + ")");
		sb.append(" - " + email);
		return sb.toString();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	
}
