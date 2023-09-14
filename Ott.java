class Ott{
     String movieName [] = new String [4];
	 int index ;
	 public boolean addMovies(String names){
	        boolean isAdded = false;
			if( movieName!= null){
			   movieName[index]=names;
			   index++;  
               isAdded = true;			   
			}
			return isAdded;
	}
	 public void getDetails(){
	 System.out.println("The movies in the list are : ");
	     for(index=0;index<movieName.length;index++){
		 System.out.println(movieName[index]+ " is added to the playlist"); 
	    }
	 }
}