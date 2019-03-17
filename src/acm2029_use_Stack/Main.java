package acm2029_use_Stack;//Accepted

import java.util.Scanner;

public class Main {
   private class Stack{
	   char[] arr;
	   int capacity;
	   int top;
	   public Stack(int capacity) {
		   this.capacity=capacity;
		   arr=new char[capacity];
	   }
	   public boolean isEmpty() {
		   return top==0;
	   }
	   public void push(char a) {
		  assert top<capacity;
		   arr[top]=a;
		   top++;
	   }
	   public char pop() {
		   assert !isEmpty();
		   char s= arr[top-1];
		   top--;
		   return s;
	   }
   }
   public void isBack() {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   String[] arr=new String[n];
	   for(int i=0;i<n;i++) {
		   arr[i]=sc.next();
	   }
	   for(int i=0;i<n;i++) {
		   boolean flag=false;
		   Stack S=new Stack(100);
		   for(int j=0;j<arr[i].length();j++) {
			   S.push(arr[i].charAt(j));
		   }
		   for(int k=0;k<arr[i].length();k++) {
			   if(arr[i].charAt(k)==S.pop()) {
				   flag=true;
			   }
			   else {
				   flag=false;
				   break;
			   }
		   }
		   if(flag) {
			   System.out.println("yes");
		   }
		   else System.out.println("no");
	   }
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main ma=new Main();
ma.isBack();
	}

}
