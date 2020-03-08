package  testing;

import java.awt.Color;
import java.awt.*;
import java.awt.event.*;
import java.util.List;
import javax.swing.*;

public class my_topics_pl
{
	
	String data[][]= {
			          {"            ","               1    ","                                      ","","                                      'UNIT-1'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","   Preliminary Concepts:Reasons for Studying  Concepts of Programming Language                                "},		 
                      {"         2  ","                    ","          20-09-2019     ","","   Programming Domains      "},
                      {"         3  ","                    ","          20-09-2019     ","","   Language Categories                     "},
                      {"         4  ","                    ","          20-09-2019     ","","   Language Design Trade-offs                                                            "},
                      {"         5  ","                    ","          20-09-2019     ","","   Implementation Methods  	                     "},
                      {"         6  ","                    ","          20-09-2019     ","","   Programming Environments                                                             "},
                      {"         7  ","                    ","          20-09-2019     ","","   Evolution of major Programming Languages                                                             "},
                      {"         8  ","                    ","          20-09-2019     ","","   Describing Syntax and Semantics:General Problem of Describing Syntax			                                                              "},
                      {"         9  ","                    ","          20-09-2019     ","","   Formal Methods of Describing Syntax,Attribute Grammers,Describing the Meaning of Programs                                                    "},

                      {"            ","               2    ","                         ","","                                      'UNIT-2'                                	 "},
                      {"         1  ","                    ","          20-09-2019     ","","   Names,Binding,Type Checking and Scope:Names and Variables           		    	                     "},
                      {"         2  ","                    ","          20-09-2019     ","","   The concept of Binding                           "},
                      {"         3  ","                    ","          20-09-2019     ","","   Type Checking                                                "},
                      {"         4  ","                    ","          20-09-2019     ","","   Strong Typing ,Type Compatibility                                                  "},
                      {"         5  ","                    ","          20-09-2019     ","","   Scope and Lifetime                       "},	
                      {"         6  ","                    ","          20-09-2019     ","","   Referencing Environments                                "},
                      {"         7  ","                    ","          20-09-2019     ","","   Named Constants      "},
                      {"         8  ","                    ","          20-09-2019     ","","   Data Types:Primitive Datatypes,Character String Types,Array types,Associative types,Record Types,Pointer and Reference Types                                                            "},
                      {"         9  ","                    ","          20-09-2019     ","","   Expression and Assignment Statements:Arithmetic Expressions                                                           "},
                      {"         10 ","                    ","          20-09-2019     ","","   Overloaded Operators                                                             "},
                      {"         11 ","                    ","          20-09-2019     ","","   Type Conversions                                                           "},
                      {"         12 ","                    ","          20-09-2019     ","","   Relational and Boolean Expressions                                                           "},
                      {"         13 ","                    ","          20-09-2019     ","","   Short-Circuit Evaluation                                                           "},
                      {"         14 ","                    ","          20-09-2019     ","","   Assignment Statements                                                        "},
                      {"         15 ","                    ","          20-09-2019     ","","   Mixed mode Assignment                                                            "},

                      {"            ","               3    ","                         ","","                                      'UNIT-3'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","   Statement-Level Control Structure:Selection Statements,Iterative statements,Unconditional Branching                         "},		 
                      {"         2  ","                    ","          20-09-2019     ","","   Gaurded Commands                                "},
                      {"         3  ","                    ","          20-09-2019     ","","   SubPrograms:Fundamentals and Design Issues for SubPrograms                            "},
                      {"         4  ","                    ","          20-09-2019     ","","   Local Referencing Environments                       "},
                      {"         5  ","                    ","          20-09-2019     ","","   Overloaded Subprograms             	             "},
                      {"         6  ","                    ","          20-09-2019     ","","   Generic SubPrograms                             "},		 
                      {"         7  ","                    ","          20-09-2019     ","","   Design Issues for Functions                                "},
                      {"         8  ","                    ","          20-09-2019     ","","   User-Defined Overloaded Operators.                              "},
                      {"         9  ","                    ","          20-09-2019     ","","   Implementing SubPrograms:The Semantics of Calls and Returns                      "},
                      {"         10 ","                    ","          20-09-2019     ","","   Implementing 'Simple' Subprograms,Implementing Sub Programs with Stack-Dynamic Local Variables             	             "},
                      {"         11 ","                    ","          20-09-2019     ","","   Nested SubPrograms,Blocks             	             "},
                      {"         12 ","                    ","          20-09-2019     ","","   Implementing Dynamic Scoping            	             "},
                      {"         13 ","                    ","          20-09-2019     ","","   Abstract Data Types:The Concept of Abstraction         	             "},
                      {"         14 ","                    ","          20-09-2019     ","","   Introduction to Data Abstraction           	             "},
                      {"         15 ","                    ","          20-09-2019     ","","   Design Issues for ADT,Parameterized ADT            	             "},
                      {"         16 ","                    ","          20-09-2019     ","","   Encapsulation Constructs  and Naming Encapsulation             	             "},
                      {"         17 ","                    ","          20-09-2019     ","","   Paraneter Passing Technique             	             "},

                      {"            ","               4    ","                         ","","                                      'UNIT-4'                                   "},
                      {"         1  ","                    ","          20-09-2019     ","","   Object Oriented Programming:Design Issues          "},		 
                      {"         2  ","                    ","          20-09-2019     ","","   OOP in Smalltalk,C++,C#,Java,Ada 95,Ruby                                                         "},
                      {"         3  ","                    ","          20-09-2019     ","","   The Object Model of JavaScript                                                               "},		 
                      {"         4  ","                    ","          20-09-2019     ","","   Implementation of object oriented Constructs                                                                   "},
                      {"         5  ","                    ","          20-09-2019     ","","   Concurrency:SubProgram level Concurrency                                             "},		 
                      {"         6  ","                    ","          20-09-2019     ","","   Semaphores                                   "},
                      {"         7  ","                    ","          20-09-2019     ","","   Monitors,message Passing                                                          "},
                      {"         8  ","                    ","          20-09-2019     ","","   Ada support of Concurrency       "},		 
                      {"         9  ","                    ","          20-09-2019     ","","   Java threads                                                  "},
                      {"         10 ","                    ","          20-09-2019     ","","   C# threads                                                           "},		 
                      {"         11 ","                    ","          20-09-2019     ","","   Statement Level Concurrency                                                             "},
                      {"         12 ","                    ","          20-09-2019     ","","   Exception Handling and event Handling:Introduction to Exception Handling                                         "},		 
                      {"         13 ","                    ","          20-09-2019     ","","   Exception Handling in java ,c++ and Ada    "},		 
                      {"         14 ","                    ","          20-09-2019     ","","   Event Handling with Java                                                     "},
                    
                      {"            ","               5    ","                         ","","                                      'UNIT-5'                                	 "},
                      {"         1  ","                    ","          20-09-2019     ","","   Case Study:Python       		    	                                 "},
                      {"         2  ","                    ","          20-09-2019     ","","   Functional Programming Language:Introduction to mathematical Functions                           "},
                      {"         3  ","                    ","          20-09-2019     ","","   Fundamental of FSL,LISP                                               "},
                      {"         4  ","                    ","          20-09-2019     ","","   Introduction to Scheme                                                      "},
                      {"         5  ","                    ","          20-09-2019     ","","   COMMON LISP,ML,Haskell                                                    "},	
                      {"         6  ","                    ","          20-09-2019     ","","   Application of Functional Programming Languages                                                         "},
                      {"         7  ","                    ","          20-09-2019     ","","   Comparison of Functional and Imperative Languages          "},		 
                      {"         8  ","                    ","          20-09-2019     ","","   Logic Programming Languages:Introduction to Predicate Calculus                                                  "},
                      {"         9  ","                    ","          20-09-2019     ","","   Predicate Calculus and Proving Theorems                                                           "},		 
                      {"         10 ","                    ","          20-09-2019     ","","   An overview of Logic Programming                                                           "},
                      {"         11 ","                    ","          20-09-2019     ","","   The Origins Basic Elements and Deficiencesof Prolog                                             "},		 
                      {"         12 ","                    ","          20-09-2019     ","","   Application of Logic Programmming                                             "},		 
                      {"         13 ","                    ","          20-09-2019     ","","   Scripting Languages:Key concepts                                                              "},
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
							my_link_pl mp=new my_link_pl();
							int row=mytable.rowAtPoint(e.getPoint());
							int selectedindex=row;
							mp.HyperLink(selectedindex);
			
	
					}			
							
        	});

			return(mytable);
	}
}
	

