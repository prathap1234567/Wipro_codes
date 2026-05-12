package com.wipro.d8_asssignment1part1_prathap__k;



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

     double calculateDemo(Invoice i){  
		   double totalAmount = i.price * i.item;
		   System.out.println("total amount"+totalAmount);
		   return totalAmount;
		   }
     
	  void save() {
				System.out.println("Saved to database");
			}
		   
      String print(Invoice i) {
				return "Invoice details:"+i.invoiceNumber;
			}
      
      public void Email(Invoice i) {
			System.out.println("Sending Email "+i.customerName);
		}
}
