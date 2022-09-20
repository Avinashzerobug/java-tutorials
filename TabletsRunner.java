class TabletsRunner{

 public static void main(String[] Dolo)
 {
   Tablets.printDetails();
   
   System.out.println("*********************************************");
   
   String[] color1={"Blue","Green","Orange","Yellow","Purple","Brown","Gray","Red","Maroon","Violet","Charcol","Bronze","gold","Silver","Pink"};
   Tablets.typeOftablet="Dolo";
   Tablets.weight=2;
   Tablets.height=1; 
   Tablets.width=3;
   Tablets.chemical="Acetaminophen";
   Tablets.noOfTablets=15;
   Tablets.tabletCost=40;
   Tablets.Company="Micro labs ltd";
   Tablets.Strength=650;
   Tablets.effects="vomiting";
   Tablets.brand="Dolo";
   Tablets.treatment="Fever";
   Tablets.storage=25;
   Tablets.Class="Analgesic";
   Tablets.packet="Recycled";
   Tablets.quality="MicroLabs";
   
   System.out.println("*********************************************");
	  
   Tablets.color=color1;
   Tablets.printDetails();
   }
   


}