package Programs;

public class Test5 extends Test6{

	public static void main(String[] args) 
	{
		// duplicate characters in a string 
		
		String str = new String("Sakkett");
		                  int count = 0;
		                  char[] chars = str.toCharArray();
		                  System.out.println("Duplicate characters are:");
		                  for (int i=0; i<str.length();i++) {
		                              for(int j=i+1; j<str.length();j++) {
		                                         if (chars[i] == chars[j]) {
		                                                    System.out.println(chars[j]);
		                                                    count++;
		                                                    break;
		                                          }
		                               }
		                   }

		
		                  Test6 o1=new Test6();
		                  o1.defaultMethod();
		                  o1.protectedMethod();
		                  o1.publicMethod();
		

	}

}
