package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		product1.setName("Tuçe Makinesi");
		product1.setDiscount(7);
		product1.setImageUrl("image1");
		product1.setUnitPrice(700);

		Product product2 = new Product();
		product2.setName("Ömer Makinesi");
		product2.setDiscount(3);
		product2.setImageUrl("image2");
		product2.setUnitPrice(500);

		Product product3 = new Product();
		product3.setName("deniz Makinesi");
		product3.setDiscount(4);
		product3.setImageUrl("image3");
		product3.setUnitPrice(900);

		
		Product[] products= {product1,product2,product3};
		
		System.out.println("<ul>");
		
		for (Product product : products) {
			
			System.out.println("<li>" + product.getName() + "</li>");
			
		}
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setCustomerNumber("123456");
		individualCustomer.setId(1);
		individualCustomer.setPhoneNumber("05537445152");
		
		individualCustomer.setFirstName("Deniz Şenel");
		
		CorporateCustomer corporateCustomer= new CorporateCustomer();
				corporateCustomer.setId(2);
				corporateCustomer.setCompanyName("mycompany");
				corporateCustomer.setPhoneNumber("5345346456");
		
				Customer[] customers= {individualCustomer,corporateCustomer};
	}
}
