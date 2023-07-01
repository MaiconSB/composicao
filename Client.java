package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {

	DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String name;
	private String email; 
	private LocalDate birhDate;
	
	public Client() {}

	public Client(String name, String email, LocalDate birhDate) {
		this.name = name;
		this.email = email;
		this.birhDate = birhDate;
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

	public LocalDate getBirhDate() {
		return birhDate;
	}

	public void setBirhDate(LocalDate birhDate) {
		this.birhDate = birhDate;
	}

	@Override
	public String toString() {
		return "Client: " + name + " (" + birhDate.format(fmt1) + ") - "  + email;
	}
	
	
	
	
	
	
}
