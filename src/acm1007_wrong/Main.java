package acm1007_wrong;
import java.util.*;//time³¬¹ý
//import java.math.*;
import java.text.DecimalFormat;
public class Main {
	DecimalFormat df1=new DecimalFormat("#0.00");
	Scanner sc=new Scanner(System.in);
public void q() {

	while(sc.hasNext()) {
		double min=Double.MAX_VALUE;
		int s=sc.nextInt();
	double[][]	nums=new double[s][2];
	for(int i=0;i<s;i++) {
	nums[i][0]=sc.nextDouble();
	nums[i][1]=sc.nextDouble();
	}

    for(int i=0;i<s;i++) {
    	
    	double x1=nums[i][0];
    	double y1=nums[i][1];
    	for(int j=0;j<s;j++) {
    		if(j==i)continue;
    		double distance=Double.MAX_VALUE;
    		double x2=nums[j][0];
        	double y2=nums[j][1];
        	distance=Math.sqrt(((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
        	//System.out.println(distance);
        	if(distance<min) {
        		min=distance;
        		
        	}
        	
    	}
    }


	System.out.println(df1.format(min/2));
	
	}

}

	public static void main(String args[]) {
	Main a=new Main();
	a.q();

	}

}
