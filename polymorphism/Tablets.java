class Tablets
    {
    static String[] color;
	static String typeOftablet;
	static int  weight;
	static double height;
	static int width;
	static String chemical;
	static int noOfTablets;
	static int tabletCost;
	static String Company;
	static int Strength;
	static String effects;
	static String brand;
	static String treatment;
	static int storage;
	static String Class;
	static String packet;
	static String quality;
	
	static void printDetails()
	{
    System.out.println(color);
	System.out.println(typeOftablet);
	System.out.println(weight);
	System.out.println(height);
    System.out.println(width);
	System.out.println(chemical);
	System.out.println(noOfTablets);
	System.out.println(tabletCost);
	System.out.println(Company);
	System.out.println(Strength);
	System.out.println(effects);
	System.out.println(brand);
	System.out.println(treatment);
	System.out.println(storage);
	System.out.println(Class);
	System.out.println(packet);
	System.out.println(quality);
 
    if(color!=null)
	{
    System.out.println("Array is pointing to the memory");
	for(int index=0;index<color.length;index++)
	{
	String ref=color[index];
	System.out.println(ref+"color");
	}
		  
	}	 

	}
    }