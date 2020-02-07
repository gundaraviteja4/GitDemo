package CollectionsPackage;
import java.util.ArrayList;
public class Test1ArrayList 
{
	public static void main(String args[])
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("ravi");
		a.add("teja");
		a.add("gunda");
		System.out.println(a);
		a.add(1, "cybage"); // we can add the string in the list using index, if we add in between, the elements will be moved
		System.out.println(a);
		a.remove(2); //using index
		System.out.println(a);
		a.remove("gunda");
		System.out.println(a);
		//a.removeAll(a); // remove all
		//System.out.println(a);
		System.out.println(a.get(1)); // to print specific value in the index
		// contains is used to check whether string is present or not 
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("cybage"));
		System.out.println(a.isEmpty()); //to check whether the arraylist is empty
		System.out.println(a.size()); 
		//all the classes which implements list interface will accept duplicate values
		a.add("ravi");
		System.out.println(a);
		System.out.println(a.indexOf("ravi"));
		System.out.println(a.lastIndexOf("ravi"));
	}
}
