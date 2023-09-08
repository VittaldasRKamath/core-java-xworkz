class PassportExecutor {

    public static void main(String verify[]){
         Passport details1 =new Passport("Hassan","Vittaldas R","Kamath","25/01/2001","vittaaldaskamath25@gmail.com","Vrktheboss@162534","Vrktheboss@162534");
                                //constructor--same as method but with specilized method 
                                //same as className with no return type                   ;
         details1.passportOffice="Hassan";
         details1.givenName="Vittaldas R";
         details1.surName="Kamath";
         details1.dob="25/01/2001";
         details1.email="vittaldaskamath25@gmail.com";
         details1.password="Vrktheboss@162534";
         details1.confirmPassword="Vrktheboss@162534";
         details1.validatePassword(details1.password,details1.confirmPassword);
		 System.out.println("..................................................");
		 System.out.println("The Passport Office is "+details1.passportOffice);
		 System.out.println("The Given Name is "+details1.givenName);
		 System.out.println("The Surname is "+details1.surName);
		 System.out.println("The Date of Birth is "+details1.dob);
		 System.out.println("The Email is "+details1.email);
		 System.out.println("The Password is "+details1.password);
		 System.out.println("The Confirm Password is "+details1.confirmPassword);
		 		 System.out.println("..................................................");
        //  Passport.validatePassword(details1.password,details1.confirmPassword);
        }
}