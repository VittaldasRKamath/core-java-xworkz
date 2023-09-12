class Liquid{
	//private variable
	static String volume="Fixed Volume";
	static  String compression="Averagely Compressed";
	static String density="Low density";
	static  String intermolecularForceOfAttraction="Weaker than Solids";
	
	public void getFeatures()
	{
		System.out.println("The Volume of liquid  is :" +volume);
		System.out.println("The Compression of liquid is :" +compression);
		System.out.println("The Density of liquid  is :" +density);
		System.out.println("The Intermolecular Force of Attraction of liquid is :" +intermolecularForceOfAttraction);
	}
}