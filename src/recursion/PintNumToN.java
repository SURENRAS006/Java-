package recursion;
public class PintNumToN{
	void forward (int n) {
		if(n==1) {
			System.out.println(n);                                                                            return;}System.out.println(n);forward(n-1);}public static void main(String[] args) {PintNumToN p=new PintNumToN();p.forward(5);}}