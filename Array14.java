import java.util.*;
class Array14{
	void allZeroAppend(int arr[]){
		int j=-1;
		for(int i=0;i<arr.length;i++){
		    if(arr[i]==0){
			j=i;
			break;
		    }
		}
		if(j==-1)return;
		for(int i=j+1;i<arr.length;i++){
			if(arr[i]!=0){
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
	}
}
class Run{
	public static void main(String[] args){
		Array14 a=new Array14();
		int x[]={4,5,0,2,0,8,4,5,60,0,0,3};
		a.allZeroAppend(x);
		for(int i:x){
			System.out.println(i);
		}
}
}