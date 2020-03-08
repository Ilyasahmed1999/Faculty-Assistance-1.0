package testing;
import java.awt.*;
import java.awt.Image;

import javax.imageio.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
public class FacultyAssistancewithbb 
{
	private JLabel HeaderLabel;
	private JPanel ControlPanel;
	public static JPanel mypanel;
	public FacultyAssistancewithbb()
	{
    		prepareGUI();
	}
  
	private void prepareGUI()//adding headerlabel and panel to frame.
	{
      mypanel=new JPanel();
      mypanel.setBounds(10, 10,800,640);
      mypanel.setOpaque(false);
      mypanel.setLayout(null);
   
      HeaderLabel = new JLabel("Faculty Assistance", JLabel.CENTER); 
      HeaderLabel.setFont(new Font("Gadugi",Font.PLAIN,55));
      HeaderLabel.setBounds(0,3,800,100);
      HeaderLabel.setForeground(Color.white);
     
      ControlPanel = new JPanel();
      ControlPanel.setLayout(new GridLayout(3,2,5,15));
      ControlPanel.setBounds(100, 120, 600, 220);
      ControlPanel.setOpaque(false);

      mypanel.add(HeaderLabel);
      mypanel.add(ControlPanel);
      mypanel.setVisible(true);  
   }
   
   void back(JFrame MainFrame)
   {
	   JButton button1 = new JButton("TeachingSchedule");

	      JButton button2=new JButton("  QuestionPaper  ");
	      
	      JButton button3=new JButton("ReportCard");
	      
	      button1.addActionListener(new ActionListener() {//this is for teaching Schedule
	         public void actionPerformed(ActionEvent e) {
	        	 mypanel.setVisible(false);
	        	  MySubjectsT  sframe1 = new MySubjectsT();  
	            sframe1.MyAction(MainFrame);
	           
	         }
	      });
	      
	      button2.addActionListener(new ActionListener() {//this is for question paper
	          public void actionPerformed(ActionEvent e) {
	         	 mypanel.setVisible(false);
	         	QuestionPaper QP=new QuestionPaper();
	        	 QP.AddButton(MainFrame);
	        	  
	          }
	       });
	      
	      button3.addActionListener(new ActionListener() {//this is for report Card
	          public void actionPerformed(ActionEvent e) {
	         	mypanel.setVisible(false); 
	           ReportCardT m1=new ReportCardT();	
	         	m1.AddButton(MainFrame);        
	         }
	       });
	      ControlPanel.add(button1);
	      
	      ControlPanel.add(button2);
	      
	      ControlPanel.add(button3);
	      MainFrame.add(mypanel);     
   }
  
   }
  