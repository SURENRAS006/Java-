package javaconcept;
import java.util.Arrays;
public class Unique {
	    void bubbleSort(int arr[]) {
	        for(int i = 0; i < arr.length - 1; i++) {
	            for(int j = i + 1; j < arr.length; j++) {
	                if (arr[i] > arr[j]) {
	                    int temp = arr[i];
	                    arr[i] = arr[j];
	                    arr[j] = temp;
	                }
	            }
	        }
	    }
	    public static void main(String[] args) {
	        Sorting r = new Sorting();
	        int arr[] = {5, 7, 12, 10, 9, 7, 12, 1, 1};
	        System.out.println( Arrays.toString(arr));
	        r.bubbleSort(arr);
	        System.out.println("Unique elements:");
	        for (int i = 0; i < arr.length; i++) {
	            if ((i == 0 || arr[i] != arr[i - 1]) && 
	                (i == arr.length - 1 || arr[i] != arr[i + 1])) {
	                System.out.println(arr[i]);
	            }
	        }
	    }
	}


