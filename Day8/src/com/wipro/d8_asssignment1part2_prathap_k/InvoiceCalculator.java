package com.wipro.d8_asssignment1part2_prathap_k;

   class InvoiceCalculator {
	   
	   double calculateDemo(Invoice i){
		   
	   double totalAmount = i.price * i.item;
	   System.out.println("total amount"+totalAmount);
	   return totalAmount;
	   }
}
