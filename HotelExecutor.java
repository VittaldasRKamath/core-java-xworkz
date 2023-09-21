class HotelExecutor{
	
	public static void main(String[] ottp){
		
	TajHotel	hotel=new TajHotel();
	hotel.foodName("Mushroom Dum Biryani");
	hotel.foodName("Neer Dosa");
	hotel.foodName("Ragi Mudde");
	hotel.foodName("Gobi Munchurian");
	hotel.foodName("Puliyogare");
	hotel.foodName("Chitranna");
	hotel.foodName("Jolada Roti");
	hotel.foodName("Butter Tikka");
	hotel.foodName("Paneer Biryani Masala");
	//hotel.foodName("Mushroom Biryani");
	//hotel.foodName("Rice");
	//hotel.foodName("Mushroom Dum Biryani");
	hotel.foodName("Veg Fried Rice");	
	System.out.println("/n");
	hotel.getDisplay();
	
	hotel.searchFoodName("Jolada Roti");
	
	hotel.deleteNamesFood("Jolada Roti");
	
	}
}