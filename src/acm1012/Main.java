package acm1012;

import java.text.DecimalFormat;//Accepted


public class Main {
	DecimalFormat df1=new DecimalFormat("#0.000000000");
	  public void E() { 
      System.out.println("n e");
      System.out.println("- -----------");
		  System.out.println(0+" "+1); 
	   System.out.println(1+" "+2);
	   System.out.println(2+" "+2.5); 
	    double e=2.5;
	  for(int i=3;i<=9;i++)
	  {
		
	  e+= (double)(1.0/s(i)) ; 
	 
	  System.out.println(i+" "+df1.format(e));
	  }
	  
	
	  }
	 
	
	public int s(int i) {
		int sum=1;
     for(int j=1;j<=i;j++) {
		sum=sum*j;
	}
     
     return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();

ma.E();
	}

}
