public class Customer{
	//encapsulation of Java in OOPS
	private int customerId;
	private String customerName;
	private String address;
	private long contactNo;
	private String emailId;
	private String dob;
	private String gender;

// setter and getter - methods
public void setCustomerId(int customerId){
	this.customerId = customerId;
}
public int getCustomerId(){
	return customerId;
}
public void setCustomerName(String customerName){
	this.customerName = customerName;
}
public String getCustomerName(){
	return customerName;
}
public void setAddress(String address){
	this.address = address;
}
public String getAddress(){
	return address;
}
public void setContactNo(long contactNo){
	this.contactNo = contactNo;
}
public long getContactNo(){
	return contactNo;
}
public void setEmailId(String emailId){
	this.emailId = emailId;
}
public String getEmailId(){
	return emailId;
}
public void setDOB(String dob){
	this.dob = dob;
}
public String getDOB(){
	return dob;
}
public void setGender(String gender){
	this.gender = gender;
}
public String getGender(){
	return gender;
}
}