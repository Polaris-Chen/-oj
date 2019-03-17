package acm2064;

/*//动态规划成一个小问题，对于n个盘子的问题，就可以看成最下面的盘子和上面的n-1个盘子把n-1个盘子看成一个整体：

把n 个盘子从A间接移动到C  需要以下五步:
1. 把n - 1 个盘子间接从A 移到C     f(n - 1)
2. 把最大的盘子从A 移到B              1
3. 把n - 1 个盘子间接从C 移到A     f(n - 1)
4. 把最大的盘子从B 移到C               1
5. 把n - 1 个盘子间接从A 移到C     f(n - 1)
易得f(n) = 3 *　f(n - 1) + 2, f(1) = 2;
*/
import java.util.Scanner;

public class Main {
public void S() {
	Scanner sc=new Scanner(System.in);
	long[] arr=new long[40];
	arr[0]=0;arr[1]=2;arr[2]=8;
	for(int i=3;i<36;i++) {
		arr[i]=3*arr[i-1]+2;
	}
	while(sc.hasNext()) {
		int N=sc.nextInt();
		System.out.println(arr[N]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.S();
	}

}
