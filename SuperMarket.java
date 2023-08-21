class SuperMarket{
	static String chocolates[] ={"Dairy Milks","Silk","Amul","Cadbury","Nestle","Parle","Toblerone","Ferrero","Campco","Lindit","Mar","Fabello","Lotus","Capico","Godiva"};
	
	static String perfumes[] ={"Fogg","Hugo","Aramis","Azzaro","Davidoff","Burberry","Clinique","Ck one","Prada","Dior","MCM","Sauvage","Pearl","Paco","Denver","Engage"};
	
	static String fruits[] ={"Banana","Apple","Pine Apple","Orange","Kiwi","Watermelon","Drangon Fruit","Jack Fruits","Kicku","Rampal","Strabery","Grapes","Cherry","Mango","Pomogranate"};
	
	static String vegetables[] ={"Tomoto","Onion", "Potato","beans","Brinjil","Chilly","Kukumbar","Pumkin","Cabbage","CaulyFlower","Peas","Carrot","Bitter Gaurd","Beetroot","Capsicum"};
	
	static String biscuit[] ={"Parle G","Barbon","50-50","Tiger","Marie Gold","Happy Happy","Britania","Dark Fantacy","Orio","Sunfeast","Unibic","Patanjali","Little Heart","Moms Magic","Good Day","Horlicks"};
	
    static String iceCream[] ={"Amul","Arun","kwality Walls","Nandini","Mother Dairy","Havmor","Cream Bell","Vadilal","Baskin","Robin","Gianis","Movenpick","Nitrogen","Dollops","Oh So Stoned"};

 
     static String groceries[] ={"Rice","Pasta","Bread","Eggs","Milk","Cheese","Meat","Chicken","Fish","Tamoto","Oil","Cereal","Peanuts","Floar","Fruit","Tea powder"};
	 
	 
	 static String snacks[] ={"Potato Chips","Banana Chips","Popcorn","TrailMix","Pretzels","Nuts","Cashews","Cookies","Jerky","Fups","Maggi","Sandwiches","Pizza","Frenc Fries","Energy Bars","Pasta"};
	 
	 public static void main(String mar[]){
		 
	 
	 getChocolates();
	 getreverseChocolates();
	 getPerfume();
	 getReversePerfume();
	 getFruits();
	 getReverseFruits();
	 getVegetables();
	 getReverseVegetables();
	 getBiscuit();
	 getReverseBiscuit();
	 getIcecream();
	 getReverseIcecream();
	 getGloceries();
	 getReverseGloceries();
	 getSnacks();
	 getReverseSnacks();
	 }
	 
	 public static void getChocolates() {
		
		 for(int choco =0; choco<chocolates.length; choco++){
		 System.out.println(chocolates[choco]);
		 }
	 }
	 
	 public static void getreverseChocolates() {
		 
		 for(int choco=chocolates.length-1; choco>=0; choco--){
			 System.out.println(chocolates[choco]);
		 }
	 }
	 public static void getPerfume(){
		 for(int per=0; per<perfumes.length;per++){
			 System.out.println(perfumes[per]);
		 }
	 }
	 
	 public static void getReversePerfume(){
		 for(int per=perfumes.length-1;per>=0;per--){
			 System.out.println(perfumes[per]);
		 }
	 }
	 
	 public static void getFruits(){
		 for(int fru=0; fru<fruits.length;fru++){
			 System.out.println(fruits[fru]);
		 }
	 }
	 
	 public static void getReverseFruits(){
		 for (int fru=fruits.length-1;fru>=0;fru--){
			 System.out.println(fruits[fru]);
		 }
	 }
	 
	 public static void getVegetables()
	 {
		 for(int veg=0;veg<vegetables.length;veg++){
			 System.out.println(vegetables[veg]);
		 }
	 }
	 
	 public static void getReverseVegetables(){
		 for(int veg=vegetables.length-1;veg>=0;veg--){
			 System.out.println(vegetables[veg]);
		 }
	 }
	 public static void getBiscuit(){
		 for(int bis=0;bis<biscuit.length;bis++){
			 System.out.println(biscuit[bis]);
		 }
	 }
	 public static void getReverseBiscuit(){
		 for(int bis =biscuit.length-1;bis>=0;bis--){
			 System.out.println(biscuit[bis]);
		 }
	 }
	 public static void getIcecream(){
		 for (int ice=0; ice<iceCream.length;ice++){
			 System.out.println(iceCream[ice]);
		 }
	 }
	 public static void getReverseIcecream(){
		 for(int ice=iceCream.length-1;ice>=0;ice--){
			 System.out.println(iceCream[ice]);
		 }
	 }
	 
	 public static void getGloceries(){
		 for (int glo=0;glo<groceries.length;glo++){
			 System.out.println(groceries[glo]);
		 }
	 }
	 public static void getReverseGloceries(){
		 for (int glo=groceries.length-1;glo>=0;glo--){
			 System.out.println(groceries[glo]);
		 }
	 }
	 
	 public static void getSnacks(){
		 for(int sna=0;sna<snacks.length;sna++){
			 System.out.println(snacks[sna]);
		 }
	 }
	 
	 public static void getReverseSnacks(){
		 for(int sna=snacks.length-1;sna>=0;sna--){
			 System.out.println(snacks[sna]);
		 }
	 }
	 
	 
	 
		 
}