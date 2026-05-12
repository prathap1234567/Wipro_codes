package com.wipro.d8_asssignment1part2_prathap_k;

public class InvoicePrint {
	public void print(Invoice i) {
		 System.out.println("ID: "+i.invoiceNumber);
	        System.out.println("Customername : "+i.customerName);
	        System.out.println("Item: "+i.item);
	        System.out.println("Price: "+i.price);
	}

}
