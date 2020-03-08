package testing;
//this is for teaching Schedule
import java.awt.*;
import javax.swing.*;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import java.awt.event.*;
import java.io.IOException;

public class MySubjectsQ2 
{
   JButton buttonback=new JButton("Back");
   private JLabel HeaderLabel;
   private JPanel ControlPanel;
   public JPanel mypanel1;
   MySubjectsQ2()
   {
        prepareGUI();
   }
   
   private void prepareGUI()
   {
	  mypanel1=new JPanel();   
      mypanel1.setLayout(null);
      
      HeaderLabel = new JLabel("SUBJECTS", JLabel.CENTER); 
      HeaderLabel.setBounds(0,0,800,100);
      HeaderLabel.setFont(new Font("Verdana",Font.PLAIN,30));
      HeaderLabel.setForeground(Color.white);
      
	  

      ControlPanel = new JPanel();
      ControlPanel.setLayout(new GridLayout(3,2,20,15));
      ControlPanel.setOpaque(false);
      ControlPanel.setPreferredSize(new Dimension(500,200));
      ControlPanel.setBounds(100, 120, 600, 300);
      
      mypanel1.add(HeaderLabel);
      mypanel1.add(ControlPanel);
      mypanel1.setVisible(true);
      mypanel1.setBounds(10, 10,800,640);
      mypanel1.setOpaque(false);

   }
   public void MyAction(JFrame MainFrame)//adding buttons to panel
   {
      JButton button1 = new JButton("Maths and statistics");

      JButton button2=new JButton("  Signal And Systems  ");
      
      JButton button3=new JButton("Computer Organisation");
    
      JButton button4 = new JButton("Java Programming");

      JButton button5=new JButton("Programming Languages ");
      
      JButton button6=new JButton("Microprocessor and Interfacing");
      buttonback.setBounds(20, 30, 100, 30);
      button1.addActionListener(new ActionListener()
      {
    	  	public void actionPerformed(ActionEvent e) 
    	  	{
            	 JOptionPane.showMessageDialog(MainFrame,"Maths and statistics Paper is Generated with a key",
      		     "Maths and Statistics",JOptionPane.INFORMATION_MESSAGE); 
            	 Maths2 QP= new Maths2();
  			   try {
  				   QP.generateQP();
  			   	   } catch (IOException e1) {}
  			   QP.keypath();
  			   try {
  				   QP.generateKey();
  			   		} catch (Exception e1) {} 

    	  	}
      });
      
      button2.addActionListener(new ActionListener()
      {
    	  	public void actionPerformed(ActionEvent e)
    	  	{
    	  		JOptionPane.showMessageDialog(MainFrame,"Signals and Systems Paper is Generated with a key",
     		     "Signals and System",JOptionPane.INFORMATION_MESSAGE); 
    	  		 SAS2 QP= new SAS2();
  			   try {
  				   QP.generateQP();
  			   	   } catch (IOException e1) {}
  			   QP.keypath();
  			   try {
  				   QP.generateKey();
  			   		} catch (Exception e1) {} 
 
    	  	}
     });
      
      button3.addActionListener(new ActionListener()
      {
    	  	public void actionPerformed(ActionEvent e)
    	  	{
    		  	JOptionPane.showMessageDialog(MainFrame,"Computer Organisation Paper is Generated with a key",
     	        "Computer Organisation",JOptionPane.INFORMATION_MESSAGE);
    		  	 CO2 QP= new CO2();
    			   try {
    				   QP.generateQP();
    			   	   } catch (IOException e1) {}
    			   QP.keypath();
    			   try {
    				   QP.generateKey();
    			   		} catch (Exception e1) {} 

    	  	}
       });
      
      button4.addActionListener(new ActionListener() 
      {
    	  	public void actionPerformed(ActionEvent e) 
    	  	{
    	  		JOptionPane.showMessageDialog(MainFrame,"Java Programming Language Paper is Generated with a key",
    	  		"Java Programming Language",JOptionPane.INFORMATION_MESSAGE); 
    	  		 Java2 QP= new Java2();
  			   try {
  				   QP.generateQP();
  			   	   } catch (IOException e1) {}
  			   QP.keypath();
  			   try {
  				   QP.generateKey();
  			   		} catch (Exception e1) {} 

    	  	}
       });
      button5.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
         	 
               	  JOptionPane.showMessageDialog(MainFrame,"Programming Languages Paper is Generated with a key",
     		     "Programming Languages",JOptionPane.INFORMATION_MESSAGE); 
             	 PPL2 QP= new PPL2();
  			   try {
  				   QP.generateQP();
  			   	   } catch (IOException e1) {}
  			   QP.keypath();
  			   try {
  				   QP.generateKey();
  			   		} catch (Exception e1) {} 
 
          }
       });
      
      button6.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
        	  	JOptionPane.showMessageDialog(MainFrame,"Microprocessor and Interfacing Paper is Generated with a key",
        	  	"Microprocessor and Interfacing",JOptionPane.INFORMATION_MESSAGE); 
        		 MP2 QP= new MP2();
  			   try {
  				   QP.generateQP();
  			   	   } catch (IOException e1) {}
  			   QP.keypath();
  			   try {
  				   QP.generateKey();
  			   		} catch (Exception e1) {} 

          }
       });
      
      buttonback.addActionListener(new ActionListener() //this is for question paper
         { 
    	  			public void actionPerformed(ActionEvent e)
    	  			{
    	  					mypanel1.setVisible(false);
         	
    	  					QuestionPaperType QP=new QuestionPaperType();
    	  					QP.AddButton(MainFrame);
    	  			}
          });
      
      ControlPanel.setSize(600, 200);
      
      ControlPanel.add(button1);
      
      ControlPanel.add(button2);
      
      ControlPanel.add(button3);

      ControlPanel.add(button4);
      
      ControlPanel.add(button5);
      
      ControlPanel.add(button6);
      
      mypanel1.add(buttonback);
      
      MainFrame.add(mypanel1);      
   }
}