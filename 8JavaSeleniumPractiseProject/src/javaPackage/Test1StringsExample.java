package javaPackage;

public class Test1StringsExample {
	
	public static void main(String args[])
	{
		String str1="Raviteja";  // declaration1 - String represents fixed-length, immutable(constant and cannot be changed once created) character sequences 
		String str2=new String("abcd"); // declaration2
		System.out.println("String1: " + str1 + " String2: " + str2);
		System.out.println("String1 length: " + str1.length());
		
		StringBuffer sb1=new StringBuffer("StringBufferSequence");   //declaration - StringBuffer represents growable and writable character sequences
		System.out.println("StringBuffer1: " + sb1 );
		sb1.append("1234567891237456789");
		System.out.println("StringBuffer1 after append: " + sb1 );
		
		
		StringBuilder sbld1=new StringBuilder("StringBuilderSequence"); //declaration - StringBuilder creates mutable sequence of characters
		sbld1.append("5489789");
		System.out.println("StringBuilder1 after append: " + sbld1 );
		
		// difference between StringBuffer and StringBuilder is StringBuffer is Thread safe i.e multiple threads can use single StringBuffer object, while StringBuilder is not thread safe
	}
	

}
