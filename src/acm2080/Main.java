package acm2080;//Accepted

import java.text.DecimalFormat;
import java.util.Scanner;



public class Main {
	public static double Angle(double x,double y) {
		double tan=y/x;
		//System.out.println(tan);
		double angle=Math.abs(Math.toDegrees(Math.atan(tan)));
		if(x<0&&y>0) {
			angle+=90;
		}
		else if(x<0&&y<=0) {
			angle+=180;
		}
		else if(x>0&&y<0) {
			angle+=240;
		}
		return angle;
		
	}
	public void zhufangfa() {
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.00");
		
		
		while(sc.hasNext()) {
			int n=sc.nextInt();
			double[][] arr=new double[n][4]; 
			for(int i=0;i<n;i++) {	
				arr[i][0]=sc.nextDouble();
				arr[i][1]=sc.nextDouble();
				arr[i][2]=sc.nextDouble();
				arr[i][3]=sc.nextDouble();
			}
			for(int i=0;i<n;i++) {
				double s=Angle(arr[i][0],arr[i][1])-Angle(arr[i][2],arr[i][3]);
				double a=Math.abs(s);
				if(a>180) {
					a=a-180;
				}
				System.out.println(df.format(a));
			}
		}
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		//System.out.println(Angle(4,0));
		ma.zhufangfa();
	}

}
