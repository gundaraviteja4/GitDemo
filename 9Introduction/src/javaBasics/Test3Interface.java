package javaBasics;

public interface Test3Interface 
{
	public int a=100;
	static int b=10; 
	int c=20; // variable can be public or static in interface, but not private or protected
 public static void interfaceMethod1()
 {
	 System.out.println("static methods can have body in interface");
 }
 public default  void interfaceMethod2()
 {
	 System.out.println("default methods can have body in interface");
 }
 public  void interfaceMethod3(); // only static and default methods can have body in interface
 
 public  abstract void interfaceMethod4();

}
