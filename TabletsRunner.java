class TabletsRunner{

 public static void main(String[] Dolo)
 {
   Tablets.printDetails();
   
   System.out.println("*********************************************");
   
 
 
String[] color1={"Blue","Green","Orange","Yellow","Purple","Brown","Gray","Red","Maroon","Violet","Charcol","Bronze","gold","Silver","Pink"};
 String[] chemical1={"acetic anhydride", "acetone", "diethyl ether"," benzyl chloride"," toluene"," hydrochloric acid"," Botulinum","Cyanide","Arsenic","Strychnine","Carbon Tetraklorida"};
 int[] noOfCompanies1={8,7,5,9,2,4,33,66,2,6,3,2,5,};
 String[] countrySupply1={"USA","Russia","Japan","Isreal","Ukraine","Bangladesh","Austrailia","Shrilanka","Nepal","Maymnar","Philippenes","England","Saudi Arabia"};
int[] supplyCompanies1={22,55,19,33,55,77,44,77,11,22,14,4,78};
 String[] productionInKarnataka1={"Bagalkot","Bangalore","Hubli","Tumkur","Belagavi","Vijayapur","Shivmogga","Mangalore","Ballari","Kalburgi","Dharwad"};
double[] contentOfChemicals1={1.2,1.0,3.2,2.5,5.5,25.5,12.5,0.9,1.1,36.4,14,13.5};
 String[] typeOfMachineUsed1={"Mixing","Cleaning","containing","Producing","Storing","Testing","Transporting","Analysing","Adding","Stamping the bill","Storing cold in climate"};
 int[] weight1={2,1,5,3,0,1,3,4,6,4,6,3,6,};
 String[] effects1={"Stomach pain","Indigestion","Malaise","Diffuse pain","Nausea","Vomiting","Dizzness","Diarrhoea","Drowsiness"};
 String[] guideLines1={"take madicine with small amount of water","read prescribed","dont take over dose","take advise from doctor"};
String[]  noOfTablets1={"Tablet","Capsule","Granules","Sachet","Lozenges","Pill","Inhaler","Powder","Chewable Tablets"};
  
  
   Tablets.color=color1;
    Tablets.chemical=chemical1;
	 Tablets.noOfCompanies=noOfCompanies1;
	  Tablets.countrySupply=countrySupply1;
	   Tablets.supplyCompanies=supplyCompanies1;
	    Tablets.productionInKarnataka=productionInKarnataka1;
		 Tablets.contentOfChemicals=contentOfChemicals1;
		  Tablets.typeOfMachineUsed=typeOfMachineUsed1;
		   Tablets.weight=weight1;
		    Tablets.effects=effects1;
			 Tablets.guideLines=guideLines1;
			  Tablets.noOfTablets=noOfTablets1;
   Tablets.printDetails();
   }
   


}