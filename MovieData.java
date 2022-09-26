class MovieData{

   static int position=0; 
   static String[] movieName={null,null,null,null,null};


   static void save(String watching)
   {
   
       System.out.println("movie start agide ");
	   
	   movieName[position]=watching;
	   
	   System.out.println("movie mugitu"+position+movieName[position]);
	   position++;
   }
    static void displayDetails()
	{	
           
	   System.out.println("showing details");
	   for(int i=0;i<movieName.length;i++)
	   {
		   System.out.println("movie name:"+movieName[i]); 	   		  
		
	   }	   	   
     
	}
 }