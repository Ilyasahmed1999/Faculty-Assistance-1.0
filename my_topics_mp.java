package  testing;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;

public class my_topics_mp
{
	
	String data[][]= {
			          {"            ","               1    ","                                      ","","                                      'UNIT-1'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","  8085 Architecture:Introduction to microprocessors                              "},		 
                      {"         2  ","                    ","          20-09-2019     ","","  8085 Processor Architecture,Internal Operations,Instructions and timings       "},
                      {"         3  ","                    ","          20-09-2019     ","","  Programming the 8085-Introduction to 8085 instructions                         "},
                      {"         4  ","                    ","          20-09-2019     ","","  Addressing modes                                                               "},
                      {"         5  ","                    ","          20-09-2019     ","","  Programming techniques with Additional instructions    	                     "},
                      {"            ","               2    ","                         ","","                                      'UNIT-2'                                	 "},
                      {"         1  ","                    ","          20-09-2019     ","","   Stacks and Subroutines                   		    	                     "},
                      {"         2  ","                    ","          20-09-2019     ","","   Interfacing Peripherals-Basic Interfacing Concepts                            "},
                      {"         3  ","                    ","          20-09-2019     ","","   Interfacing Input Keyboards                                                   "},
                      {"         4  ","                    ","          20-09-2019     ","","   Interrupts-8085 Interrupts                                                    "},
                      {"         5  ","                    ","          20-09-2019     ","","   Direct Memory Access(DMA)-DMA Controller(Intel 8257)                          "},	
                      {"         6  ","                    ","          20-09-2019     ","","   Programmable Interrupt Controller(Intel 8259)                                 "},
                      {"         7  ","                    ","          20-09-2019     ","","   Interfacing 8085 with Digital-to-Anolog and Anolog-to-Digital converters      "},
                      {"            ","               3    ","                         ","","                                      'UNIT-3'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","   Programmable Peripheral Interface (Intel 8255A)                               "},		 
                      {"         2  ","                    ","          20-09-2019     ","","   Programmable Communication Interface(8251A)                                   "},
                      {"         3  ","                    ","          20-09-2019     ","","   Programmable Interval Timer(Intel 8253 and 8254)                              "},
                      {"         4  ","                    ","          20-09-2019     ","","   Programmable  Keybord/Display Controller(Intel 8259)                          "},
                      {"         5  ","                    ","          20-09-2019     ","","   Serial and Parallel Bus Standards RS 232 C,IEEE 488             	             "},
                      {"            ","               4    ","                         ","","                                      'UNIT-4'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","   Introduction to 8086 Microprocessor:Architecture Pin Details of 8086          "},		 
                      {"         2  ","                    ","          20-09-2019     ","","   Minimum and Maximum Mode                                                      "},
                      {"         3  ","                    ","          20-09-2019     ","","   Segment Flags                                                                 "},		 
                      {"         4  ","                    ","          20-09-2019     ","","   Memory Banks                                                                  "},
                      {"         5  ","                     ","          20-09-2019     ","","   Interrupt and Interrupt Responses                                             "},		 
                      {"         6  ","                     ","          20-09-2019     ","","   Hardware and Software Interrupt applications                                  "},
                      {"         7  ","                     ","          20-09-2019     ","","   Interrupt Example                                                             "},
                    
                      {"            ","               5    ","                         ","","                                      'UNIT-5'                                	 "},
                      {"         1  ","                    ","          20-09-2019     ","","    Addressing modes              		    	                                 "},
                      {"         2  ","                    ","          20-09-2019     ","","    Instruction set of 98086 and assembler directives                            "},
                      {"         3  ","                    ","          20-09-2019     ","","    Assembly Language Programming                                                "},
                      {"         4  ","                    ","          20-09-2019     ","","    Modular Programming                                                          "},
                      {"         5  ","                    ","          20-09-2019     ","","    Linking and Relocation                                                       "},	
                      {"         6  ","                    ","          20-09-2019     ","","    Stacks procedures                                                            "},
                      {"         7  ","                    ","          20-09-2019     ","","     Macros                                                                      "},
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
							my_link_mp mp=new my_link_mp();
							int row=mytable.rowAtPoint(e.getPoint());
							int selectedindex=row;
							mp.HyperLink(selectedindex);
			
	
					}			
							
        	});

			return(mytable);
	}
}
	

