package acm2087;//Accepted

import java.util.Scanner;

public class Main {
public void S() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String all=sc.next();
		if(all.compareTo("#")==0) {
			break;
		}
		String mark=sc.next();
		int len=mark.length();
           int flag=0;
           int count=0;
      while(flag!=all.length()) {
	      if(all.charAt(flag)==mark.charAt(0)) {
	    	  String temp=all.substring(flag, flag+len);
	    	  if(temp.compareTo(mark)==0) {
	    		  count++;
	    		  flag=flag+len;
	    	      }
	    	  else flag++;
	          }
	      else flag++;
        }
      System.out.println(count);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.S();
	}

}
