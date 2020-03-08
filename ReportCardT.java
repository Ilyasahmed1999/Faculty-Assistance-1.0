package testing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class ReportCardT 
{
	JPanel ControlPanel=new JPanel();
	JButton buttonback=new JButton("Back");
	JLabel  headerlabel=new JLabel("ReportCard",JLabel.CENTER);
	ReportCardT()
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
		b1=new JButton("Internal ReportCard");
		b2=new JButton("External ReportCard");
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				 ControlPanel.setVisible(false);
	         	 ReportCardNI n1=new ReportCardNI();
	         	 n1.NumberofStudents(MainFrame);
	         	 
			}
		});
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{ 
				ControlPanel.setVisible(false); 
				ReportCardNE e1=new ReportCardNE();
				e1.NumberofStudents(MainFrame);
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
		ControlPanel.add(b2);
		ControlPanel.add(headerlabel);
		
		MainFrame.add(ControlPanel);
	}
	
}
