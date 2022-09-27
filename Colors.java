class Colors{

  static String[] holi={null,null,null,null,null,null,null};
  static int position=0;

  static void holi(String letsPlayHoli)
  {
	  if(letsPlayHoli!=null && letsPlayHoli.length()>1)
	  {
	  if(position>=7)
	  {
	  System.out.println("adding colors");
	  return;
	  }
	  System.out.println("Writing the rainbow colors");
	  System.out.println("**********************");
	  holi[position]=letsPlayHoli;
	  System.out.println(position+holi[position]);
	  position++;
	  System.out.println("**********************");
	  System.out.println("Exit from the rainbow colors");
	  }
	  else
	  {
	  System.out.println("Rainbow colors are exist  here"+letsPlayHoli);
	  }
	  
  }

  static void displayDetails()
      {
	  for(int i=0;i<holi.length;i++)
	  {
	  System.out.println("colors:"+holi[i]);
	  }
  }
  static boolean checkingColor(String color)
  {
      for(int i=0;i<holi.length;i++)
	  {
	  if(holi[i]==color)	 
	  System.out.println("color is found:");
	  return true;
  } 			
	  return false;		
	 
		
  }
    
}