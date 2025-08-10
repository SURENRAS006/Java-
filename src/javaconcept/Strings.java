package javaconcept;
import java.util.*;
public class Strings {
	public static void main(String[] args) {
		String st ="SuRenRA";
		String res="";
		for (int i=0;i<st.length();i++) {
			char ch =st.charAt(i);
			if (ch>=65 && ch<=90 ) {
				ch =(char)(ch+32);
			}
			else if (ch>97 && ch<=122) {
				ch=(char)(ch-32);
			}
			res=res+ch;
		}
		System.out.println(res);
	}
}
