package testing;

import java.awt.*;
import javax.swing.*;

class Gui_mp 
{
	JFrame frame1=new JFrame("Java");    
	Gui_mp()//it is for frame
	{
			frame1.setVisible(true);
			frame1.getContentPane().setLayout(new FlowLayout()); 
			frame1.setSize(500,500);
	}
	public void Content()
	{	
			my_topics_mp mpt=new my_topics_mp();
			JScrollPane s1 = new JScrollPane(mpt.Table());  
			s1.setPreferredSize(new Dimension(1300,700));
			s1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
			s1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
			frame1.getContentPane().add(s1);  
    
	}
}

	