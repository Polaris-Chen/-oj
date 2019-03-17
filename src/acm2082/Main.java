package acm2082;//Accepted
//https://blog.csdn.net/ten_sory/article/details/59483762
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 int T=sc.nextInt();
		 while(T>0){
			
			 int[] arr=new int[27];
			 for(int i=1;i<=26;i++) {
				arr[i]=sc.nextInt();
			 }
			 int Max=0;//Max为全部都用上的最大价值
			 for(int i=1;i<27;i++) {
				 Max+=i*arr[i];
			 }
			 int[] a=new int[Max+1];//最终的方案数组
			 a[0]=1;//这步重要 什么都不要 是一种方案
			 int[] b=new int[Max+1];//临时数组
			 
			//相当于把每个字母的可能的  次数i 都放到这个次数对应的a数组中的 i位置 
			 //这样全部遍历完后,i位置的值就是价值为i的方案数
			 //,最终得到一个方案数组
			 for(int i=1;i<=26;i++) {//共有几种字母
				 for(int j=0;j<=arr[i]&&j*arr[i]<=Max;j++) {//每个字母用几次
					 for(int k=0;k+j*i<=Max;k++) {//注意边界Max都要等于
						/*例如:
						 * b[7]=b[7]+a[1];就是7块的方案等于原来的7块方案加上 已知的 1块的方案,
						 * 因为比如这次用了 2个3块,
						 * 所以前面的1块方案纷纷进化为7块方案(只要加上这6块就是7块方案)
						 * 也就是说前面的1块的方案在这里全都可行
						 */
						 b[k+j*i]+=a[k];
					 }
				 }
				 for(int k=0;k<=Max;k++) {
					 a[k]=b[k];//把这次的结果赋给最终数组
					 b[k]=0;
				 }
			 }
			 int count=0;
			 for(int i=1;i<51;i++) {
				 count+=a[i];
				 //System.out.println(count);
				 if(i+1>Max||a[i+1]==0) {
					 break;
				 }
			 }
			 System.out.println(count);
			 T--;
		 }
	}

}
