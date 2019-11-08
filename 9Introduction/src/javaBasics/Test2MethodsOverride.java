package javaBasics;

public class Test2MethodsOverride extends Test1 {

	public static void main(String[] args) 
	{
		Test1 t=new Test2MethodsOverride();
		t.method1();
		t.method2(); 
		// we cannot access method3 with object t since we are creating object for Test1
		
	}
	public void method1()
	{
		System.out.println("Test2Method1");
	}
	public void method2()
	{
		System.out.println("Test2Method2");
	}
	public void method3()
	{
		System.out.println("Test2Method3");
	}
}
