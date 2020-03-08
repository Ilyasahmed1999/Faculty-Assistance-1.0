package  testing;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;

public class my_topics_co
{
	
	String data[][]= {
			          {"                ","               1    ","                                      ","","                                      'UNIT-1'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","  Data Representation:Data types,Compliments                                     "},		 
                      {"         2  ","                    ","          20-09-2019     ","","  Types of Complements       "},
                      {"         3  ","                    ","          20-09-2019     ","","  Fixed and Floationg Point Representation                        "},
                      {"         4  ","                    ","          20-09-2019     ","","  Overview of Computer Function and Interconnection                                                              "},
                      {"         5  ","                    ","          20-09-2019     ","","  Bus Interconnection and Bus Structure     	                     "},
                      {"         6  ","                    ","          20-09-2019     ","","  Data Transfer    	                     "},                  
                      {"            ","               2    ","                         ","","                                      'UNIT-2'                                	 "},
                      {"         1  ","                    ","          20-09-2019     ","","  Register transfer Language,Register transfer                   		    	                     "},
                      {"         2  ","                    ","          20-09-2019     ","","  Bus and Memory Transfer                            "},
                      {"         3  ","                    ","          20-09-2019     ","","  Arithmetic Microoperations                                                   "},
                      {"         4  ","                    ","          20-09-2019     ","","  Arithmetic logic shift Unit                                                    "},
                      {"         5  ","                    ","          20-09-2019     ","","  Substractor,Binary increment ,arithmetic circuit                      "},	
                      {"         6  ","                    ","          20-09-2019     ","","  List of microoperations and hardware Implementaion"},
                      {"         7  ","                    ","          20-09-2019     ","","  Arithmetic logic shift unit       "},
                      {"         8  ","                    ","          20-09-2019     ","","  Basic computer organisation and design:Instruction codes:Stored program organisation      "},
                      {"         9  ","                    ","          20-09-2019     ","","  Indirect Address   "},
                      {"        10  ","                    ","          20-09-2019     ","","  Computer Registers       "},
                      {"        11  ","                    ","          20-09-2019     ","","  Common Bus System       "},
                      {"        12  ","                    ","          20-09-2019     ","","  Computer Instructions     "},
 
                      {"            ","               3    ","                         ","","                                      'UNIT-3'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","   Micro programmed control:Control Memory                                "},		 
                      {"         2  ","                    ","          20-09-2019     ","","   Address sequencing                                    "},
                      {"         3  ","                    ","          20-09-2019     ","","   Microprogram Example                             "},
                      {"         4  ","                    ","          20-09-2019     ","","   Design of Control Unit                           "},
                      {"         5  ","                    ","          20-09-2019     ","","   Central Processing Unit:Gneral Register Organisation             	             "},
                      {"         6  ","                    ","          20-09-2019     ","","   Instruction Formats                          "},
                      {"         7  ","                    ","          20-09-2019     ","","   Addressing modes                            "},
                      {"         8  ","                    ","          20-09-2019     ","","   Data transfer and Manipulation                           "},
                      {"         9  ","                    ","          20-09-2019     ","","   Program Control                             "},
                      {"         10 ","                    ","          20-09-2019     ","","   Computer Arithmetic: Addition and Substraction,Multiplication and Division                           "},
                      {"         12 ","                    ","          20-09-2019     ","","   Floating Point Arithmetic operations           "},

                      {"            ","               4    ","                         ","","                                      'UNIT-4'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","   Memory Organisation:Memory Heirarchy,Main Memory                                 "},		 
                      {"         2  ","                    ","          20-09-2019     ","","   RAM and ROM,Auxilary memory                                                      "},
                      {"         3  ","                    ","          20-09-2019     ","","   Associate memory,Cache Memory                                                                  "},		 
                      {"         4  ","                    ","          20-09-2019     ","","   Virtual Memory,Memory Management Hardware                                                                   "},
                      {"         5  ","                    ","          20-09-2019     ","","   Input Output Organisation:Input Output interface                                             "},		 
                      {"         6  ","                    ","          20-09-2019     ","","   I/O bus and interface modules                                 "},
                      {"         7  ","                    ","          20-09-2019     ","","   I/O versus memory bus                                                              "},
                      {"         5  ","                    ","          20-09-2019     ","","   Isolated vs Memory Mapped I/O          "},		 
                      {"         6  ","                    ","          20-09-2019     ","","   Asynchronous data Transfer:Strobe Control                                                     "},
                      {"         7  ","                    ","          20-09-2019     ","","   Hand Shaking Asynchronous serrial Transfer                                                                 "},		 
                      {"         8  ","                    ","          20-09-2019     ","","   Asynchronous communication interface                                                                   "},
                      {"         9  ","                    ","          20-09-2019     ","","   Modes of Transfer:Programmed I/O                                                "},		 
                      {"         10 ","                    ","          20-09-2019     ","","   Interrupt driven I/O priority Interrupt                                  "},
                      {"         11 ","                    ","          20-09-2019     ","","   Daisy Chairing                                                             "},
                      {"         12 ","                    ","          20-09-2019     ","","   Parallel Priority Interrupt          "},		 
                      {"         13 ","                    ","          20-09-2019     ","","   Priority Encoder                                                     "},
                      {"         14 ","                    ","          20-09-2019     ","","   Direct Memory Access:DMA controler and transfer                                                                  "},		 
                      {"         15 ","                    ","          20-09-2019     ","","   Input-Output Preprocessor(IOP):CPU-IOP communication                                                                  "},
                      {"         16 ","                    ","          20-09-2019     ","","   IBM370 I/O channel                                            "},		 
                      {"         17 ","                    ","          20-09-2019     ","","   Intel 8089-IOP                                  "},
                      {"         18 ","                    ","          20-09-2019     ","","   Serial Communication                                                             "},
                      {"            ","               5    ","                         ","","                                      'UNIT-5'                                	 "},
                      {"         1  ","                    ","          20-09-2019     ","","   Pipeline Processing:Aarithmetic ,Instruction and RISC pipelines               		    	                                 "},
                      {"         2  ","                    ","          20-09-2019     ","","   CPU performance ans its factors                             "},
                      {"         3  ","                    ","          20-09-2019     ","","   Evaluation  Performance                                                 "},
                      {"         4  ","                    ","          20-09-2019     ","","   Design of Control Unit                                                         "},
                      {"         5  ","                    ","          20-09-2019     ","","   Central Processing Unit:Gneral Register Organisation                                                         "},	
                      {"         6  ","                    ","          20-09-2019     ","","   Instructiton Formats                                                             "},
                      {"         7  ","                    ","          20-09-2019     ","","   Addressing modess                                                                      "},
                   };

  	String column[]= {"SNo","UNIT NO","Date","NoofClassesPlanned","  Topics"};
	JTable mytable=new JTable(data,column);
	
	JTable Table()
	{
		
			mytable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			mytable.getColumnModel().getColumn(0).setPreferredWidth(100);
			mytable.getColumnModel().getColumn(1).setPreferredWidth(150);
			mytable.getColumnModel().getColumn(2).setPreferredWidth(200);
			mytable.getColumnModel().getColumn(3).setPreferredWidth(150);
			mytable.getColumnModel().getColumn(4).setPreferredWidth(900);
			mytable.setRowHeight(30);
			mytable.setFont(new Font("Serif",Font.PLAIN,17));
			mytable.setEnabled(false);
  	
			mytable.addMouseListener(new MouseAdapter()
        	{
					public void mouseClicked(MouseEvent e)
					{
							my_link_co mp=new my_link_co();
							int row=mytable.rowAtPoint(e.getPoint());
							int selectedindex=row;
							mp.HyperLink(selectedindex);
			
	
					}			
							
        	});

			return(mytable);
	}
}
	

