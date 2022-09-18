class Vehicle
{
  static double Truck(int noofvehicle,String destiantion)
  {
       System.out.println("Transporting the goods");
	   if(noofvehicle==500)
	{
	   System.out.println("vehicle are secured");
	   return 0.0d;
	}
	   return 007d;	
  }
  
  
  static double Truck(int noOfVehicle1,String destination1,int checkTime)
  {
       if(noOfVehicle1==500)
    {
	   System.out.println("chaging the vehicle module");
	   return 0.1d;
    }
       if(checkTime==9)
    {
	   System.out.println("delivered on time");
	   return 0.0d;
    }
       return 008d;
  }

  static boolean Truck(String destination2,String noOfVehicles,int num)
  {
	   if(destination2=="WTC centre")
	 {
	   System.out.println("package is delivered");
	   return true;
	 }
	   if(0000011111<=1)
	 {
	   System.out.println("driver phone num");
	   return true;
	 }
       return false;
  }
 
  static boolean Truck(double time,String destination3 )
  {
	   if(destination3=="ladakh")
	 {
	   System.out.println("new destination is initiated");
	   return true;
	 }
	   return false;
  }
   
  static boolean Truck(int ontime)
  {
	   if(ontime>=10)
	 {
	   System.out.println("package is safely delivered");
	   return true;
	 }
	   return false;
  }
}
