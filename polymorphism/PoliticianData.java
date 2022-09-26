class PoliticianData{

   static String[] politicianName={null,null,null,null,null};
   static int position=0;  

   static void PoliticianData1(String vote)
   {
   
       System.out.println("printing politician names ");
	   
	   politicianName[position]=vote;
	   
	   System.out.println(position+politicianName[position]);
	   position++;
   }
    static void displayDetails()
	{	
           
	   System.out.println("showing details");
	   for(int i=0;i<politicianName.length;i++)
	   {
		   System.out.println("politicianName:"+politicianName[i]);	   		  
		
	   }	   	   
     
	}
 }