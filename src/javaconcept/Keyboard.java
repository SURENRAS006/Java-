package javaconcept;
import java.util.*;
public class Keyboard {
	boolean Keyboardverify (String st) {
		String stArr[]= {"qwertyuiopQWERTYUIOP","asdfghjklASDFGHJKL","zxcvbnmZXCVBNM"};
		char ch=st.charAt(0);
         int ind=-1;
         for(int i=0;i<stArr.length;i++) {
        	 if(stArr[i].indexOf(ch)>=0) {
        		 ind =i;
        		 break;
        		 }
		}
         for (int i=1;i<stArr.length;i++) {
        	 ch=st.charAt(i);
        	 if (stArr[ind].indexOf(ch)<0) {
        	
  
}
     		return false; 

         }
	return true;	
	}
}
