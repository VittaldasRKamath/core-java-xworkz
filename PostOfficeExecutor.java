class PostOfficeExecutor {
    public static void main(String postoffice[]) {
        PostOffice postOffice = new PostOffice();
         postOffice.setPostOfficeId(1);
         postOffice.setPostOfficeName("Central Post Office");
         postOffice.setPostOfficeAddress("N R Circle");
         postOffice.setPostalCode("SCT993");
         postOffice.setManagerName("Vittaldas R Kamath");
         postOffice.setNumberOfEmployees(22);
		 
        System.out.println("Post Office ID: " + postOffice.getPostOfficeId());
        System.out.println("Post Office Name: " + postOffice.getPostOfficeName());
        System.out.println("Post Office Address: " + postOffice.getPostOfficeAddress());
        System.out.println("Postal Code: " + postOffice.getPostalCode());
        System.out.println("Manager Name: " + postOffice.getManagerName());
        System.out.println("Number of Employees: " + postOffice.getNumberOfEmployees());
    }
}