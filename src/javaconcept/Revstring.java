package javaconcept;
import java.util.Arrays;
public class Revstring {
	public static void main (String[] args) {
		String su="java programming language ";
		Revstring r=new Revstring();
		System.out.println(r.revWord(su));
	}
String res(String st) {
	String res="";
		for(int i=0;i<st.length();i++) {
			char ch =st.charAt(i);
			res=ch+res;
		}
		return res;
	}
	String revWord(String st) {
		String stArr[]=st.split(" ");
		System.out.println(Arrays.toString(stArr));
		String ret="";
		for(String s:stArr) {
			ret=ret+res(s)+" ";
		}
		return ret.trim();
	}

}