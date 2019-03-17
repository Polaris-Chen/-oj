package acm2072_HashSet;//Accepted

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	
public void zhufangfa() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		String a=sc.nextLine();
		if(a.equals("#")) {
			break;
		}
		String[] arr=a.split(" ");
	
		Set<String> s=new HashSet<String>();
	
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i].compareTo("")==0) {
				continue;
			}
			s.add(arr[i]);
		}
	
		System.out.println(s.size());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.zhufangfa();
	}

}

