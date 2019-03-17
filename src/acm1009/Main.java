package acm1009;
//Accepted!!!  问题在于没考虑所携带的猫食大于总需求的猫食的情况
//import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
public void q() {
	//DecimalFormat df1=new DecimalFormat("#0.000");
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		//sc.nextLine();
			
			//  if(sc.nextLine().equals("/n")) { break; }
			 
		String arr1[]=sc.nextLine().split("\\s+");
		
		//System.out.println(arr1[0]);
		if(Integer.parseInt(arr1[0])==-1&&Integer.parseInt(arr1[1])==-1) {
			break;
		}
			
			/*
			 * if(arr1[0].equals("-1")&&arr1[1].equals("-1")) { //sc.nextLine(); break; }
			 */
			 
		
		
		double javaBean=0;
	int nums_catFood=Integer.parseInt((arr1[0]));
	int nums_room=Integer.parseInt((arr1[1]));
	//System.out.println(nums_catFood);
	
	int[] J=new int[nums_room];
	int[] F=new int[nums_room];
	float[] JdF=new float[nums_room];
	for(int i=0;i<nums_room;i++) {
		String arr2[]=sc.nextLine().split("\\s+");
		J[i]=Integer.parseInt(arr2[0]);
		F[i]=Integer.parseInt(arr2[1]);
	}
	
	for(int j=0;j<nums_room;j++) {
		JdF[j]=(float)J[j]/F[j];
		//System.out.println(JdF[j]);
	}
	while(nums_catFood>0) {
		double max=0;
		int max_i=0;
		for(int s=0;s<nums_room;s++) {
			if(max<JdF[s]) {
				max=JdF[s];
				max_i=s;
				
				}
		}
		if(max==0) {break;}
		if(nums_catFood<F[max_i]) {
			//System.out.println(JdF[max_i]);
			javaBean+=nums_catFood*JdF[max_i];
			nums_catFood=0;
			//System.out.println(javaBean);
		}
		else {
			javaBean+=J[max_i];
			nums_catFood=nums_catFood-F[max_i];
			//System.out.println(javaBean);
		}
		JdF[max_i]=0;}
	//sc.nextLine();
	System.out.println(String.format("%.3f",javaBean));
	sc.close();
}
	
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main s=new Main();
s.q();
	}

}
