package  testing;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;

public class my_topics_java
{
	
	String data[][]= {
			          {"            ","               1    ","                                      ","","                                      'UNIT-1'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","   Object Oriented System Development:Understanding OOD,Understanding Object Concepts,Benefits of OOD                             "},		 
                      {"         2  ","                    ","          20-09-2019     ","","   Java Programming Fundamentals:Introduction, Overview of Java     "},
                      {"         3  ","                    ","          20-09-2019     ","","   DataTypes,Variables and Arrays.                                                 "},
                      {"         4  ","                    ","          20-09-2019     ","","   Operators                                                              "},
                      {"         5  ","                    ","          20-09-2019     ","","   Control statements    	                     "},
                      {"         6  ","                    ","          20-09-2019     ","","   Clases,Methods                             "},		 
                      {"         7  ","                    ","          20-09-2019     ","","   Inheritance and Innerclass                             "},		 
                      {"         8  ","                    ","          20-09-2019     ","","   Packages                             "},		 
                      {"         9  ","                    ","          20-09-2019     ","","   Interfaces                            "},		 
                      {"            ","               2    ","                         ","","                                      'UNIT-2'                                	 "},
                      {"         1  ","                    ","          20-09-2019     ","","   I/O basics                 		    	                     "},
                      {"         2  ","                    ","          20-09-2019     ","","   Stream and Byte classes                            "},
                      {"         3  ","                    ","          20-09-2019     ","","   Character Streams                                                    "},
                      {"         4  ","                    ","          20-09-2019     ","","   Reading Console input and output                                                    "},
                      {"         5  ","                    ","          20-09-2019     ","","   Print Writer Class                        "},	
                      {"         6  ","                    ","          20-09-2019     ","","   String Handling                                 "},
                      {"         7  ","                    ","          20-09-2019     ","","   Exception Handling     "},
                      {"         8  ","                    ","          20-09-2019     ","","   Multithreaded Programming                              "},

                      {"            ","               3    ","                         ","","                                      'UNIT-3'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","   Exploring Java Language                               "},		 
                      {"         2  ","                    ","          20-09-2019     ","","   Collection Overview                       "},
                      {"         3  ","                    ","          20-09-2019     ","","   Collection Interfaces and Collection Classes                              "},
                      {"         4  ","                    ","          20-09-2019     ","","   Iterators                           "},
                      {"         5  ","                    ","          20-09-2019     ","","   Random Access Interface             	             "},
                      {"         6  ","                    ","          20-09-2019     ","","   Maps          "},		 
                      {"         7  ","                    ","          20-09-2019     ","","   Comparators                                                     "},
                      {"         8  ","                    ","          20-09-2019     ","","   Legacy classes and interfaces                                                                 "},		 
                      {"         9  ","                    ","          20-09-2019     ","","   String Tokenizer                                                                  "},
                      {"         10 ","                    ","          20-09-2019     ","","   BitSet,Date                                             "},		 
                      {"         11 ","                    ","          20-09-2019     ","","   Calender,Timer                                   "},
                   
                      {"            ","               4    ","                         ","","                                      'UNIT-4'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","   Introducing AWT working with Graphics:AWT classes,Working with Graphics          "},		 
                      {"         2  ","                    ","          20-09-2019     ","","   Event Handling:Two Event Handling Mechanism                                                 "},
                      {"         3  ","                    ","          20-09-2019     ","","   The Delegation Event Model                                                                 "},		 
                      {"         4  ","                    ","          20-09-2019     ","","   Event Classes                                                                 "},
                      {"         5  ","                    ","          20-09-2019     ","","   Source of Events                                             "},		 
                      {"         6  ","                    ","          20-09-2019     ","","   Event Listener Inerfaces                              "},
                      {"         7  ","                    ","          20-09-2019     ","","   AWT Controls:Control Fundamentals                                                            "},
                      {"         8  ","                    ","          20-09-2019     ","","   Using Buttons     "},		 
                      {"         9  ","                    ","          20-09-2019     ","","   Applying Check Boxes                                                   "},
                      {"        10  ","                    ","          20-09-2019     ","","   CheckBoxGroup                                                             "},		 
                      {"        11  ","                    ","          20-09-2019     ","","   Choice Controls                                                              "},
                      {"        12  ","                    ","          20-09-2019     ","","   Using Lists                                          "},		 
                      {"        13  ","                    ","          20-09-2019     ","","   Managing Scroll Bars                                 "},
                      {"        14  ","                    ","          20-09-2019     ","","   Using TextField                                                          "},
                      {"        15  ","                    ","          20-09-2019     ","","   Using TextArea         "},		 
                      {"        16  ","                    ","          20-09-2019     ","","   Understanding Layout Managers                                                    "},
                      {"        17  ","                    ","          20-09-2019     ","","   Menu bars and menus                                                             "},		 
                      {"        18  ","                    ","          20-09-2019     ","","   Dialog boxes,File Dialog                                                                "},
                      {"        19  ","                    ","          20-09-2019     ","","   Handling events by Extending AWT Component                                             "},		 
                      {"        20  ","                    ","          20-09-2019     ","","   Exploring the Controls                                   "},
                      {"        21  ","                    ","          20-09-2019     ","","   Menus and Layout Managers                                                             "},
                    
                      {"            ","               5    ","                         ","","                                      'UNIT-5'                                	 "},
                      {"         1  ","                    ","          20-09-2019     ","","   Introduction to Swing Package               		    	                                 "},
                      {"         2  ","                    ","          20-09-2019     ","","   Java I/O classes and Interfaces                                             "},
                      {"         3  ","                    ","          20-09-2019     ","","   Reading and Writing Files                                                 "},
                      {"         4  ","                    ","          20-09-2019     ","","   Serialization                                                        "},
                      {"         5  ","                    ","          20-09-2019     ","","   Introduction to Java Network Programming                                                       "},	
                      {"         6  ","                    ","          20-09-2019     ","","   Object Class                                                             "},
                      {"         7  ","                    ","          20-09-2019     ","","   Exploring Image Package                                                                   "},
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
							my_link_java mp=new my_link_java();
							int row=mytable.rowAtPoint(e.getPoint());
							int selectedindex=row;
							mp.HyperLink(selectedindex);
			
	
					}			
							
        	});

			return(mytable);
	}
}
	
