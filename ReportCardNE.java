package testing;
//this is the main Report Frame

import javax.imageio.ImageIO;
import javax.swing.*;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ReportCardNE
{
	public JTextField n;
	String textoffield1;
	static int in;
	JPanel ControlPanel;
	JButton buttonback=new JButton("Back");
	void NumberofStudents(JFrame MainFrame)	
	{
			ControlPanel=new JPanel();
			JLabel label1=new JLabel("Number of Student");
			n=new JTextField();
			JButton button1=new JButton("Submit");
			button1.setBounds(400,200,100,30);
			
			label1.setBounds(150,150,200, 30);
			label1.setFont(new Font("Verdana",Font.PLAIN,20));
			label1.setForeground(Color.white);
			
			n.setBounds(400,150,200,30);
			buttonback.setBounds(20, 35, 100, 30);
			
			ControlPanel.setVisible(true);
			ControlPanel.setBounds(10, 10, 800, 640);
			ControlPanel.setLayout(null);
			ControlPanel.setOpaque(false);
			ControlPanel.add(label1);
			ControlPanel.add(n);
			ControlPanel.add(button1);
			ControlPanel.add(buttonback);
			
			MainFrame.add(ControlPanel);
			
			button1.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent ae)
		{
		
			textoffield1=n.getText();
			in=Integer.parseInt(textoffield1);
			ControlPanel.setVisible(false);
			ReportCardDataE d1=new ReportCardDataE();
			d1.Submit(MainFrame);
			d1.Create();
		
		}
	});
			
	buttonback.addActionListener(new ActionListener() //this is for question paper
        	{
				public void actionPerformed(ActionEvent e) 
				{
					ControlPanel.setVisible(false);
 
					ReportCardT r1=new ReportCardT();
					r1.AddButton(MainFrame);
				}
        	});
	}
}
