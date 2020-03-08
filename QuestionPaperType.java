package testing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuestionPaperType 
{
	JPanel ControlPanel=new JPanel();
	JButton buttonback=new JButton("Back");
	JLabel  headerlabel=new JLabel("QuestionPaper",JLabel.CENTER);
	QuestionPaperType()
	{
			ControlPanel.setBounds(10, 10, 800, 640);
			ControlPanel.setVisible(true);
			ControlPanel.setLayout(null);
			ControlPanel.setOpaque(false);
			
			headerlabel.setFont(new Font("Verdana",Font.PLAIN,50));
			headerlabel.setBounds(0,50,800,100);
			headerlabel.setForeground(Color.white);
			
	    
    }
	void AddButton(JFrame MainFrame)
	{
			JButton b1,b2;
			b1=new JButton("Class Test 1");
			b2=new JButton("Class Test 2");
			b1.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e)
			{
				 ControlPanel.setVisible(false);
	         	 MySubjectsQ QS=new MySubjectsQ();
	         	 QS.MyAction(MainFrame);
				
			}
			});
			b2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{   
					//System.out.println("Previous Year Questioon Paper");
					 ControlPanel.setVisible(false);
		         	 MySubjectsQ2 QS=new MySubjectsQ2();
		         	 QS.MyAction(MainFrame);				}
				});	
			buttonback.addActionListener(new ActionListener() //this is for question paper
			{	
					public void actionPerformed(ActionEvent e) 
					{
						ControlPanel.setVisible(false);
						QuestionPaper QP=new QuestionPaper();
	  					QP.AddButton(MainFrame);
					}
			});
			
	b1.setBounds(160,170,500,50);
	b2.setBounds(160,260,500,50);
    buttonback.setBounds(20, 35, 100, 30);

	ControlPanel.add(b1);
	ControlPanel.add(buttonback);
	ControlPanel.add(b2);
	ControlPanel.add(headerlabel);
	
	MainFrame.add(ControlPanel);
	}
	
}
