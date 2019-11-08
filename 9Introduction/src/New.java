import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;

import org.apache.commons.io.FileUtils;

import javax.swing.JButton;
 
public class New {
 
  private JFrame frame;
  private JTextField txtPath;
 
  /**
   * Launch the application.
   */
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
       try {
          New window = new New();
          window.frame.setVisible(true);
        } catch (Exception e) {
          e.printStackTrace();
        }
      }
    });
  }
 
  /**
   * Create the application.
   */
  public New() {
	  
	  
    CP();
  }
 
  /**
   * Initialize the contents of the frame.
   */
  private void CP() {
    frame = new JFrame();
    frame.setBounds(100, 100, 450, 300);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.getContentPane().setLayout(null);
         
    txtPath = new JTextField();
    txtPath.setBounds(10, 10, 414, 21);
    frame.getContentPane().add(txtPath);
    txtPath.setColumns(10);
         
    JButton btnBrowse = new JButton("Browse");
    btnBrowse.setBounds(10, 41, 87, 23);
    frame.getContentPane().add(btnBrowse);
         
    btnBrowse.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
 
        // For Directory
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
 
        // For File
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
 
        fileChooser.setAcceptAllFileFilterUsed(false);
 
        int rVal = fileChooser.showOpenDialog(null);
        if (rVal == JFileChooser.APPROVE_OPTION) {
          txtPath.setText(fileChooser.getSelectedFile().toString());
        }
      }
    });
  }
}
