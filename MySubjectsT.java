package testing;
//this is for teaching Schedule
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MySubjectsT 
{
   JButton buttonback=new JButton("Back");
   private JLabel HeaderLabel;
   private JPanel ControlPanel;
   public JPanel mypanel1;
   MySubjectsT()
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
      
      button1.addActionListener(new ActionListener()
      {
    	  	public void actionPerformed(ActionEvent e) 
    	  	{
            	  Gui_maths maths=new Gui_maths();
            	  maths.Content();
   
    	  	}
      });
      
      button2.addActionListener(new ActionListener()
      {
    	  	public void actionPerformed(ActionEvent e)
    	  	{
    	  		Gui_sas sas=new Gui_sas();
          	    sas.Content();

             }
     });
      
      button3.addActionListener(new ActionListener()
      {
    	  	public void actionPerformed(ActionEvent e)
    	  	{
    	  		Gui_co co=new Gui_co();
          	    co.Content();

    	  	}
       });
      
      button4.addActionListener(new ActionListener() 
      {
    	  	public void actionPerformed(ActionEvent e) 
    	  	{
    	  		Gui_java java=new Gui_java();
    	  		java.Content();
          	  	
            }
       });
      button5.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
         	 
        	  Gui_pl pl=new Gui_pl();
        	  pl.Content();

           }
       });
      
      button6.addActionListener(new ActionListener()
      {
          public void actionPerformed(ActionEvent e)
          {
        	  	Gui_mp mp=new Gui_mp();
        	  	mp.Content();

          }
       });
      
      buttonback.addActionListener(new ActionListener() //this is for question paper
         { 
    	  			public void actionPerformed(ActionEvent e)
    	  			{
    	  					mypanel1.setVisible(false);
         	
    	  					FacultyAssistancewithbb f1=new FacultyAssistancewithbb();
    	  					f1.back(MainFrame);
    	  			}
          });
      buttonback.setBounds(20, 30, 100, 30);
      
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