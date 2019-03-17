package acm2057;
//先把两个十六进制的都转换成十进制 再相加 在转换为16进制
//改的太复杂了 ,明天写的简洁一点
import java.util.Scanner;
//java内置的太屌了 a.nextInt(int i)这里的i是基数 i=16就是把输入的16进制数转化为long型的10进制数
//System.out.format("%X", sum); %X就是把10进制数输出为16进制 太强了!!!!
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
			
		 while(sc.hasNext()) {
			 long a=sc.nextLong(16);
			 long b=sc.nextLong(16);
		
			 long sum=a+b;
			 if(sum>=0) {
			 System.out.format("%X",sum);
			 }
		 else {
			 sum=-sum;
			 System.out.print("-");
			 System.out.format("%X", sum);
		 }
			 System.out.println();
	}
	}
}