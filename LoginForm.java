package testing;

import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class LoginForm  implements ActionListener
{
			JLabel l1, l2, l3;
			JTextField tf1;
			JButton btn1;
			JPasswordField p1;
			JFrame MainFrame;
			JPanel ControlPanel;
			JLabel HeaderLabel;
			LoginForm() 
			{	 
			  HeaderLabel = new JLabel("Faculty Assistance", JLabel.CENTER);
		      HeaderLabel.setFont(new Font("Gadugi",Font.PLAIN,55));
		      HeaderLabel.setBounds(140,60,800,100);
		      HeaderLabel.setForeground(Color.white);	
				ControlPanel=new JPanel();
					MainFrame = new JFrame("Faculty Assistance");
					l1 = new JLabel("Login");
					l1.setForeground(Color.WHITE);
  					MainFrame.setExtendedState(MainFrame.MAXIMIZED_BOTH);
  					BufferedImage img=null;
  					try {
  							img = ImageIO.read(new File("E:/1.jpg"));
  						}catch (IOException e) {
  							e.printStackTrace();
  							}
  					java.awt.Image dimg = img.getScaledInstance(1400, 700, Image.SCALE_SMOOTH);
  					ImageIcon imageIcon = new ImageIcon(dimg);
  					MainFrame.setContentPane(new JLabel(imageIcon));
  					
  					l1.setFont(new Font("Serif", Font.BOLD, 20));
  					l2 = new JLabel("Username");
  					l3 = new JLabel("Password");
  					l2.setForeground(Color.WHITE);
  					l3.setForeground(Color.WHITE);

  					tf1 = new JTextField();
  					p1 = new JPasswordField();
  					btn1 = new JButton("Login");
 
  					l1.setBounds(500, 150, 400, 30);
  					l2.setBounds(400, 200, 200, 30);
  					l3.setBounds(400, 250, 200, 30);
  					tf1.setBounds(500, 200, 200, 30);
  					p1.setBounds(500, 250, 200, 30);
  					btn1.setBounds(500, 300, 100, 30);

  					btn1.addActionListener(this);
  
  					ControlPanel.add(l2);
  					ControlPanel.add(tf1);
  					ControlPanel.add(l3);
  					ControlPanel.add(p1);
  					ControlPanel.add(btn1);
  					ControlPanel.setBounds(10, 10, 800, 640);
  					ControlPanel.setVisible(true);
  					ControlPanel.setLayout(null);
  					ControlPanel.setOpaque(false);
ControlPanel.add(HeaderLabel);
  					MainFrame.setVisible(true);
  					MainFrame.add(ControlPanel);
	    	}
			public void actionPerformed(ActionEvent ae)
			{
					String uname = tf1.getText();
					String pass = p1.getText();
					if(uname.equals("mjcet") && pass.equals("mjcet"))
					{		ControlPanel.setVisible(false);
							FacultyAssistancewithbb  fframe1 = new FacultyAssistancewithbb();  
							fframe1.back(MainFrame);
							//fframe1.prepareGUI(MainFrame);
							//fframe1.MyAction(MainFrame);
							
					}

					else
					{
						JOptionPane.showMessageDialog(MainFrame,"Incorrect login or password",
						"Error",JOptionPane.ERROR_MESSAGE);
					}
 
			}
			public static void main(String[] args)
			{
					new LoginForm();
			}
}
