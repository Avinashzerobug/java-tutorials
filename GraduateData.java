class GraduateData{

 static String[] Degree={null,null,null,null,null};
 static int position=0;

  static void  pass(String subject)
  {
   System.out.println("printing food items ");
	   
	   Degree[position]=subject;
	   System.out.println(position+Degree[position]);
	   position++;
	  
   }
    static void displayDetails()
	{	
           
	   System.out.println("showing details");
	   for(int i=0;i<Degree.length;i++)
	   {
		   System.out.println("Degree:"+Degree[i]);	   		  
		
	   }	   	   
     
	}
 
 }
