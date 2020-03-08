package testing;
//this is the  main Report
import javax.swing.*;  
import java.awt.event.*;
import java.awt.*;  

public class ReportCardDataI extends ReportCardNI
{ 
		static JLabel count;
		JButton submit;
		JButton buttonback;
		JPanel ControlPanel=new JPanel();
		static int i=0;
		static String ename[],erollno[],emaths[],esas[],eco[],ejava[],epl[],emp[];//entered value in string format
		static int irollno[],imaths[],isas[],ico[],ijava[],ipl[],imp[]; //converting string value to integer
		JLabel headerlabel, name, rollno, maths, sas, co, java, pl,mp;  
		JTextField name1,rollno1, maths1, sas1, co1, java1,pl1,mp1;    
		void Create()
		{
				ename=new String[in];
				erollno=new String[in];
				emaths=new String[in];
				esas=new String[in];
				eco=new String[in];
				ejava=new String[in];
				epl=new String[in];
				emp=new String[in];
				irollno=new int[in];
				imaths=new int[in];
				isas=new int[in];
				ico=new int[in];
				ijava=new int[in];
				ipl=new int[in];
				imp=new int[in];
		}
		
		ReportCardDataI()    
		{ 		System.out.println(in);
				buttonback=new JButton("Back");
				count=new JLabel("i");
				ControlPanel.setVisible(true);
 
				ControlPanel.setBounds(10, 10, 800, 640);
				buttonback.setBounds(20, 35, 100, 30);
				ControlPanel.setLayout(null);
				ControlPanel.setOpaque(false);
				ControlPanel.add(buttonback);
				JLabel h1=new JLabel("hello");
   
				headerlabel = new JLabel("STUDENT MARKS");  
				headerlabel.setForeground(Color.white);  
				headerlabel.setFont(new Font("Serif", Font.BOLD, 20));  
       
				name = new JLabel("Name:");  
				name.setForeground(Color.white);
				
				rollno=new JLabel("RollNo");  
				rollno.setForeground(Color.white);
				
				maths = new JLabel("Maths and statistics");  
				maths.setForeground(Color.white);
				
				sas = new JLabel("System and Signals");  
				sas.setForeground(Color.white);
				
				co = new JLabel("Computer Organisation");  
				co.setForeground(Color.white);
				
				java = new JLabel("Java Programming");  
				java.setForeground(Color.white);
			
				pl = new JLabel("Programming Languages"); 
				pl.setForeground(Color.white);
        
				mp = new JLabel("Microprocessor and Interfacing"); 
				mp.setForeground(Color.white);
     
				name1 = new JTextField();
        
				rollno1 = new JTextField();  
    
				maths1 = new JTextField();  
        
				sas1 = new JTextField();  
        
				co1 = new JTextField();  
        
				java1 = new JTextField();  
      
				pl1 = new JTextField();
       
				mp1 = new JTextField();
         
       

				headerlabel.setBounds(180, 30, 200, 30);
				count.setBounds(150, 30, 200, 30);
				name.setBounds(150, 70, 200, 30); 
				rollno.setBounds(150, 110, 200, 30);  
				maths.setBounds(150, 150, 200, 30);  
				sas.setBounds(150, 190, 200, 30);  
				co.setBounds(150, 230, 200, 30);  
				java.setBounds(150, 270, 200, 30);  
				pl.setBounds(150, 310, 200, 30);  
				mp.setBounds(150, 350, 200, 30);
        
				name1.setBounds(370, 70, 200, 30); 
				rollno1.setBounds(370, 110, 200, 30); 
				maths1.setBounds(370, 150, 200, 30);  
				sas1.setBounds(370, 190, 200, 30);  
				co1.setBounds(370, 230, 200, 30); 
				java1.setBounds(370, 270, 200, 30);  
				pl1.setBounds(370, 310, 200, 30);  
				mp1.setBounds(370, 350, 200, 30);  
          
     
    
			}
    void Submit(JFrame MainFrame)
    { 
    	
      	MainFrame.add(ControlPanel);
   	
       ControlPanel.add(headerlabel);
       ControlPanel.add(name);  
       ControlPanel.add(rollno);
       ControlPanel.add(maths);  
       ControlPanel.add(sas);  
       ControlPanel.add(co);  
       ControlPanel.add(java);  
       ControlPanel. add(pl);  
       ControlPanel.add(mp);  
       
       ControlPanel.add(name1);
       ControlPanel.add(rollno1);  
       ControlPanel.add(maths1);  
       ControlPanel.add(sas1);  
       ControlPanel.add(co1);  
       ControlPanel.add(java1);  
       ControlPanel.add(pl1);
       ControlPanel.add(mp1);
       ControlPanel.add(count);
       ControlPanel.setVisible(true);
      
       MainFrame.add(ControlPanel);
    	int n=in;
    	System.out.println(in);
       if(i<(n-1))
       {
    	   submit = new JButton("Submit"); 		
    	   ControlPanel.add(submit);
    	   submit.setBounds(230, 410, 100, 30);
	
    	   ControlPanel.add(buttonback);

    	   submit.addActionListener(new ActionListener()
    	   {
    	   public void actionPerformed(ActionEvent event)
    	   { 
    		   	ControlPanel.setVisible(false);
   	
    		   	String enteredname=name1.getText();
    		   	ename[i]=new String();
    		   	ename[i]=enteredname;	
    		   	
    		   	String enteredrollno=rollno1.getText();
    		   	erollno[i]=new String();
    		   	erollno[i]=enteredrollno;	
       
    		   	String enteredmaths=maths1.getText();
    		   	emaths[i]=new String();
    		   	emaths[i]=enteredmaths;
    		   	imaths[i]=Integer.parseInt(enteredmaths);
        
    		   	String enteredsas=sas1.getText();
    		   	esas[i]=new String();
    		   	esas[i]=enteredsas;
    		   	isas[i]=Integer.parseInt(enteredsas);
        
    		   	String enteredco=co1.getText();
    		   	eco[i]=new String();
    		   	eco[i]=enteredco;
    		   	ico[i]=Integer.parseInt(enteredco);
        
    		   	String enteredjava=java1.getText();
    		   	ejava[i]=new String();
    		   	ejava[i]=enteredjava;
    		   	ijava[i]=Integer.parseInt(enteredjava);
        
    		   	String enteredpl=pl1.getText();
    		   	epl[i]=new String();
    		   	epl[i]=enteredpl;
    		   	ipl[i]=Integer.parseInt(enteredpl);
    
    		   	String enteredmp=mp1.getText();
    		   	emp[i]=new String();
    		   	emp[i]=enteredmp;
    		   	imp[i]=Integer.parseInt(enteredmp);
    	
    		   	i++;
    	
    		   	ReportCardDataI r2=new ReportCardDataI();
    		   	r2.Submit(MainFrame);
    	   }
    	   });

       }
    	else    		
     	{
   
    		 submit = new JButton("Submit"); 		
    		 ControlPanel.add(submit);
    		 submit.setBounds(230, 410, 100, 30);
    		
    		 
    		 submit.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent event)
    		{	
    
    			ControlPanel.setVisible(false);
    			String enteredname=name1.getText();
    			ename[i]=new String();
    			ename[i]=enteredname;	

    			String enteredrollno=rollno1.getText();
    			erollno[i]=new String();
    			erollno[i]=enteredrollno;	
    			
    			String enteredmaths=maths1.getText();
    			emaths[i]=new String();
    			emaths[i]=enteredmaths;
    			imaths[i]=Integer.parseInt(enteredmaths);
            
    			String enteredsas=sas1.getText();
    			esas[i]=new String();
    			esas[i]=enteredsas;
    			isas[i]=Integer.parseInt(enteredsas);
            
    			String enteredco=co1.getText();
    			eco[i]=new String();
    			eco[i]=enteredco;
    			ico[i]=Integer.parseInt(enteredco);
            
    			String enteredjava=java1.getText();
    			ejava[i]=new String();
    			ejava[i]=enteredjava;
    			ijava[i]=Integer.parseInt(enteredjava);
            
    			String enteredpl=pl1.getText();
    			epl[i]=new String();
    			epl[i]=enteredpl;
    			ipl[i]=Integer.parseInt(enteredpl);
    			
    			String enteredmp=mp1.getText();
    			emp[i]=new String();
    			emp[i]=enteredmp;
    			imp[i]=Integer.parseInt(enteredmp);

    			for(int j=0;j<in;j++)
    			{	
    				System.out.println("slno:"+j);
    				System.out.println(ename[j]);
    				System.out.println(erollno[j]);
    				System.out.println(imaths[j]);
    				System.out.println(isas[j]);
    				System.out.println(ico[j]);
    				System.out.println(ijava[j]);
    				System.out.println(ipl[j]);
    				System.out.println(imp[j]);
    			//and create  an object of Report card class 
    			}
    			
    					ReportCardT t1=new ReportCardT();
    					t1.AddButton(MainFrame);
    					JOptionPane pane=new JOptionPane();
    					Internal_Report RP=new Internal_Report();
    					try {
							RP.GenerateIRC();
						} catch (Exception e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
    					pane.showMessageDialog(MainFrame,"Marks of  "+in+" are Students Sucessfully Entered",
    	   			    "Report Card",JOptionPane.INFORMATION_MESSAGE); 
    		
    			}
    	    
    		 	});
     	}

    		buttonback.setBounds(20, 30, 100, 30);
    		buttonback.addActionListener(new ActionListener() //this is for question paper
          	{
    			public void actionPerformed(ActionEvent e) 
    			{
    				ControlPanel.setVisible(false);
    				
    				ReportCardT QS=new ReportCardT();
    				QS.AddButton(MainFrame);
          	  
    			}
          	});

   
}
}





