package javaconcept;
import java.util.Arrays;
public class Sorting { 
  void bubbleSort(int arr[]) {
	  for(int i=0;i<arr.length-1;i++) {
		  for(int j=i+1;j<arr.length;j++) {
			  if (arr[i]>arr[j]) {
			  int temp =arr[i];
			  arr[i]=arr[j];
			  arr[j]=temp;
			  }
		  }
	  }
	  System.out.println(Arrays.toString(arr));
	  }
 public static void main(String[] args) {
	Sorting r=new Sorting();
	int arr[]= {5,7,12,10,9,7,12,1,1};
	int dist[]=new int [arr.length];
	int ind =0;
	System.out.println(Arrays.toString(arr));
	r.bubbleSort(arr);
	System.out.println(Arrays.toString(arr));
	for (int i=0;i<arr.length-1;i++) {
		if (arr[i]!=arr[i+1]) {
			System.out.println(arr[i]);
		}
		
		if(i==arr.length-1) {
			System.out.println(arr[i+1]);
		}
	}
}
 }
