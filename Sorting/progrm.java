package Sorting;
public class progrm {
public static void main(String[] args) {
	int arr[]= {9,6,5,1};
	int change[]=new int[5];
	int amount=11;
	int count=0;
	for(int i=0;i<=arr.length-1;i++) {		
		int num=amount/arr[i];
		count=num+count;
		amount=amount%arr[i];
		System.out.println("Using "+arr[i]+" time "+num );		
	}	
	System.out.println("Total change = "+ count);	
}
}