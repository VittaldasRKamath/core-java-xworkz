class RailwayExecutor{
	public static void main(String rails[]){
		Railway railway=new Railway();
		railway.setRailwayId(20321);
		railway.setRailwayName("Karwar Express");
		railway.setStationMaster("Vittaldas R Kamath");
		railway.setNoOfPlatform(3);
		railway.setTicketCounter(5);
		railway.setNoOfWorkers(797);
		
		System.out.println("Railway Id : "+railway.getRailwayId());
		System.out.println("Railway Name : "+railway.getRailwayName());
		System.out.println("Station Master Name : "+railway.getStationMaster());
		System.out.println("Number of Platform : "+railway.getNoOfPlatform());
		System.out.println("Railway ticket Counter : "+railway.getTicketCounter());
		System.out.println("Number of Workers : "+railway.getNoOfWorkers());
		
	}
}