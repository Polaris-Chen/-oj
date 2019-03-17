package acm2018;//抄的别人的代码
import java.util.Scanner;//就是数学题

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long[] a = new long[54];//数组大，用long，因为0<n<54，所以定义一个长度为54的数组。
		a[1] = 1;
		a[2] = 2;
		a[3] = 3;
		a[4] = 4;
		for (int i = 5; i < 54; i++) {
			a[i] = a[i - 1] + a[i - 3];//找规律，前四年一直都是老牛在生娃，
			//到第五年开始才有新牛开始繁衍，则第n年的牛数量为第n-1年的牛的数量加上第n-3年的新牛繁衍量。
		}
		while (sc.hasNext()) {
			int n = sc.nextInt();
			if (n == 0) {
				break;//当n==0时，跳出。
			}
			System.out.println(a[n]);//输出第n年的牛数量。
		}

	}

}
