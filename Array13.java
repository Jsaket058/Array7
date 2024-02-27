import java.util.*;
class Array13{
	void allZeroAppend(int arr[]){
		ArrayList<Integer> temp=new ArrayList<>();
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0)temp.add(arr[i]);
		}
		Arrays.fill(arr,0);
		for(int i=0;i<temp.size();i++){
			arr[i]=temp.get(i);
		}
	}
}
class Run{
	public static void main(String[] args){
		Array13 a=new Array13();
		int x[]={4,5,0,2,0,8,4,5,60,0,0,3};
		a.allZeroAppend(x);
		for(int i:x){
			System.out.println(i);
		}
}
}