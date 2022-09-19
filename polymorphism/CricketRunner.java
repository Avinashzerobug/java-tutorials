class CricketRunner{

   public static void main (String[]  playbold)
   {
	  
	   System.out.println("Entering to the indian cricket team");
	   System.out.println("counting the no of players");
       String[] players={"MS Dhoni","Rohit sharma","Kohli","Dinesh karthik","Rishab pant","Bhumra","Shami","Jadeja","Hardik pandey","Bhuvaneshwar","Harbajan singh"};
       Cricket.Thirdumpire(players);
	  
	   System.out.println("Indian kabaddi players");
	   System.out.println("checking the jersey no");
       int[] jerseyNo={44,45,78,60,22,55,67};
       Cricket.Kabaddi(jerseyNo);
	  
       System.out.println("players salary");
	   System.out.println("checking the players salary");
       double[] salary={448885,4578484,787848,60878,2878742,57545,6737};
       Cricket.Football(salary);
	   
	   System.out.println("players mobile number");
	   System.out.println("verifying the players mobile numbere");
       long[] mobnum={4488852574L,4578484400L,7878482009L,6087800976L,2878742456L,5754521367L,6737000345L};
       Cricket.Ludo(mobnum);
	  
       System.out.println("couting the no of matches");
	   System.out.println("no of matches are verified");
       int[] noOfMatches={2,5,8,1,1,7,9};
       Cricket.Hockey(noOfMatches);
	  
	   System.out.println("checking the players alive or not");
	   System.out.println("proessing through medical condition");
       boolean[] dead={true,false};
       Cricket.lagori(dead);
	 
   }
   
}