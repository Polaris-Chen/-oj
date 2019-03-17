package acm1006_wrong;
//wrong 精度不行
import  java.math.*;
import java.util.*;
import java.text.*;
public class Main {

	DecimalFormat df=new DecimalFormat("#.00000");
	DecimalFormat df1=new DecimalFormat("#.000");
 double  hourstep=Double.parseDouble(df.format((double)1/360));
 double minutestep=Double.parseDouble(df.format((double)1/60));
 
	public double s(double D) {
		/*hourstep=Double.parseDouble(df1.format(hourstep));
		minutestep=Double.parseDouble(df1.format(minutestep));
		*/System.out.println(minutestep);
		double hour=0.0000;
		double minute=0.000;
		double second=0.0000;
		double time=0.00;
		
		for(int i=0;i<43200;i++) {
			hour=Double.parseDouble(df.format((hour+(hourstep))%12));
			minute=Double.parseDouble(df.format((minute+(minutestep))%60));
			
			second=(second+1)%60;
			hour=Double.parseDouble(((df.format(hour))));
			minute=Double.parseDouble(df.format(minute));
		
			second=Double.parseDouble(df.format(second));
			
		
			if((Math.abs(hour*5-minute)*6)>D&&(Math.abs(hour*5-second)*6)>D
			&&(Math.abs(minute-second)*6)>D		){
	time++;			
	/*System.out.println(hour);
	System.out.println(minute);
	System.out.println(second);
		*/
			}
		}
		time=time/432;
		time=Double.parseDouble(df1.format(time));
		return time;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main q=new Main();
Scanner sc=new Scanner(System.in);
while(sc.hasNextDouble()) {
double D=sc.nextDouble();
if(D==-1) {break;}
System.out.println(q.s(D));
}
	}

}
