class Cards{
	
	static String[] color;
	static String typeOfCards;
	static int  weight;
	static double height;
	static int width;
	
    static void printDetails()
 {
	System.out.println(color);
	System.out.println(typeOfCards);
	System.out.println(weight);
	System.out.println(height);
    System.out.println(width);
	if(color!=null)
	{
    System.out.println("Array is pointing to the memory");
	for(int index=0;index<color.length;index++)
		 {
			 String ref=color[index];
			  System.out.println(ref+"color");
		 }
		 else
		 {
			 System.out.println("Array is not pointing to the memory");
		 }
		 
		 
	 }
	 
	 
	 
 }	 
	 
	 
 }