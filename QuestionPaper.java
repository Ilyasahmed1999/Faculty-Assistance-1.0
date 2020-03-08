package testing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class QuestionPaper 
{
	JPanel ControlPanel=new JPanel();
	JButton buttonback=new JButton("Back");
	JLabel  headerlabel=new JLabel("QuestionPaper",JLabel.CENTER);
	QuestionPaper()
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
			b1=new JButton("Generate QuestionPaper");
			b2=new JButton("PreviousYear QuestionPapers");
			b1.addActionListener(new ActionListener()
			{
			public void actionPerformed(ActionEvent e)
			{
				 ControlPanel.setVisible(false);
	         	QuestionPaperType qt=new QuestionPaperType();
	         	qt.AddButton(MainFrame);
				
			}
			});
			b2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{   
					System.out.println("Previous Year Questioon Paper");
				}
				});	
			buttonback.addActionListener(new ActionListener() //this is for question paper
			{	
					public void actionPerformed(ActionEvent e) 
					{
						ControlPanel.setVisible(false);
       	 
						FacultyAssistancewithbb f1=new FacultyAssistancewithbb();
						f1.back(MainFrame);
					}
			});
			
	b1.setBounds(160,170,500,50);
	b2.setBounds(160,260,500,50);
    buttonback.setBounds(20, 35, 100, 30);

	ControlPanel.add(b1);
	ControlPanel.add(buttonback);
	//ControlPanel.add(b2);
	ControlPanel.add(headerlabel);
	
	MainFrame.add(ControlPanel);
	}
	
}
