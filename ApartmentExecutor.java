class ApartmentExecutor
{
	public static void main (String a[]){
		//new
		//Creating ,ultiple no class
		//ClassName reference = new ClassName();
		Apartment apartment = new Apartment();
		
		apartment.apartmentId=1;
		apartment.apartmentName="Prestige";
		apartment.apartmentLocation="Whitefield";
		apartment.noOfFloors=45;
		apartment.noOfTwoBHKFlats=180;
		apartment.noOfThreeBHKFlats=90;
		
		System.out.println("-------------------------------------------------\n");
		System.out.println("ApartmentId is "+apartment.apartmentId);
		System.out.println("ApartmentName is "+apartment.apartmentName);
		System.out.println("Appartment LOACTION"+apartment.apartmentLocation);
		System.out.println("Apartmentno.OfFloors is "+apartment.noOfFloors);
		System.out.println("Apartmentno.OfTwoBHKFlats is "+apartment.noOfTwoBHKFlats);
		System.out.println("Apartmentno.OfThreeBHKFlats is "+apartment.noOfThreeBHKFlats);
		System.out.println("-------------------------------------------------\n");
		
		apartment.provideAccomodation();
		
		System.out.println("");
		
		Apartment apartment1 = new Apartment();
		
		apartment1.apartmentId=2;
		apartment1.apartmentName="Prestige";
		apartment1.apartmentLocation="JPNagar";
		apartment1.noOfFloors=56;
		apartment1.noOfTwoBHKFlats=250;
		apartment1.noOfThreeBHKFlats=100;
		
		System.out.println("-------------------------------------------------\n");
		System.out.println("Apartment1Id is "+apartment1.apartmentId);
		System.out.println("Apartment1Name is "+apartment1.apartmentName);
		System.out.println("Appartment LOACTION"+apartment1.apartmentLocation);
		System.out.println("Apartment1no.OfFloors is "+apartment1.noOfFloors);
		System.out.println("Apartment1no.OfTwoBHKFlats is "+apartment1.noOfTwoBHKFlats);
		System.out.println("Apartment1no.OfThreeBHKFlats is "+apartment1.noOfThreeBHKFlats);
		System.out.println("-------------------------------------------------\n");
		
	apartment1.provideAccomodation();
	}
}
