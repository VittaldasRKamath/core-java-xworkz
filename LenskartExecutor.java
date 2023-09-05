class LenskartExecutor
{
	public static void main (String a[]){
		//new
		//Creating ,ultiple no class
		//ClassName reference = new ClassName();
		Lenskart Lenskart = new Lenskart();
		
		Lenskart.LenskartId=12;
		Lenskart.LenskartName="Vittalas";
		Lenskart.LenskartLocation="Whitefield";
		Lenskart.noOfMaterial=18;
		Lenskart.noOfColour=50;
		Lenskart.noOfDesign=130;
		
		System.out.println("-------------------------------------------------\n");
		System.out.println("LenskartId is "+Lenskart.LenskartId);
		System.out.println("LenskartName is "+Lenskart.LenskartName);
		System.out.println("Lenskart Location"+Lenskart.LenskartLocation);
		System.out.println("Lenskartno.OfMaterial is "+Lenskart.noOfMaterial);
		System.out.println("Lenskartno.OfColour is "+Lenskart.noOfColour);
		System.out.println("Lenskartno.OfDesign is "+Lenskart.noOfDesign);
		System.out.println("-------------------------------------------------\n");
		
		Lenskart.provideVision();
		
		System.out.println("");
		
		Lenskart Lenskart1 = new Lenskart();
		
		Lenskart1.LenskartId=2;
		Lenskart1.LenskartName="Prestige";
		Lenskart1.LenskartLocation="JPNagar";
		Lenskart1.noOfMaterial=12;
		Lenskart1.noOfColour=35;
		Lenskart1.noOfDesign=100;
		
		System.out.println("-------------------------------------------------\n");
		System.out.println("Lenskart1Id is "+Lenskart1.LenskartId);
		System.out.println("Lenskart1Name is "+Lenskart1.LenskartName);
		System.out.println("Lenskart Location"+Lenskart1.LenskartLocation);
		System.out.println("Lenskart1no.OfMaterial is "+Lenskart1.noOfMaterial);
		System.out.println("Lenskart1no.OfColour is "+Lenskart1.noOfColour);
		System.out.println("Lenskart1no.OfDesign is "+Lenskart1.noOfDesign);
		System.out.println("-------------------------------------------------\n");
		
	Lenskart1.provideVision();
	}
}
