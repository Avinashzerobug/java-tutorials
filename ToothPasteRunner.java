class ToothPasteRunner{

  public static void main(String[]  DoBrushDaily)
  {
	
	  ToothPaste.setWater(60);
	  ToothPaste.setpurpose("To clean the teeth");
	  ToothPaste.setaction("Brushing");
	  ToothPaste.settypes(3);
	  ToothPaste.setfluoride("low");
	  ToothPaste.setbrand("Sensodyne");
	  ToothPaste.setcontents(17);
	  ToothPaste.setquantity(35.5);
	  ToothPaste.setcompany("Sensodyne");
	  ToothPaste.setchemical("Potassium ions");
	  ToothPaste.setflavour("sweet and salt");
	  ToothPaste.setprice(90);
	  ToothPaste.setcolour("White");
	  ToothPaste.setsize('S');
	  ToothPaste.setlogo("SENSODYNE");
	 
	  int ref1=ToothPaste.getWater();
	  System.out.println(ref1);
	 
	  String ref2=ToothPaste.getpurpose();
	  System.out.println(ref2);
		 
      String ref3=ToothPaste.getaction();
	  System.out.println(ref3);
		 
	  int ref4=ToothPaste.gettypes();
	  System.out.println(ref4);
	  
	  String ref5=ToothPaste.getfluoride();
	  System.out.println(ref5);
	   	  
	  String ref6=ToothPaste.getbrand();
	  System.out.println(ref6);
	  
      int ref7=ToothPaste.getcontents();	  
	  System.out.println(ref7);
	   
	  double ref8=ToothPaste.getquantity();	  
	  System.out.println(ref8);
	   
	  String ref9=ToothPaste.getcompany();
	  System.out.println(ref9);
	   
	  String ref10=ToothPaste.getchemical();
	  System.out.println(ref10);
		 
	  String ref11=ToothPaste.getflavour();
	  System.out.println(ref11);
		   
      int ref12=ToothPaste.getprice();
	  System.out.println(ref12);
		  
	  String ref13=ToothPaste.getcolour();
	  System.out.println(ref13);
			
	  char ref14=ToothPaste.getsize();
	  System.out.println(ref14);
			
	  String ref15=ToothPaste.getlogo();
	  System.out.println(ref15);			
	  
  }

}