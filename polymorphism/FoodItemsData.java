class FoodItemsData{

 static String[] foods={null,null,null,null,null};
 static int position=0;
 
 static void letseat(String eating)
 
      {
   
       System.out.println("printing food items ");
	   
	   foods[position]=eating;
	   System.out.println(position+foods[position]);
	   position++;
	  
   }
    static void displayDetails()
	{	
           
	   System.out.println("showing details");
	   for(int i=0;i<=foods.length;i++);
	   {
		   System.out.println("foods:"+foods[position]);	   		  
		
	   }	   	   
     
	}
 
 }


