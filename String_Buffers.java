package projects_java;
/*
 *  WELCOME  -->> WeLCoMe    only those variable change with present in aeiou with lower case
 */
public class String_Buffers {

	public static void main(String[] args) {
		
		Change.action("WELCOME");
		Change.action("sdfdskhfSDFJEFWEIPEOCsdfjsdkfefewpp;['");

	}

}

class Change{
	
	String str;
	public static void action(String str) {
		// convert string into string buffer for change value
		StringBuffer sb = new StringBuffer(); 
		
		for(int i =0;i<str.length();i++) {    // to get operate every single character 
			String str2 = null;  // initialize for get character add in string
	
	// to check the conditions 
			if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				
				StringBuffer sb2 = new StringBuffer();
				
				str2 = sb2.append(str.charAt(i)).toString().toLowerCase();
				
				sb.append(str2);	
			}
			else {
				sb.append(str.charAt(i));
			}
		}
	       System.out.println(sb);	
	       
	       
	       String strr = null;
	       String strr1 = "sd";
	       System.out.println(strr.concat(strr1));
	}
	
}
