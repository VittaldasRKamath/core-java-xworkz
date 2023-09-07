class CustomerExecutor{
public static void main(String cust[]){
	Customer customer = new Customer();
// invoking setter

customer.setCustomerId(1);
System.out.println("The Customer Id is "+customer.getCustomerId());

customer.setCustomerName("Vittldas R Kamath");
System.out.println("The Customer Name is "+customer.getCustomerName());

customer.setAddress("Shree Ganesh Krupa, Taraginapete, Halebeedu");
System.out.println("The Customer Id is "+customer.getAddress());

customer.setContactNo(7019084193L);
System.out.println("The Customer No is "+customer.getContactNo());

customer.setEmailId("vittaldaskamath25@gmail.com");
System.out.println("The Customer EmailId is "+customer.getEmailId());

customer.setDOB("25/01/2001");
System.out.println("The Customer DOB is "+customer.getDOB());

customer.setGender("Male");
System.out.println("The Customer Gender is "+customer.getGender());
}
	
}