package acm2019;
import java.util.Scanner;

public class Main {
public void sort1() {
	Scanner sc=new Scanner(System.in);
	while(sc.hasNext()) {
		int n=sc.nextInt();
		int x=sc.nextInt();
		if(n==0&&x==0) {
			break;
		}
		int[] arr=new int[n+1];
		arr[n]=x;
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		//Arrays.sort(arr);
		mergesort(arr);
		for(int j=0;j<n+1;j++) {
			if(j==0) {
			System.out.print(arr[j]);
			}
			else System.out.print(" "+arr[j]);
		}
		System.out.println();
	}
}


public void mergesort(int[] arr) {//主函数
	int L=0;
	int R=arr.length-1;

	aux_mergesort(arr,L,R);
	
}
private void aux_mergesort(int[] arr,int L,int R) {
	int mid=(L+R)/2;
	if(L>=R) {return;}
	aux_mergesort(arr,L,mid);
	aux_mergesort(arr,mid+1,R);
	if(arr[mid]>arr[mid+1]) {
	merge(arr,L,mid,R);}//如果左边的最大还小于右边的最小,那就不需要排了,在原数组基本有序的情况下,这一步
	//可以大大提升效率
	
}
private void merge(int[] arr,int L,int mid,int R) {//归并函数
	int[] auxarr=new int[R-L+1];//辅助数组
		for(int q=L;q<R+1;q++) {
			auxarr[q-L]=arr[q];
		}//复制内容
		int i=L;
		int j=mid+1;
	for(int k=L;k<R+1;k++) {//判断原数组的第k个位置放哪个
		if(i>mid) {//判断是否超过半边
		arr[k]=auxarr[j-L];
		j++;
	    }
		else if(R<j) {
			arr[k]=auxarr[i-L];
			i++;
		}
		else if(auxarr[i-L]<auxarr[j-L]) {//谁大谁当arr[k]
			arr[k]=auxarr[i-L];
		i++;
		}
		else {
			arr[k]=auxarr[j-L];
			j++;
		}
	}
}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.sort1();
	}

}
