package Day2;
import java.util.*;
public class StringMethods {
	public static void main(String[] args) {
		System.out.print("STRING-LENGTH:");
		String name="JAVA PROGRAMMING!!!";
		System.out.println(name.length());//String length
		
		System.out.print("\nSUB-STRING!!\n");
		String str="JAVA PROGRAMMING!!!";
		System.out.println(str.substring(3));
		System.out.println(str.substring(0,4));//sub-string
		
		
		System.out.print("\nINDEX-OF!!\n");
		String s="JAVA PROGRAMMING!!!";
		System.out.println(s.indexOf("PROG"));
		System.out.println(s.indexOf("X"));//index-Of
		
		System.out.print("\n STRING-CASES!!\n");
		String S="JAVA PROGRAMMING!!!";
		System.out.println(S.toUpperCase());
		System.out.println(S.toLowerCase());//string-case conversion
		
		System.out.print("\nSTRING-REPLACE!!\n");
		String o="JAVA!!!";
		System.out.println(o.replace('A','a'));
		System.out.println(o.replace('V','v'));//string-replace
		
		System.out.print("\nSTRING-EQUALS!!\n");
		String e="JAVA!!!";
		String e1="java!!!";
		//System.out.println(e==e1);
		System.out.println(e.equals(e1));
		System.out.println(e.equalsIgnoreCase(e1));//string-equal
		
		System.out.print("\nSTRING-CHAR-AT!!\n");
		String d="JAVA!!!";
		System.out.println(d.charAt(2));//char-at
		
		System.out.print("\nSPLIT-STRING!!\n");
		String r="JAVA,PYTHON,C++";
		String[]lang=r.split(",");
		for(String s1:lang) {
			System.out.println(s1);//split-string
		}
		
		System.out.print("\nSTRING-CONCATENATION!!\n");
		String q="JAVA ";
		String q1="PROGRAMMING!!!";
		System.out.println("CONCAT STRING:"+q.concat(q1));//string-concatenation
		
		System.out.print("\n STRING-TRIM!!\n");
		String f=" JAVA PROGRAMMING  ";
		System.out.println(f.length());
		String f1=f.trim();
		System.out.println(f1);
		System.out.println(f1.length());//string-trim
		
		System.out.print("\nSTRING-COMPARE-TO!!\n");
		String t="java";
		String t1="python";
		System.out.println(t.compareTo(t1));//string-compare
		
		System.out.print("\nSTRING-CONTAINS!!\n");
		String y="JAVA PROGRAMMING";
		System.out.println(y.contains("JAVA"));
		System.out.println(y.contains("PYTHON"));//string-contains
		
		System.out.print("\nSTRING-INTERN!!\n");
		String u= new String("java programming");
		String u3="PROGRAMMING!!!";
		String u2=u.intern();
		System.out.println(u==u3);
		System.out.println(u3==u2);//string intern
		
		
		
	}
}
