package com.wipro.d8_asssignment1part2_prathap_k;

public class Invoice {
	String invoiceNumber;
    String customerName;
     int  item;
    double price;
	public Invoice(String invoiceNumber, String customerName, int item, double price) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.customerName = customerName;
		this.item = item;
		this.price = price;
	}
}
