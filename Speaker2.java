class Speaker2
{
     static String speakerBrandName="GOVO";
     static boolean isConnected ;   //default boolean value "false" will print  by compiler ,boolean should be make it as static variable 
	  
     public static void main(String speaker[]){	  
	 System.out.println("main started");
	 System.out.println("......");
	 
	 System.out.println("speaker connection status");
	     isConnected=true;
	 System.out.println("is speaker connected " +isConnected);
	     isConnected=false;
	 System.out.println("is speaker connected " +isConnected);
	 System.out.println("main ended");
	 }
}