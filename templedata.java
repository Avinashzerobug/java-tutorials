class templedata{

   static String[] templeName={null,null,null,null,null};
   static int position=0; 

   static void templedata1(String pooje)
   {
   
       System.out.println("pooje nadita ede ");
	   
	   templeName[position]=pooje;
	   System.out.println("pooje mugitu"+position+templeName[position]);
	   position++;
   }
    static void displayDetails()
	{	
           
	   System.out.println("showing details");
	   for(int index=0;index<templeName.length;index++)
	   {
		   System.out.println("temple name:"+templeName[index]);	   		  
		
	   }	   	   
     
	}
 }