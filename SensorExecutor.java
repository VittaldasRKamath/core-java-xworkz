class SensorExecutor{

    public static void main (String args[]){
	     
		 Sensor sens = new Sensor();
		 sens.type = "Light Sensor" ;
         sens.mount = "Wall Mount" ;
	     sens.range = "3 to 80cms";
         sens.cost = 35000 ;
         sens.temp = "-40 to 80";
		 
		 
		 System.out.println("-------------------------------------------------\n");
		 System.out.println("The type of sensor is : "+sens.type);
		 System.out.println("The mount type of sensor is : "+sens.mount);
		 System.out.println("The range of sensor is : "+sens.range);
		 System.out.println("The cost  of sensor is : "+sens.cost);
		 System.out.println("The temperature range of sensor is : "+sens.temp);
	     System.out.println("-------------------------------------------------\n");
		sens.details();
		 
		 Sensor sens1 = new Sensor();
		 sens1.type = "Motion Sensor" ;
         sens1.mount = "Floor Mount" ;
	     sens1.range = "30 to 100cms";
         sens1.cost = 84000 ;
         sens1.temp = "-20 to 60";
		 
		 System.out.println("-------------------------------------------------\n");
		 System.out.println("The type of sensor is : "+sens1.type);
		 System.out.println("The mount type of sensor is : "+sens1.mount);
		 System.out.println("The range of sensor is : "+sens1.range);
		 System.out.println("The cost  of sensor is : "+sens1.cost);
		 System.out.println("The temperature range of sensor is : "+sens1.temp);
		 System.out.println("-------------------------------------------------\n");
		 		sens1.details();

		 
		 Sensor sens2 = new Sensor();
		 sens2.type = "Light Sensor" ;
         sens2.mount = "Wall Mount" ;
	     sens2.range = "40 to 120cms";
         sens2.cost = 84000 ;
         sens2.temp = "-20 to 60";
		 
		 System.out.println("-------------------------------------------------\n");
		 System.out.println("The type of sensor is : "+sens2.type);
		 System.out.println("The mount type of sensor is : "+sens2.mount);
		 System.out.println("The range of sensor is : "+sens2.range);
		 System.out.println("The cost  of sensor is : "+sens2.cost);
		 System.out.println("The temperature range of sensor is : "+sens2.temp);
		 System.out.println("-------------------------------------------------\n");
		 
		 Sensor sens3 = new Sensor();
		 sens3.type = "Motion Sensor" ;
         sens3.mount = "Floor Mount" ;
	     sens3.range = "30 to 100cms";
         sens3.cost = 120000 ;
         sens3.temp = "-100 to 75";
		 
		 System.out.println("-------------------------------------------------\n");
		 System.out.println("The type of sensor is : "+sens3.type);
		 System.out.println("The mount type of sensor is : "+sens3.mount);
		 System.out.println("The range of sensor is : "+sens3.range);
		 System.out.println("The cost  of sensor is : "+sens3.cost);
		 System.out.println("The temperature range of sensor is : "+sens3.temp);
		 System.out.println("-------------------------------------------------\n");
		 
		 Sensor sens4 = new Sensor();
		 sens4.type = "PhotoElectric Sensor" ;
         sens4.mount = "Floor Mount" ;
	     sens4.range = "0 to 700cms";
         sens4.cost = 150000 ;
         sens4.temp = "-100 to 100";
		 
		 System.out.println("-------------------------------------------------\n");
		 System.out.println("The type of sensor is : "+sens4.type);
		 System.out.println("The mount type of sensor is : "+sens4.mount);
		 System.out.println("The range of sensor is : "+sens4.range);
		 System.out.println("The cost  of sensor is : "+sens4.cost);
		 System.out.println("The temperature range of sensor is : "+sens4.temp);
		 System.out.println("-------------------------------------------------\n");
		 
		 
	}
}