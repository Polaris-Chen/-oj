package acm2056;//���ص�ʱֻҪ�����С����,�м������Ĳ�����ཻ���εı�  ���ĵ㲻һ��������� ����x1���ܴ���x2 
//����Ҫ����������֮�����Сֵ���ֵ

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public void S()  {
		 Scanner sc = new Scanner(System.in);
		 DecimalFormat df=new DecimalFormat("0.00");
		 while(sc.hasNext()) {
			 double[] arrX=new double[5];
			 double[] arrY=new double[5];
		 double x1=sc.nextDouble();
		 double y1=sc.nextDouble();
		 double x2=sc.nextDouble();
		 double y2=sc.nextDouble();
		 double x3=sc.nextDouble();
		 double y3=sc.nextDouble();
		 double x4=sc.nextDouble();
		 double y4=sc.nextDouble();
		 arrX[1]=x1;arrX[2]=x2;arrX[3]=x3;arrX[4]=x4;
		 arrY[1]=y1;arrY[2]=y2;arrY[3]=y3;arrY[4]=y4;
		 double luo = Math.min(y1, y2);
         double xiang = Math.max(y3, y4);

         double luo1 = Math.min(x1, x2);
         double xiang1 = Math.max(x3, x4);

         double luo3 = Math.max(y1, y2);
         double xiang3 = Math.min(y3, y4);

         double luo4 = Math.max(x1, x2);
         double xiang4 = Math.min(x3, x4);

         if (luo >= xiang || luo1 >= xiang1 || xiang3 >= luo3 || xiang4 >= luo4) {
             System.out.println("0.00");}
		 else {
			 Arrays.sort(arrX);
			 Arrays.sort(arrY);
			 double S=(arrX[3]-arrX[2])*(arrY[3]-arrY[2]);
			 System.out.println(df.format(S));
		 }
			
		     }
		 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main ma=new Main();
		ma.S();
	}

}
