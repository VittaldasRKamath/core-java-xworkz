class BankExecutor{
	public static void main(String banking[]){
		Bank bank=new Bank();
		bank.setBankId(501);
		bank.setBankName("SBI Bank");
		bank.setBranchName("Halebeedu");
		bank.setIfscCode("SBIN0040904");
		bank.setManagerName("Vittaldas R Kamath");
		bank.setNoOfWorkers(65);
		bank.setIsBankOpen(true);
		
		
		System.out.println("Bank Id : "+ bank.getBankId());
		System.out.println("Bank Name : "+ bank.getBankName());
		System.out.println("Branch Name : "+ bank.getBranchName());
		System.out.println("Bank IFSC code : "+ bank.getIfscCode());
		System.out.println("Bank Manager Name : "+ bank.getManagerName());
		System.out.println("Number of Workers : "+ bank.getNoOfWorkers());
		System.out.println("Is Bank Open : "+ bank.getIsBankOpen());
	}
}