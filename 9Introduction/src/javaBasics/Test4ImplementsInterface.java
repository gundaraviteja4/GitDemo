package javaBasics;

public class Test4ImplementsInterface implements Test3Interface{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test4ImplementsInterface obj=new Test4ImplementsInterface();
		//obj.interfaceMethod1(); we can not access static methods in implements class
		obj.interfaceMethod2();
		obj.interfaceMethod3();
		obj.interfaceMethod4();
		System.out.println(obj.a); 
		System.out.println(obj.b); // we can access static variables
		System.out.println(obj.c);
	}

	@Override
	public void interfaceMethod3() {
		// TODO Auto-generated method stub
		System.out.println("interfaceMethod3");
	}

	@Override
	public void interfaceMethod4() {
		// TODO Auto-generated method stub
		System.out.println("interfaceMethod4");
	}

}
