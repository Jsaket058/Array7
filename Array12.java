import java.util.*;
class Array12{
	void allZeroAppend(int arr[]){
		int t=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0)t++;
		}
		int temp[]=new int[t+1];
		int j=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0)temp[j++]=arr[i];
		}
		Arrays.fill(arr,0);
		for(int i=0;i<=t;i++){
			arr[i]=temp[i];
		}
	}
}
class Run{
	public static void main(String[] args){
		Array12 a=new Array12();
		int x[]={4,5,0,2,0,8,4,5,60,0,0,3};
		a.allZeroAppend(x);
		for(int i:x){
			System.out.println(i);
		}
}
}