package recursion;

public class Factorial {
	//Factorial Using Loop
	int loop(int num) {
		int fact=1;
		for(int i=2;i<num;i++) {
			fact=fact*i;
		}
		return fact;
	}
	//Factorial Using recursion
		int rec(int num) {
			if(num==1) {
				return 1;
			}
			return num*rec(num-1);
		}
		public static void main(String[] args) {
			Factorial f=new Factorial();
			int num=5;
			System.out.println("bt loop: "+f.loop(num));
			System.out.println("bt recursion: "+f.rec(num));

		}
}
