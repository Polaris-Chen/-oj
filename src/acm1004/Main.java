package acm1004;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
				while(sc.hasNext()) {
			int nums=sc.nextInt();
			if(nums==0) 
				break;
			nums++;
			String[] s=new String[nums];
			
		
			int maxnums=-1;
			int maxpos=0;
			 for(int j=0;j<nums;j++) {
				 s[j]=sc.nextLine();/*nextLine()方法碰到回车结束输出
				 将回车前的所有数据存入程序,碰到倒数第二个时,我输完颜色 打入回车
				 系统将回车前的所有字符输入,留下了回车,最后一次时就把回车当做输入,
				 直接结束,所以需要在数组最后多加一个空,多循环一次,把最后一次给空位置
				                     
				                     
          next方法不能得到带空字符()空格,回车,tab的字符串。
				 */
				 int max=0;
				 for(int k=0;k<j;k++) {
					//max=0 错误在于重置max的位置错了 这样只会输出第一次重复的颜色
					 if(s[j].equals(s[k])){
						 max++;
					 }
					if(max>maxnums) {
						maxnums=max;
						maxpos=j;
					}
				 }
			 }
		System.out.println(s[maxpos]);	 
		}
	sc.close();			}
	
	//Accepted
	}


