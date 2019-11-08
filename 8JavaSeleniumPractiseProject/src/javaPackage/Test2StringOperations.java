package javaPackage;

public class Test2StringOperations {

	public static void main(String[] args) {

String str1= "String1";
String str2= new String("String second declartion");


System.out.println("String length: " + str1.length());
System.out.println("String in Uppser Case: " + str1.toUpperCase());
System.out.println("String in Lower Case: " + str1.toLowerCase());
System.out.println("find the index of a char: " + str1.indexOf('i'));
System.out.println("find the index of a string: " + str2.indexOf("decl"));
String str3= str1.concat(str2);
String str4= str1 + str2;
System.out.println("Concatenation of  two strings: " + str3);
System.out.println("Concatenation of  two strings: " + str4);
System.out.println("last index: " + str2.lastIndexOf('s'));

String str5= str2.substring(3, 6);
System.out.println("Substring: " + str5);


//String reverse - built in method

StringBuffer sb1=new StringBuffer(str3);
System.out.println("String reverse1: " + sb1.reverse()); // string reverse is not possible using String class, using StringBuffer and String Builder we can acheive that

//String reverse - converting to array


char[] c=str1.toCharArray();

int arraylength=c.length;

System.out.print("String reverse2: ");
for(int i=arraylength-1; i>=0;i--)
{
	
	System.out.print( c[i]);
	
	
}





	}

}
