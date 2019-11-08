import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import javax.swing.JFileChooser;


public class Copy {
	  public static void main(String s[]) {
		  
		
		  //Choose Source File
	    JFileChooser chooser1 = new JFileChooser();
	    chooser1.setCurrentDirectory(new java.io.File("D:\\TXSocialshare"));
	    chooser1.setDialogTitle("Source");
	    chooser1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	   // chooser1.setFileSelectionMode(JFileChooser.FILES_ONLY);
	    chooser1.setAcceptAllFileFilterUsed(false);
	       
	    
	    if (chooser1.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
		     // System.out.println("getCurrentDirectory(): " + chooser1.getCurrentDirectory());
		      System.out.println("getSelectedFile() : " + chooser1.getSelectedFile());
		    } else {
		      System.out.println("No Selection ");
		    }
	    File source=chooser1.getSelectedFile();
	    System.out.println("Source: " + source);

	  
	    
	    
	  //Choose Destination File
	    JFileChooser chooser2 = new JFileChooser();
	    chooser2.setCurrentDirectory(new java.io.File("D:\\TXSocialshare"));
	    chooser2.setDialogTitle("Destination");
	    chooser2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
	   // chooser1.setFileSelectionMode(JFileChooser.FILES_ONLY);
	    chooser2.setAcceptAllFileFilterUsed(false);
	       
	    
	    if (chooser2.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
		   //   System.out.println("getCurrentDirectory(): " + chooser2.getCurrentDirectory());
		      System.out.println("getSelectedFile() : " + chooser2.getSelectedFile());
		    } else {
		      System.out.println("No Selection ");
		    }
	   
	    
	    File destination=chooser2.getSelectedFile();
	    System.out.println("Source: " + destination);
	   
	  
	 
	    
	    
	//Copy Code    
	    try {
	    		    FileUtils.copyDirectory(source, destination);
	    		    System.out.println("Copy Done.");
	    	} 
	    catch (IOException e) 
	     	{
	    		    e.printStackTrace();
	    	}
	  
	  }
	}


