package stringtheorypackage;
import java.util.Calendar;

public class StringTheory {
	
	public static void main(String[] args) {
		String str = "320";
		String str1 = "Bibbety";
		String str2 = "Boppity";
		String str3 = "Boo";
		String str4 = "BIBBETY";
		String pstr1 = str1.replace("b", "p");
		String reducedstr2 = str2.substring(3);
		String Uppercasedstr3 = str3.toUpperCase();
		int estr4 = str4.indexOf("e");
		int myInt1 = Integer.parseInt(str);
		// on to calender
		Calendar a = Calendar.getInstance();
		
		System.out.println("Bibbety equals BIBBETY?: " + str1.equals(str4));
		System.out.println("Bibbety plus Boppity is " + (str1 + str2));
		System.out.println(str1);
		System.out.println(pstr1);
		System.out.println(reducedstr2);
		System.out.println(Uppercasedstr3);
		//time
		 System.out.println("The Current Date is:" + a.getTime()); 
		 System.out.println(myInt1);
		 System.out.println(estr4);
}
}